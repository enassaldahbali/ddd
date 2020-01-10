package com.example.crinimalintent;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class ListRow extends RecyclerView.ViewHolder {

    ImageView mThumbilnail;
    public ListRow(@NonNull View itemView) {
        super(itemView);
        itemView.findViewById(R.id.mThumbnail);
    }


}
