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

public final class ItemListMateriHomeBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView tvTitleMateriListHome;

  private ItemListMateriHomeBinding(@NonNull CardView rootView,
      @NonNull TextView tvTitleMateriListHome) {
    this.rootView = rootView;
    this.tvTitleMateriListHome = tvTitleMateriListHome;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemListMateriHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemListMateriHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_list_materi_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemListMateriHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_title_materi_list_home;
      TextView tvTitleMateriListHome = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleMateriListHome == null) {
        break missingId;
      }

      return new ItemListMateriHomeBinding((CardView) rootView, tvTitleMateriListHome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
