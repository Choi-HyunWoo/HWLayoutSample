package com.corcow.hw.hwlayoutsample;

import android.content.Context;
import android.support.v7.internal.view.menu.MenuView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by multimedia on 2015-10-11.
 */
public class LezhinListAdapter extends BaseAdapter {

    ArrayList<LezhinItemData> items = new ArrayList<LezhinItemData>();

    public void add(LezhinItemData item) {
        items.add(item);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LezhinListItem view;
        if (convertView != null)
            view = (LezhinListItem) convertView;
         else
            view = new LezhinListItem(parent.getContext());
        view.setItemData(items.get(position));
        return view;
    }
}
