package com.athbk.avatarview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.athbk.avatarview.utils.ItemTouchHelperViewHolder;

/**
 * Created by athbk on 5/26/17.
 */

public abstract class ItemVH extends RecyclerView.ViewHolder implements ItemTouchHelperViewHolder {


    public ItemVH(View itemView) {
        super(itemView);
    }

    @Override
    public void onItemSelected() {

    }

    @Override
    public void onItemClear() {

    }
}
