// This is a generated file. Not intended for manual editing.
package com.plopiplop.leekwars.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.plopiplop.leekwars.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LSVariableStatementImpl extends ASTWrapperPsiElement implements LSVariableStatement {

  public LSVariableStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LSVisitor) ((LSVisitor)visitor).visitVariableStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LSEos getEos() {
    return findChildByClass(LSEos.class);
  }

  @Override
  @NotNull
  public LSModifier getModifier() {
    return findNotNullChildByClass(LSModifier.class);
  }

  @Override
  @NotNull
  public List<LSVariableDeclaration> getVariableDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LSVariableDeclaration.class);
  }

  public boolean isGlobal() {
    return LSPsiImplUtil.isGlobal(this);
  }

}
