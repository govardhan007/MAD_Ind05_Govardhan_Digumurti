package com.developer.mad_ind05_lastname_firstname.databinding;
import com.developer.mad_ind05_lastname_firstname.R;
import com.developer.mad_ind05_lastname_firstname.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class StateNameNickNameItemBindingImpl extends StateNameNickNameItemBinding implements com.developer.mad_ind05_lastname_firstname.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.border, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public StateNameNickNameItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private StateNameNickNameItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.stateName.setTag(null);
        this.stateNickName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.developer.mad_ind05_lastname_firstname.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.clickListener == variableId) {
            setClickListener((com.developer.mad_ind05_lastname_firstname.ui.home.StateListener) variable);
        }
        else if (BR.state == variableId) {
            setState((com.developer.mad_ind05_lastname_firstname.data.StateData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListener(@Nullable com.developer.mad_ind05_lastname_firstname.ui.home.StateListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setState(@Nullable com.developer.mad_ind05_lastname_firstname.data.StateData State) {
        this.mState = State;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        java.lang.String StateName1 = null;
        com.developer.mad_ind05_lastname_firstname.ui.home.StateListener clickListener = mClickListener;
        java.lang.String StateNickName1 = null;
        com.developer.mad_ind05_lastname_firstname.data.StateData state = mState;

        if ((dirtyFlags & 0x6L) != 0) {



                if (state != null) {
                    // read state.name
                    StateName1 = state.getName();
                    // read state.nickName
                    StateNickName1 = state.getNickName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.stateName, StateName1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.stateNickName, StateNickName1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // clickListener
        com.developer.mad_ind05_lastname_firstname.ui.home.StateListener clickListener = mClickListener;
        // clickListener != null
        boolean clickListenerJavaLangObjectNull = false;
        // state
        com.developer.mad_ind05_lastname_firstname.data.StateData state = mState;



        clickListenerJavaLangObjectNull = (clickListener) != (null);
        if (clickListenerJavaLangObjectNull) {



            clickListener.onClick(state);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListener
        flag 1 (0x2L): state
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}