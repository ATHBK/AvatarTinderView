package com.athbk.changeavtarliketinder;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.athbk.avatarview.adapter.ItemVH;
import com.athbk.avatarview.adapter.TinderRVAdapter;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by athbk on 5/26/17.
 */

public class AvatarAdapter extends TinderRVAdapter<String, AvatarAdapter.AvatarVH> {

    List<Integer> listInt;
    List<String> listString;
    Context context;

    public AvatarAdapter(Context context, List<String> list) {
        this.listString = list;
        this.context = context;
    }

    @Override
    protected List<String> getListItem() {
        return listString;
    }

    @Override
    protected AvatarVH onCreateItemViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new AvatarVH(view);
    }

    @Override
    protected void onBindItemViewHolder(AvatarVH holder, int position) {
//        holder.imageView.setImageResource(listString.get(position));
        Picasso.with(context).load(listString.get(position)).into(holder.imageView);

    }

    class AvatarVH extends ItemVH {

        FrameLayout layout;
        ImageView imageView;

        public AvatarVH(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            layout = (FrameLayout) itemView.findViewById(R.id.layout);
        }

        @Override
        public void onItemSelected() {
            super.onItemSelected();
            layout.setAlpha(0.5f);
            Log.e("DRAG", "DRAG");
        }

        @Override
        public void onItemClear() {
            super.onItemClear();
            layout.setAlpha(1f);
            Log.e("FINISH DRAG", "FINISH DRAG");

        }
    }
}
