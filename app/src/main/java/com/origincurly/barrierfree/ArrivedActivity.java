package com.origincurly.barrierfree;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class ArrivedActivity extends BasicActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrived);
        setActivity(this, this);

//        talkOutput_Txt = findViewById(R.id.talkOutput_Txt);

        initTTS();
    }

    public void SearchClicked(View v) {
        Intent intent = new Intent(mContext, SearchActivity.class);
        intent.putExtra("vv", 1);
        startActivityIntent(intent, R.anim.animation_fade_in, R.anim.animation_stop_short);
    }

    public void EndClicked(View v) {
        startActivityClass(MapActivity.class, R.anim.animation_fade_in, R.anim.animation_stop_short);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitApp();
        }

        return true;
    }

    @Override
    public void clearFocusBundle() {
        super.clearFocusBundle();
//        speechInput_EditTxt.clearFocus();
    }
}