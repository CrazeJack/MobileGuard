package com.example.mobileguard.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.mobileguard.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 创建者     Bywhan
 * 创建时间   2016/1/5 15:12
 * 描述	      Splash界面
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
public class SplashActivity extends Activity {

    @Bind(R.id.iv)
    ImageView    mIv;
    @Bind(R.id.ll_rootview)
    LinearLayout mLlRootview;
    private AnimationSet mAs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initView();

        initData();
        //        还要初始化动画
        initAnimation();

        initEvent();

    }

    private void initAnimation() {
        //
        ScaleAnimation sa = new ScaleAnimation(0, 1, 0, 1, Animation.RELATIVE_TO_SELF, .5f, Animation
                .RELATIVE_TO_SELF, .5f);
        sa.setDuration(2000);
        sa.setFillAfter(true);

        AlphaAnimation aa = new AlphaAnimation(0, 1);
        aa.setDuration(2000);
        aa.setFillAfter(true);

        RotateAnimation ra = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, .5f, Animation.RELATIVE_TO_SELF,
                .5f);
        ra.setDuration(2000);
        ra.setFillAfter(true);

        mAs = new AnimationSet(true);
        mAs.addAnimation(sa);
        mAs.addAnimation(aa);
        mAs.addAnimation(ra);
        //控件开启动画
        mLlRootview.startAnimation(mAs);

    }

    private void initEvent() {
        //对动画设置监听,
        mAs.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                //获取版本号


            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //判断是不是最新的版本
                startActivity(new Intent(SplashActivity.this,HomeActivity.class));
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            super.handleMessage(msg);
        }
    };

    private void initData() {
        //获取版本号
        //        int versionCode

        new ThreadLocal<>();

    }

    private void initView() {
        ButterKnife.bind(this);

        //        mIv.setBackgroundResource(R.drawable.splash);


    }
}
