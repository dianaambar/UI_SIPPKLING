package com.example.android.sippkling;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class SplashScreen extends AppCompatActivity{

    VideoView videoview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.Layout.activity_spalsh);

        Uri video = Uri.parse("android.resource://"+getPackageName()+"/"+R.Raw.splash);
        videoview.setVideoURI(video);

        videoview .setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                startNextActivity();
            }
        });
        videoview.start();
    }

    private void startNextActivity() {
        if (isFinishing())
            return;
        startActivity(new Intent(this, KategoriPendataan.class));
    }

}
