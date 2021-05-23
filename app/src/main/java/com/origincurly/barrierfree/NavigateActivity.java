package com.origincurly.barrierfree;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NavigateActivity extends BasicActivity {


    private RelativeLayout b1_Layout;
    private RelativeLayout b2_Layout;
    private RelativeLayout b3_Layout;
    private RelativeLayout b4_Layout;
    private RelativeLayout b5_Layout;

    private RelativeLayout c1_Layout;
    private RelativeLayout c2_Layout;
    private RelativeLayout c3_Layout;
    private RelativeLayout c4_Layout;
    private RelativeLayout c5_Layout;
    private RelativeLayout c6_Layout;
    private RelativeLayout c7_Layout;
    private RelativeLayout c8_Layout;
    private RelativeLayout c9_Layout;
    private RelativeLayout c10_Layout;
    private RelativeLayout c11_Layout;

    private TextView min_Txt;
    private TextView km_Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate);
        setActivity(this, this);

        b1_Layout = findViewById(R.id.b1_Layout);
        b2_Layout = findViewById(R.id.b2_Layout);
        b3_Layout = findViewById(R.id.b3_Layout);
        b4_Layout = findViewById(R.id.b4_Layout);
        b5_Layout = findViewById(R.id.b5_Layout);
        c1_Layout = findViewById(R.id.c1_Layout);
        c2_Layout = findViewById(R.id.c2_Layout);
        c3_Layout = findViewById(R.id.c3_Layout);
        c4_Layout = findViewById(R.id.c4_Layout);
        c5_Layout = findViewById(R.id.c5_Layout);
        c6_Layout = findViewById(R.id.c6_Layout);
        c7_Layout = findViewById(R.id.c7_Layout);
        c8_Layout = findViewById(R.id.c8_Layout);
        c9_Layout = findViewById(R.id.c9_Layout);
        c10_Layout = findViewById(R.id.c10_Layout);
        c11_Layout = findViewById(R.id.c11_Layout);

        min_Txt = findViewById(R.id.min_Txt);
        km_Txt = findViewById(R.id.km_Txt);

        a1Handler.sendEmptyMessageDelayed(0, 200);
        initTTS();
    }

    int animateDuration = 300;
    
    Handler a1Handler = new Handler() {
        public void handleMessage(Message msg) {
            b1_Layout.setVisibility(View.VISIBLE);
            c1_Layout.setVisibility(View.VISIBLE);
            b1_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration);
            b1_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration);
            a2Handler.sendEmptyMessageDelayed(0, ANIM_INTERVAL_TIME);
        }
    };

    Handler a2Handler = new Handler() {
        public void handleMessage(Message msg) {
            b1_Layout.animate()
                    .alpha(0)
                    .setDuration(animateDuration);
            c1_Layout.animate()
                    .alpha(0)
                    .setDuration(animateDuration);

            b2_Layout.setVisibility(View.VISIBLE);
            b2_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration)
                    .setStartDelay(animateDuration);
            c2_Layout.setVisibility(View.VISIBLE);
            c2_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration)
                    .setStartDelay(animateDuration);
            a3Handler.sendEmptyMessageDelayed(0, ANIM_INTERVAL_TIME);
        }
    };

    Handler a3Handler = new Handler() {
        public void handleMessage(Message msg) {
            b1_Layout.setVisibility(View.GONE);
            c1_Layout.setVisibility(View.GONE);
            c2_Layout.animate()
                    .alpha(0)
                    .setDuration(animateDuration);

            c3_Layout.setVisibility(View.VISIBLE);
            c3_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration)
                    .setStartDelay(animateDuration);
            a4Handler.sendEmptyMessageDelayed(0, ANIM_INTERVAL_TIME);
        }
    };

    Handler a4Handler = new Handler() {
        public void handleMessage(Message msg) {
            c2_Layout.setVisibility(View.GONE);;
            c3_Layout.animate()
                    .alpha(0)
                    .setDuration(animateDuration);
            c4_Layout.setVisibility(View.VISIBLE);
            c4_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration)
                    .setStartDelay(animateDuration);
            a5Handler.sendEmptyMessageDelayed(0, ANIM_INTERVAL_TIME);
        }
    };

    Handler a5Handler = new Handler() {
        public void handleMessage(Message msg) {
            c3_Layout.setVisibility(View.GONE);

            c4_Layout.animate()
                    .alpha(0)
                    .setDuration(animateDuration);

            c5_Layout.setVisibility(View.VISIBLE);
            c5_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration)
                    .setStartDelay(animateDuration);
            a6Handler.sendEmptyMessageDelayed(0, ANIM_INTERVAL_TIME);
        }
    };

    Handler a6Handler = new Handler() {
        public void handleMessage(Message msg) {
            c4_Layout.setVisibility(View.GONE);

            b2_Layout.animate()
                    .alpha(0)
                    .setDuration(animateDuration);
            c5_Layout.animate()
                    .alpha(0)
                    .setDuration(animateDuration);

            b3_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration)
                    .setStartDelay(animateDuration);
            c6_Layout.setVisibility(View.VISIBLE);
            c6_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration)
                    .setStartDelay(animateDuration);
            a7Handler.sendEmptyMessageDelayed(0, ANIM_INTERVAL_TIME);
        }
    };

    Handler a7Handler = new Handler() {
        public void handleMessage(Message msg) {
            b2_Layout.setVisibility(View.GONE);
            c5_Layout.setVisibility(View.GONE);

            b3_Layout.animate()
                    .alpha(0)
                    .setDuration(animateDuration);
            c6_Layout.animate()
                    .alpha(0)
                    .setDuration(animateDuration);
            c7_Layout.setVisibility(View.VISIBLE);
            c7_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration)
                    .setStartDelay(animateDuration);
            a8Handler.sendEmptyMessageDelayed(0, ANIM_INTERVAL_TIME);
        }
    };

    Handler a8Handler = new Handler() {
        public void handleMessage(Message msg) {
            min_Txt.setText("35");
            km_Txt.setText("1.2");
            b3_Layout.setVisibility(View.GONE);
            c6_Layout.setVisibility(View.GONE);
            c7_Layout.animate()
                    .alpha(0)
                    .setDuration(animateDuration);

            b4_Layout.setVisibility(View.VISIBLE);
            b4_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration)
                    .setStartDelay(animateDuration);
            c8_Layout.setVisibility(View.VISIBLE);
            c8_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration)
                    .setStartDelay(animateDuration);
            a9Handler.sendEmptyMessageDelayed(0, ANIM_INTERVAL_TIME);
        }
    };

    Handler a9Handler = new Handler() {
        public void handleMessage(Message msg) {
            c7_Layout.setVisibility(View.GONE);

            b1_Layout.animate()
                    .alpha(0)
                    .setDuration(animateDuration);
            c8_Layout.animate()
                    .alpha(0)
                    .setDuration(animateDuration);
            c9_Layout.setVisibility(View.VISIBLE);
            c9_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration)
                    .setStartDelay(animateDuration);
            a10Handler.sendEmptyMessageDelayed(0, ANIM_INTERVAL_TIME);
        }
    };

    Handler a10Handler = new Handler() {
        public void handleMessage(Message msg) {
            c9_Layout.setVisibility(View.GONE);

            c10_Layout.animate()
                    .alpha(0)
                    .setDuration(animateDuration);

            c10_Layout.setVisibility(View.VISIBLE);
            c10_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration)
                    .setStartDelay(animateDuration);
            a11Handler.sendEmptyMessageDelayed(0, ANIM_INTERVAL_TIME);
        }
    };

    Handler a11Handler = new Handler() {
        public void handleMessage(Message msg) {
            min_Txt.setText("5");
            km_Txt.setText("0.42");
            c10_Layout.setVisibility(View.GONE);

            b4_Layout.animate()
                    .alpha(0)
                    .setDuration(animateDuration);
            c11_Layout.animate()
                    .alpha(0)
                    .setDuration(animateDuration);

            b5_Layout.setVisibility(View.VISIBLE);
            b5_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration)
                    .setStartDelay(animateDuration);
            c11_Layout.setVisibility(View.VISIBLE);
            c11_Layout.animate()
                    .alpha(1)
                    .setDuration(animateDuration)
                    .setStartDelay(animateDuration);
        }
    };


    public void ListClicked(View v) {
        startActivityClass(NavigateListActivity.class, R.anim.animation_fade_in, R.anim.animation_stop_short);

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
            exitApp();
        }

        return true;
    }
}