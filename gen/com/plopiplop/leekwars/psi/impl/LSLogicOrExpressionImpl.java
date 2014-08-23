// This is a generated file. Not intended for manual editing.
package com.plopiplop.leekwars.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.plopiplop.leekwars.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.plopiplop.leekwars.psi.LSTypes.OP_LOGICAL_OR;
import static com.plopiplop.leekwars.psi.LSTypes.OP_OR;

public class LSLogicOrExpressionImpl extends ASTWrapperPsiElement implements LSLogicOrExpression {

    public LSLogicOrExpressionImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof LSVisitor) ((LSVisitor) visitor).visitLogicOrExpression(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<LSAdditiveExpression> getAdditiveExpressionList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, LSAdditiveExpression.class);
    }

    @Override
    @NotNull
    public List<LSBitwiseExpression> getBitwiseExpressionList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, LSBitwiseExpression.class);
    }

    @Override
    @NotNull
    public List<LSCompareExpression> getCompareExpressionList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, LSCompareExpression.class);
    }

    @Override
    @NotNull
    public List<LSLogicAndExpression> getLogicAndExpressionList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, LSLogicAndExpression.class);
    }

    @Override
    @Nullable
    public LSLogicOrExpression getLogicOrExpression() {
        return findChildByClass(LSLogicOrExpression.class);
    }

    @Override
    @NotNull
    public List<LSMultiplicativeExpression> getMultiplicativeExpressionList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, LSMultiplicativeExpression.class);
    }

    @Override
    @NotNull
    public List<LSPrefixExpression> getPrefixExpressionList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, LSPrefixExpression.class);
    }

    @Override
    @NotNull
    public List<LSShiftExpression> getShiftExpressionList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, LSShiftExpression.class);
    }

    @Override
    @Nullable
    public PsiElement getOpLogicalOr() {
        return findChildByType(OP_LOGICAL_OR);
    }

    @Override
    @Nullable
    public PsiElement getOpOr() {
        return findChildByType(OP_OR);
    }

}
