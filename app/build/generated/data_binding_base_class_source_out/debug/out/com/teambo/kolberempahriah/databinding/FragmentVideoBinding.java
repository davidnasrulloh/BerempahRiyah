// Generated by view binder compiler. Do not edit!
package com.teambo.kolberempahriah.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.teambo.kolberempahriah.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentVideoBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextInputLayout edtLayoutSearch;

  @NonNull
  public final TextInputEditText edtSearch;

  @NonNull
  public final ImageView imgFilterVideoList;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final RecyclerView rvVideoDataList;

  private FragmentVideoBinding(@NonNull LinearLayout rootView,
      @NonNull TextInputLayout edtLayoutSearch, @NonNull TextInputEditText edtSearch,
      @NonNull ImageView imgFilterVideoList, @NonNull LinearLayout linearLayout,
      @NonNull RecyclerView rvVideoDataList) {
    this.rootView = rootView;
    this.edtLayoutSearch = edtLayoutSearch;
    this.edtSearch = edtSearch;
    this.imgFilterVideoList = imgFilterVideoList;
    this.linearLayout = linearLayout;
    this.rvVideoDataList = rvVideoDataList;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentVideoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_video, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentVideoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edt_layout_search;
      TextInputLayout edtLayoutSearch = ViewBindings.findChildViewById(rootView, id);
      if (edtLayoutSearch == null) {
        break missingId;
      }

      id = R.id.edt_search;
      TextInputEditText edtSearch = ViewBindings.findChildViewById(rootView, id);
      if (edtSearch == null) {
        break missingId;
      }

      id = R.id.img_filter_video_list;
      ImageView imgFilterVideoList = ViewBindings.findChildViewById(rootView, id);
      if (imgFilterVideoList == null) {
        break missingId;
      }

      id = R.id.linear_layout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.rv_video_data_list;
      RecyclerView rvVideoDataList = ViewBindings.findChildViewById(rootView, id);
      if (rvVideoDataList == null) {
        break missingId;
      }

      return new FragmentVideoBinding((LinearLayout) rootView, edtLayoutSearch, edtSearch,
          imgFilterVideoList, linearLayout, rvVideoDataList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
