package com.varuniyer.intentcharity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

<<<<<<< HEAD
import com.varuniyer.intentcharity.R;
import com.varuniyer.intentcharity.SelectCause;

=======
>>>>>>> c8b69bbdebb30bc6a91bf3cbc98acd4b9633215a
public class MainActivity extends AppCompatActivity {

    public void moveToSelection(View v) {
        Intent selection = new Intent(this, SelectCause.class);
        startActivity(selection);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
