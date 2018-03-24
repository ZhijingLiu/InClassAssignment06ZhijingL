package com.example.jenniferliu.inclassassignment06_zhijingl;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView outPutText;
    private String outPut;
    private String name;
    private int legs;
    private boolean hasFur;
    private String information;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView outputText = (TextView)findViewById(R.id.outPut_text);
        Intent Main2Activity = getIntent();

        Animal animals = (Animal)Main2Activity.getSerializableExtra(Keys.NAME);
        name = animals.getName();
        legs = animals.getLegs();
        hasFur = animals.isHasFur();
        information = animals.getInformation();

        outPut = animals.toString();
        outputText.setText(outPut);


    }

}
