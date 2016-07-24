package com.varuniyer.intentcharity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class SelectCause extends AppCompatActivity {

    public void goToManage(View v) {
        Manage.checked = new ArrayList<String>();
        LinearLayout l = (LinearLayout) findViewById(R.id.linearLayout);
        CheckBox box;
        for (int i = 0; i < l.getChildCount(); i++) {
            if (l.getChildAt(i) instanceof LinearLayout) {
                LinearLayout boxList = (LinearLayout) (l.getChildAt(i));
                for (int j = 0; j < boxList.getChildCount(); j++) {
                    box = (CheckBox) (boxList.getChildAt(j));
                    if (box.isChecked())
                        Manage.checked.add(box.getText().toString());
                }
            }
        }
        Intent management = new Intent(this, Manage.class);
        startActivity(management);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_cause);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
