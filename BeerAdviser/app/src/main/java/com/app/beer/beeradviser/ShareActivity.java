package com.app.beer.beeradviser;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_share);
        Intent ivar = getIntent();
        String msg = ivar.getStringExtra("textView4");
        TextView messageView = (TextView)findViewById(R.id.textView4);
        messageView.setText(msg);
    }

}
