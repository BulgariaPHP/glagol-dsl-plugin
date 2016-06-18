package com.glagol;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.swing.*;

public class GlagolFileType extends LanguageFileType {
    public static final GlagolFileType INSTANCE = new GlagolFileType();

    private GlagolFileType() {
        super(GlagolLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Glagol file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Glagol DSL source file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "g";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return GlagolIcons.FILE;
    }
}