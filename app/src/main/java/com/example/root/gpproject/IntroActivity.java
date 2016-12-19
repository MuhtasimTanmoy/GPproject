package com.example.root.gpproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by root on 12/19/16.
 */

public class IntroActivity extends AppIntro {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("A","B",R.drawable.gplogo, Color.parseColor("#3F51B5")));

        addSlide(AppIntroFragment.newInstance("C","D",R.drawable.gplogo, Color.parseColor("#3F51B5")));

        addSlide(AppIntroFragment.newInstance("E","F",R.drawable.gplogo, Color.parseColor("#3F51B5")));

        showStatusBar(false);

        setBarColor(Color.parseColor("#333639"));

        setSeparatorColor(Color.parseColor("#219653"));


    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
       // Toast.makeText(this,"HELLO",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        //Toast.makeText(this,"YO",Toast.LENGTH_LONG).show();
    }
}
