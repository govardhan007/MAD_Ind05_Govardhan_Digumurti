package com.developer.mad_ind05_lastname_firstname.databinding;
import com.developer.mad_ind05_lastname_firstname.R;
import com.developer.mad_ind05_lastname_firstname.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailsBindingImpl extends ActivityDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.area.setTag(null);
        this.flag.setTag(null);
        this.map.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.state == variableId) {
            setState((com.developer.mad_ind05_lastname_firstname.data.StateData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setState(@Nullable com.developer.mad_ind05_lastname_firstname.data.StateData State) {
        this.mState = State;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.state);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String stateName = null;
        int stateAreaPic = 0;
        int stateFlag = 0;
        com.developer.mad_ind05_lastname_firstname.data.StateData state = mState;
        java.lang.String stateArea = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (state != null) {
                    // read state.name
                    stateName = state.getName();
                    // read state.areaPic
                    stateAreaPic = state.getAreaPic();
                    // read state.flag
                    stateFlag = state.getFlag();
                    // read state.area
                    stateArea = state.getArea();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.area, stateArea);
            com.developer.mad_ind05_lastname_firstname.utils.BindingAdaptersKt.loadPic(this.flag, stateFlag);
            com.developer.mad_ind05_lastname_firstname.utils.BindingAdaptersKt.loadPic(this.map, stateAreaPic);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, stateName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): state
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}