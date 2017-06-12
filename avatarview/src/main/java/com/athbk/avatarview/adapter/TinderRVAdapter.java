package com.athbk.avatarview.adapter;

import android.support.v4.view.MotionEventCompat;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;


import com.athbk.avatarview.utils.ItemTouchHelperAdapter;
import com.athbk.avatarview.utils.OnStartDragListener;

import java.util.Collections;
import java.util.List;

/**
 * Created by athbk on 5/26/17.
 */

public abstract class TinderRVAdapter<T, VH extends ItemVH> extends RecyclerView.Adapter<VH> implements ItemTouchHelperAdapter {

    protected abstract List<T> getListItem();
    protected abstract VH onCreateItemViewHolder(ViewGroup parent, int viewType);
    protected abstract void onBindItemViewHolder(final VH holder, int position);

    private OnStartDragListener mDragStartListener;

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return onCreateItemViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(final VH holder, int position) {
        onBindItemViewHolder(holder, position);
//        holder.itemView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                if (MotionEventCompat.getActionMasked(event) == MotionEvent.ACTION_DOWN) {
//                    mDragStartListener.onStartDrag(holder);
//                }
//                return false;
//            }
//        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                mDragStartListener.onStartDrag(holder);
                return false;
            }
        });

    }

    @Override
    public int getItemCount() {
        if (getListItem() == null) return 0;
        return getListItem().size();
    }

    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {
        if (getListItem() == null) return false;
        Collections.swap(getListItem(), fromPosition, toPosition);
        if (toPosition == 0 || toPosition == 1){
            notifyDataSetChanged();
        }
        else {
            notifyItemMoved(fromPosition, toPosition);
        }
        return true;
    }

    @Override
    public void onItemDismiss(int position) {
        if (getListItem() == null) return;
        getListItem().remove(position);
        notifyItemRemoved(position);
    }

    public void setDragStartListener(OnStartDragListener mDragStartListener) {
        this.mDragStartListener = mDragStartListener;
    }
}
