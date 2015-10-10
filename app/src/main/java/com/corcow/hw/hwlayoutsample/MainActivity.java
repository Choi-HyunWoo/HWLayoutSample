package com.corcow.hw.hwlayoutsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.btn_lezhin : {
                startActivity(new Intent(this, LezhinComics.class));
                break;
            }
            case R.id.btn_baemin : {
                startActivity(new Intent(this, Baemin.class));
                break;
            }
            case R.id.btn_playstore : {
                startActivity(new Intent(this, PlayStore.class));
                break;
            }
            default:
                break;
        }
    }
}
