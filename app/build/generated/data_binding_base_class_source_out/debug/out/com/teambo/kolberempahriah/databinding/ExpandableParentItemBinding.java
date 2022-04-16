// Generated by view binder compiler. Do not edit!
package com.teambo.kolberempahriah.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.teambo.kolberempahriah.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ExpandableParentItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView nestedItemTv;

  private ExpandableParentItemBinding(@NonNull CardView rootView, @NonNull CardView cardView,
      @NonNull TextView nestedItemTv) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.nestedItemTv = nestedItemTv;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ExpandableParentItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExpandableParentItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.expandable_parent_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExpandableParentItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardView = (CardView) rootView;

      id = R.id.nestedItemTv;
      TextView nestedItemTv = ViewBindings.findChildViewById(rootView, id);
      if (nestedItemTv == null) {
        break missingId;
      }

      return new ExpandableParentItemBinding((CardView) rootView, cardView, nestedItemTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
