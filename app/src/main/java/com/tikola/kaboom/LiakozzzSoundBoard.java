package com.tikola.kaboom;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LiakozzzSoundBoard extends AppCompatActivity {

    Button Uuuu;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liakozzz_sound_board);

        Uuuu = (Button) findViewById(R.id.buttonUuuuSound);
    }

    public void playUuuuSound(View view) {
        mediaPlayer = MediaPlayer.create(LiakozzzSoundBoard.this, R.raw.test);
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        mediaPlayer.start();
    }
}