package com.glagol.contributor;

import com.glagol.contributor.util.SuggestionOptions;
import com.glagol.psi.GlagolTypes;
import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.project.DumbAware;
import com.intellij.patterns.PatternCondition;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import com.intellij.util.containers.HashMap;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import static com.intellij.patterns.PlatformPatterns.psiElement;

public class AnnotationCompletionContributor extends CompletionContributor implements DumbAware {

    private HashMap<String, SuggestionOptions> annotationKeys = new HashMap<String, SuggestionOptions>() {{
        put("table", new SuggestionOptions("=\"\"", 2));
        put("doc", new SuggestionOptions("=\"\"", 2));
        put("index", new SuggestionOptions("", 0));
        put("field", new SuggestionOptions("()", 1));
        put("autofind", new SuggestionOptions("", 0));
        put("autofill", new SuggestionOptions("", 0));
    }};

    public AnnotationCompletionContributor() {
        extend(CompletionType.BASIC, psiElement().afterLeaf(
                psiElement().withText("@")
        ),
                new CompletionProvider<CompletionParameters>() {
            @Override
            protected void addCompletions(@NotNull CompletionParameters completionParameters,
                                          ProcessingContext processingContext,
                                          @NotNull CompletionResultSet completionResultSet) {

                suggestionsWithInsertHandler(completionResultSet, annotationKeys);
            }
        });
        extend(CompletionType.BASIC, psiElement().afterLeafSkipping(
                psiElement().whitespaceCommentEmptyOrError(),
                psiElement().with(new PatternCondition<PsiElement>("keyAutocomplete") {
                    @Override
                    public boolean accepts(@NotNull PsiElement psiElement, ProcessingContext processingContext) {
                        return psiElement.getPrevSibling() != null && Objects.equals(psiElement.getPrevSibling().getText(), "key");
                    }
                })
                ),
                new CompletionProvider<CompletionParameters>() {
                    @Override
                    protected void addCompletions(@NotNull CompletionParameters completionParameters,
                                                  ProcessingContext processingContext,
                                                  @NotNull CompletionResultSet completionResultSet) {
                        for (String suggestion : new String[]{"primary"}) {
                            completionResultSet.addElement(LookupElementBuilder.create(suggestion));
                        }
                    }
                });
        extend(CompletionType.BASIC, psiElement().afterLeafSkipping(
                psiElement().whitespaceCommentEmptyOrError(),
                psiElement().with(new PatternCondition<PsiElement>("sequenceAutocomplete") {
                    @Override
                    public boolean accepts(@NotNull PsiElement psiElement, ProcessingContext processingContext) {
                        return psiElement.getPrevSibling() != null && Objects.equals(psiElement.getPrevSibling().getText(), "sequence");
                    }
                })
                ),
                new CompletionProvider<CompletionParameters>() {
                    @Override
                    protected void addCompletions(@NotNull CompletionParameters completionParameters,
                                                  ProcessingContext processingContext,
                                                  @NotNull CompletionResultSet completionResultSet) {
                        for (String suggestion : new String[]{"true", "false"}) {
                            completionResultSet.addElement(LookupElementBuilder.create(suggestion));
                        }
                    }
                });
    }

    private void suggestionsWithInsertHandler(@NotNull CompletionResultSet completionResultSet,
                                              HashMap<String, SuggestionOptions> suggestionsMap) {
        for (String suggestion : suggestionsMap.keySet()) {
            LookupElementBuilder field = LookupElementBuilder.create(suggestion);
            SuggestionOptions settings = suggestionsMap.get(suggestion);
            completionResultSet.addElement(field.withInsertHandler((context, lookupElement) -> {
                CaretModel caretModel = context.getEditor().getCaretModel();
                int offset = caretModel.getOffset();
                context.getEditor().getDocument().insertString(
                        offset, settings.getSuffix());
                caretModel.moveToOffset(offset + settings.getOffsetMove());
            }));
        }
    }

    @Override
    public boolean invokeAutoPopup(@NotNull PsiElement position, char typeChar) {
        return typeChar != ',';
    }
}
