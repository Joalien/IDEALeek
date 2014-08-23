// This is a generated file. Not intended for manual editing.
package com.plopiplop.leekwars.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.plopiplop.leekwars.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LSSingleExpressionImpl extends ASTWrapperPsiElement implements LSSingleExpression {

  public LSSingleExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LSVisitor) ((LSVisitor)visitor).visitSingleExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LSAdditiveExpression getAdditiveExpression() {
      return findChildByClass(LSAdditiveExpression.class);
  }

  @Override
  @Nullable
  public LSAssignExpression getAssignExpression() {
      return findChildByClass(LSAssignExpression.class);
  }

  @Override
  @Nullable
  public LSBitwiseExpression getBitwiseExpression() {
      return findChildByClass(LSBitwiseExpression.class);
  }

  @Override
  @Nullable
  public LSCompareExpression getCompareExpression() {
      return findChildByClass(LSCompareExpression.class);
  }

  @Override
  @Nullable
  public LSLogicAndExpression getLogicAndExpression() {
      return findChildByClass(LSLogicAndExpression.class);
  }

  @Override
  @Nullable
  public LSLogicOrExpression getLogicOrExpression() {
      return findChildByClass(LSLogicOrExpression.class);
  }

  @Override
  @Nullable
  public LSMultiplicativeExpression getMultiplicativeExpression() {
      return findChildByClass(LSMultiplicativeExpression.class);
  }

  @Override
  @Nullable
  public LSPrefixExpression getPrefixExpression() {
      return findChildByClass(LSPrefixExpression.class);
  }

  @Override
  @Nullable
  public LSShiftExpression getShiftExpression() {
      return findChildByClass(LSShiftExpression.class);
  }

  @Override
  @Nullable
  public LSTernaryExpression getTernaryExpression() {
      return findChildByClass(LSTernaryExpression.class);
  }

}
