package com.corcow.hw.hwlayoutsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.List;

public class LezhinComics extends AppCompatActivity {

    TabHost tabHost;
    ListView listView;
    LezhinListAdapter mAdapter;

    int [] resIds = {R.drawable.lezhin_res0, R.drawable.lezhin_res1, R.drawable.lezhin_res2, R.drawable.lezhin_res3, R.drawable.lezhin_res4,
            R.drawable.lezhin_res5, R.drawable.lezhin_res6, R.drawable.lezhin_res7, R.drawable.lezhin_res8, R.drawable.lezhin_res9, R.drawable.lezhin_res10 };
    String [] names = {"BL", "SF", "개그", "고어", "드라마", "로맨스", "무협", "미스터리", "백합", "스포츠", "시대극"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lezhin_comics);

        listView = (ListView) findViewById(R.id.listView);
        mAdapter = new LezhinListAdapter();
        listView.setAdapter(mAdapter);
        initData();

        tabHost = (TabHost)findViewById(R.id.tabhost);
        tabHost.setup();

        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("장르별").setContent(R.id.tab1));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("오늘").setContent(R.id.tab1));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("연재").setContent(R.id.tab1));
        tabHost.addTab(tabHost.newTabSpec("tab4").setIndicator("출판").setContent(R.id.tab1));
        tabHost.addTab(tabHost.newTabSpec("tab5").setIndicator("완결").setContent(R.id.tab1));

    }

    private void initData() {
        for (int i = 0; i < 11 ; i++) {
            LezhinItemData data = new LezhinItemData();
            data.imageId = resIds[i];
            data.name = names[i];
            mAdapter.add(data);
        }
    }



}
