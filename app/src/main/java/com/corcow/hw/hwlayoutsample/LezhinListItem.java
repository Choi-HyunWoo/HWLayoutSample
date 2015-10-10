package com.corcow.hw.hwlayoutsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by multimedia on 2015-10-11.
 */
public class LezhinListItem extends FrameLayout {
    public LezhinListItem(Context context) {
        super(context);
        init();
    }

    ImageView iconView;
    TextView nameView;

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.lezhin_view_item, this);
        iconView = (ImageView) findViewById(R.id.image_icon);
        nameView = (TextView) findViewById(R.id.text_name);
    }

    LezhinItemData mData;
    public void setItemData(LezhinItemData data) {
        mData = data;
        iconView.setImageResource(data.imageId);
        nameView.setText(data.name);
    }
}
