// Generated by view binder compiler. Do not edit!
package com.teambo.kolberempahriah.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.teambo.kolberempahriah.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSettingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final SwitchCompat darkModeSwitch;

  @NonNull
  public final TextView tvDarkModeSetting;

  private FragmentSettingBinding(@NonNull ConstraintLayout rootView,
      @NonNull SwitchCompat darkModeSwitch, @NonNull TextView tvDarkModeSetting) {
    this.rootView = rootView;
    this.darkModeSwitch = darkModeSwitch;
    this.tvDarkModeSetting = tvDarkModeSetting;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_setting, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSettingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dark_mode_switch;
      SwitchCompat darkModeSwitch = ViewBindings.findChildViewById(rootView, id);
      if (darkModeSwitch == null) {
        break missingId;
      }

      id = R.id.tv_dark_mode_setting;
      TextView tvDarkModeSetting = ViewBindings.findChildViewById(rootView, id);
      if (tvDarkModeSetting == null) {
        break missingId;
      }

      return new FragmentSettingBinding((ConstraintLayout) rootView, darkModeSwitch,
          tvDarkModeSetting);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
