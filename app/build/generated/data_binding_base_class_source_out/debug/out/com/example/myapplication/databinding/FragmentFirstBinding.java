// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFirstBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button Location;

  @NonNull
  public final Button buttonFirst;

  @NonNull
  public final Button buttonSecond;

  @NonNull
  public final ImageView imageview;

  @NonNull
  public final Button order;

  @NonNull
  public final TextView t1;

  @NonNull
  public final TextView t2;

  @NonNull
  public final TextView t3;

  @NonNull
  public final TextView t4;

  @NonNull
  public final TextView t5;

  private FragmentFirstBinding(@NonNull ConstraintLayout rootView, @NonNull Button Location,
      @NonNull Button buttonFirst, @NonNull Button buttonSecond, @NonNull ImageView imageview,
      @NonNull Button order, @NonNull TextView t1, @NonNull TextView t2, @NonNull TextView t3,
      @NonNull TextView t4, @NonNull TextView t5) {
    this.rootView = rootView;
    this.Location = Location;
    this.buttonFirst = buttonFirst;
    this.buttonSecond = buttonSecond;
    this.imageview = imageview;
    this.order = order;
    this.t1 = t1;
    this.t2 = t2;
    this.t3 = t3;
    this.t4 = t4;
    this.t5 = t5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_first, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFirstBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Location;
      Button Location = rootView.findViewById(id);
      if (Location == null) {
        break missingId;
      }

      id = R.id.button_first;
      Button buttonFirst = rootView.findViewById(id);
      if (buttonFirst == null) {
        break missingId;
      }

      id = R.id.button_second;
      Button buttonSecond = rootView.findViewById(id);
      if (buttonSecond == null) {
        break missingId;
      }

      id = R.id.imageview;
      ImageView imageview = rootView.findViewById(id);
      if (imageview == null) {
        break missingId;
      }

      id = R.id.order;
      Button order = rootView.findViewById(id);
      if (order == null) {
        break missingId;
      }

      id = R.id.t1;
      TextView t1 = rootView.findViewById(id);
      if (t1 == null) {
        break missingId;
      }

      id = R.id.t2;
      TextView t2 = rootView.findViewById(id);
      if (t2 == null) {
        break missingId;
      }

      id = R.id.t3;
      TextView t3 = rootView.findViewById(id);
      if (t3 == null) {
        break missingId;
      }

      id = R.id.t4;
      TextView t4 = rootView.findViewById(id);
      if (t4 == null) {
        break missingId;
      }

      id = R.id.t5;
      TextView t5 = rootView.findViewById(id);
      if (t5 == null) {
        break missingId;
      }

      return new FragmentFirstBinding((ConstraintLayout) rootView, Location, buttonFirst,
          buttonSecond, imageview, order, t1, t2, t3, t4, t5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
