package com.athbk.changeavtarliketinder;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.athbk.avatarview.adapter.ItemVH;
import com.athbk.avatarview.adapter.TinderRVAdapter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by athbk on 5/26/17.
 */

public class AvatarAdapter extends TinderRVAdapter<DataModel, AvatarAdapter.AvatarVH> {

    List<Integer> listInt;
    List<String> listString;
    List<DataModel> listData;
    Context context;

    public AvatarAdapter(Context context, List<DataModel> list) {
        this.listData = list;
        this.context = context;
    }

//    public AvatarAdapter(Context context, List<String> list) {
//        this.listString = list;
//        this.context = context;
//        listInt = new ArrayList<>();
//        for (int i=0; i< listString.size(); i++){
//            listInt.add(i);
//        }
//    }

    @Override
    protected List<DataModel> getListItem() {
        return listData;
    }

    @Override
    protected AvatarVH onCreateItemViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new AvatarVH(view);
    }

    @Override
    protected void onBindItemViewHolder(AvatarVH holder, int position) {
//        holder.imageView.setImageResource(listString.get(position));
        Picasso.with(context).load(listData.get(position).getLogo()).into(holder.imageView);
        Log.e("TAG", ""+position);
        Log.e("IMAGE", ""+ listData.get(position).getLogo());
        holder.tv.setText(""+listData.get(position).getStt());
    }

    class AvatarVH extends ItemVH {

        FrameLayout layout;
        ImageView imageView;
        Button btnDelete;
        TextView tv;

        public AvatarVH(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            layout = (FrameLayout) itemView.findViewById(R.id.layout);
            tv = (TextView) itemView.findViewById(R.id.tv);
            btnDelete = (Button) itemView.findViewById(R.id.btnDelete);
            btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemDismiss(getLayoutPosition());
                }
            });
        }

        @Override
        public void onItemSelected() {
            super.onItemSelected();
            layout.setAlpha(0.5f);
//            Log.e("DRAG", "DRAG");
        }

        @Override
        public void onItemClear() {
            super.onItemClear();
            layout.setAlpha(1f);
//            Log.e("FINISH DRAG", "FINISH DRAG");

        }
    }
}
