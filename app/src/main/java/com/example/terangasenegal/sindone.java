package com.example.terangasenegal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class sindone extends AppCompatActivity {

    private Button bttn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sindone);
        bttn5 = (Button) findViewById(R.id.bttn5);

        bttn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sindone = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hotel-sindone.com/"));
                startActivity(sindone);
            }
        });
    }

}
