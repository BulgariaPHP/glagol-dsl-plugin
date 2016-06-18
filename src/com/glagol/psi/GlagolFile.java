package com.glagol.psi;

import com.glagol.GlagolFileType;
import com.glagol.GlagolLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import javax.swing.*;
import org.jetbrains.annotations.NotNull;

public class GlagolFile extends PsiFileBase {
    public GlagolFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, GlagolLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return GlagolFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Glagol file";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}