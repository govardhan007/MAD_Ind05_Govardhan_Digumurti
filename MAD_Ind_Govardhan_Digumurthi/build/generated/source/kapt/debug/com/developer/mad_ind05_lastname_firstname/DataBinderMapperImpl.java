package com.developer.mad_ind05_lastname_firstname;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.developer.mad_ind05_lastname_firstname.databinding.ActivityDetailsBindingImpl;
import com.developer.mad_ind05_lastname_firstname.databinding.ActivityMainBindingImpl;
import com.developer.mad_ind05_lastname_firstname.databinding.StateNameNickNameItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDETAILS = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_STATENAMENICKNAMEITEM = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.developer.mad_ind05_lastname_firstname.R.layout.activity_details, LAYOUT_ACTIVITYDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.developer.mad_ind05_lastname_firstname.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.developer.mad_ind05_lastname_firstname.R.layout.state_name_nick_name_item, LAYOUT_STATENAMENICKNAMEITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDETAILS: {
          if ("layout/activity_details_0".equals(tag)) {
            return new ActivityDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_STATENAMENICKNAMEITEM: {
          if ("layout/state_name_nick_name_item_0".equals(tag)) {
            return new StateNameNickNameItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for state_name_nick_name_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "clickListener");
      sKeys.put(2, "state");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_details_0", com.developer.mad_ind05_lastname_firstname.R.layout.activity_details);
      sKeys.put("layout/activity_main_0", com.developer.mad_ind05_lastname_firstname.R.layout.activity_main);
      sKeys.put("layout/state_name_nick_name_item_0", com.developer.mad_ind05_lastname_firstname.R.layout.state_name_nick_name_item);
    }
  }
}
