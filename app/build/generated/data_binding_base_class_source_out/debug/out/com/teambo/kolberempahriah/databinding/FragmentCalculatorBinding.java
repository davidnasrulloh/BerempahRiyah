// Generated by view binder compiler. Do not edit!
package com.teambo.kolberempahriah.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.teambo.kolberempahriah.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCalculatorBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button bu0;

  @NonNull
  public final Button bu1;

  @NonNull
  public final Button bu2;

  @NonNull
  public final Button bu3;

  @NonNull
  public final Button bu4;

  @NonNull
  public final Button bu5;

  @NonNull
  public final Button bu6;

  @NonNull
  public final Button bu7;

  @NonNull
  public final Button bu8;

  @NonNull
  public final Button bu9;

  @NonNull
  public final Button buAC;

  @NonNull
  public final Button buDiv;

  @NonNull
  public final Button buDot;

  @NonNull
  public final Button buEq;

  @NonNull
  public final Button buMul;

  @NonNull
  public final Button buPer;

  @NonNull
  public final Button buPlusMinus;

  @NonNull
  public final Button buSub;

  @NonNull
  public final Button buSum;

  @NonNull
  public final EditText etShowNumber;

  private FragmentCalculatorBinding(@NonNull LinearLayout rootView, @NonNull Button bu0,
      @NonNull Button bu1, @NonNull Button bu2, @NonNull Button bu3, @NonNull Button bu4,
      @NonNull Button bu5, @NonNull Button bu6, @NonNull Button bu7, @NonNull Button bu8,
      @NonNull Button bu9, @NonNull Button buAC, @NonNull Button buDiv, @NonNull Button buDot,
      @NonNull Button buEq, @NonNull Button buMul, @NonNull Button buPer,
      @NonNull Button buPlusMinus, @NonNull Button buSub, @NonNull Button buSum,
      @NonNull EditText etShowNumber) {
    this.rootView = rootView;
    this.bu0 = bu0;
    this.bu1 = bu1;
    this.bu2 = bu2;
    this.bu3 = bu3;
    this.bu4 = bu4;
    this.bu5 = bu5;
    this.bu6 = bu6;
    this.bu7 = bu7;
    this.bu8 = bu8;
    this.bu9 = bu9;
    this.buAC = buAC;
    this.buDiv = buDiv;
    this.buDot = buDot;
    this.buEq = buEq;
    this.buMul = buMul;
    this.buPer = buPer;
    this.buPlusMinus = buPlusMinus;
    this.buSub = buSub;
    this.buSum = buSum;
    this.etShowNumber = etShowNumber;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCalculatorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCalculatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_calculator, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCalculatorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bu0;
      Button bu0 = ViewBindings.findChildViewById(rootView, id);
      if (bu0 == null) {
        break missingId;
      }

      id = R.id.bu1;
      Button bu1 = ViewBindings.findChildViewById(rootView, id);
      if (bu1 == null) {
        break missingId;
      }

      id = R.id.bu2;
      Button bu2 = ViewBindings.findChildViewById(rootView, id);
      if (bu2 == null) {
        break missingId;
      }

      id = R.id.bu3;
      Button bu3 = ViewBindings.findChildViewById(rootView, id);
      if (bu3 == null) {
        break missingId;
      }

      id = R.id.bu4;
      Button bu4 = ViewBindings.findChildViewById(rootView, id);
      if (bu4 == null) {
        break missingId;
      }

      id = R.id.bu5;
      Button bu5 = ViewBindings.findChildViewById(rootView, id);
      if (bu5 == null) {
        break missingId;
      }

      id = R.id.bu6;
      Button bu6 = ViewBindings.findChildViewById(rootView, id);
      if (bu6 == null) {
        break missingId;
      }

      id = R.id.bu7;
      Button bu7 = ViewBindings.findChildViewById(rootView, id);
      if (bu7 == null) {
        break missingId;
      }

      id = R.id.bu8;
      Button bu8 = ViewBindings.findChildViewById(rootView, id);
      if (bu8 == null) {
        break missingId;
      }

      id = R.id.bu9;
      Button bu9 = ViewBindings.findChildViewById(rootView, id);
      if (bu9 == null) {
        break missingId;
      }

      id = R.id.buAC;
      Button buAC = ViewBindings.findChildViewById(rootView, id);
      if (buAC == null) {
        break missingId;
      }

      id = R.id.buDiv;
      Button buDiv = ViewBindings.findChildViewById(rootView, id);
      if (buDiv == null) {
        break missingId;
      }

      id = R.id.buDot;
      Button buDot = ViewBindings.findChildViewById(rootView, id);
      if (buDot == null) {
        break missingId;
      }

      id = R.id.buEq;
      Button buEq = ViewBindings.findChildViewById(rootView, id);
      if (buEq == null) {
        break missingId;
      }

      id = R.id.buMul;
      Button buMul = ViewBindings.findChildViewById(rootView, id);
      if (buMul == null) {
        break missingId;
      }

      id = R.id.buPer;
      Button buPer = ViewBindings.findChildViewById(rootView, id);
      if (buPer == null) {
        break missingId;
      }

      id = R.id.buPlusMinus;
      Button buPlusMinus = ViewBindings.findChildViewById(rootView, id);
      if (buPlusMinus == null) {
        break missingId;
      }

      id = R.id.buSub;
      Button buSub = ViewBindings.findChildViewById(rootView, id);
      if (buSub == null) {
        break missingId;
      }

      id = R.id.buSum;
      Button buSum = ViewBindings.findChildViewById(rootView, id);
      if (buSum == null) {
        break missingId;
      }

      id = R.id.etShowNumber;
      EditText etShowNumber = ViewBindings.findChildViewById(rootView, id);
      if (etShowNumber == null) {
        break missingId;
      }

      return new FragmentCalculatorBinding((LinearLayout) rootView, bu0, bu1, bu2, bu3, bu4, bu5,
          bu6, bu7, bu8, bu9, buAC, buDiv, buDot, buEq, buMul, buPer, buPlusMinus, buSub, buSum,
          etShowNumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
