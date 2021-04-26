package com.tikola.kaboom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LiakozzzSoundBoard extends AppCompatActivity {

    Button Uuuu, monosSou, kalaEsu;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liakozzz_sound_board);

        Uuuu = (Button) findViewById(R.id.buttonUuuuSound);
        monosSou = (Button) findViewById(R.id.buttonMonosSouSound);
        kalaEsu = (Button) findViewById(R.id.buttonKalaEsuSound);
    }

    public void playSound(Context context, int soundSource){
        mediaPlayer = MediaPlayer.create(context, soundSource);
        mediaPlayer.start();
    }

    public void playUuuuSound(View view) {
        playSound(LiakozzzSoundBoard.this, R.raw.test);
    }

    public void playMonosSouSound(View view) {
        playSound(LiakozzzSoundBoard.this, R.raw.test);
    }

    public void  playKalaEsuSound(View view) {
        playSound(LiakozzzSoundBoard.this, R.raw.test);
    }
}