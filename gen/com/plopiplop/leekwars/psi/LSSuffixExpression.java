// This is a generated file. Not intended for manual editing.
package com.plopiplop.leekwars.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface LSSuffixExpression extends PsiElement {

    @Nullable
    LSMemberExpression getMemberExpression();

    @Nullable
    LSMethodCall getMethodCall();

    @Nullable
    LSSuffixExpression getSuffixExpression();

  @Nullable
  PsiElement getOpDec();

  @Nullable
  PsiElement getOpInc();

}
