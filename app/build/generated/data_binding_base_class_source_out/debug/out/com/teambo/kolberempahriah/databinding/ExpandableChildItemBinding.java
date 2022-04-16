// Generated by view binder compiler. Do not edit!
package com.teambo.kolberempahriah.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.teambo.kolberempahriah.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ExpandableChildItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView arroImageview;

  @NonNull
  public final RecyclerView childRv;

  @NonNull
  public final RelativeLayout expandableLayout;

  @NonNull
  public final TextView itemTv;

  @NonNull
  public final LinearLayout linearLayout;

  private ExpandableChildItemBinding(@NonNull CardView rootView, @NonNull ImageView arroImageview,
      @NonNull RecyclerView childRv, @NonNull RelativeLayout expandableLayout,
      @NonNull TextView itemTv, @NonNull LinearLayout linearLayout) {
    this.rootView = rootView;
    this.arroImageview = arroImageview;
    this.childRv = childRv;
    this.expandableLayout = expandableLayout;
    this.itemTv = itemTv;
    this.linearLayout = linearLayout;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ExpandableChildItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExpandableChildItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.expandable_child_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExpandableChildItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.arro_imageview;
      ImageView arroImageview = ViewBindings.findChildViewById(rootView, id);
      if (arroImageview == null) {
        break missingId;
      }

      id = R.id.child_rv;
      RecyclerView childRv = ViewBindings.findChildViewById(rootView, id);
      if (childRv == null) {
        break missingId;
      }

      id = R.id.expandable_layout;
      RelativeLayout expandableLayout = ViewBindings.findChildViewById(rootView, id);
      if (expandableLayout == null) {
        break missingId;
      }

      id = R.id.itemTv;
      TextView itemTv = ViewBindings.findChildViewById(rootView, id);
      if (itemTv == null) {
        break missingId;
      }

      id = R.id.linear_layout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      return new ExpandableChildItemBinding((CardView) rootView, arroImageview, childRv,
          expandableLayout, itemTv, linearLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}