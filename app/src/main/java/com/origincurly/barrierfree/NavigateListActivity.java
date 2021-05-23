package com.origincurly.barrierfree;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NavigateListActivity extends BasicActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate_list);
        setActivity(this, this);
        initTTS();
    }


    public void NavigateClicked(View v) {
        finishActivity(R.anim.animation_stop_short, R.anim.animation_fade_out);
    }
    public void OverviewClicked(View v) {
        startActivityClass(OverViewActivity.class, R.anim.animation_fade_in, R.anim.animation_stop_short);
    }
    public void EndClicked(View v) {
        startActivityClass(MapActivity.class, R.anim.animation_fade_in, R.anim.animation_stop_short);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finishActivity(R.anim.animation_stop_short, R.anim.animation_fade_out);
        }

        return true;
    }
}