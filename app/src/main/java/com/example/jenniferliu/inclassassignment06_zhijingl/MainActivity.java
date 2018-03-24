package com.example.jenniferliu.inclassassignment06_zhijingl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.view.*;


public class MainActivity extends AppCompatActivity {
    private EditText animalName;
    private String name;
    private EditText numberOfLegs;
    private int legs;
    private EditText moreInformation;
    private String information;
    private CheckBox fur;
    private boolean hasFur;
    private Animal animals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fur = (CheckBox) findViewById(R.id.fur_view);

        numberOfLegs = (EditText)findViewById(R.id.legs_view);

        moreInformation = (EditText)findViewById(R.id.information_view);
    }

    public void submitButton(View view){

        name = animalName.getText().toString();

        legs = Integer.parseInt(numberOfLegs.getText().toString());

        information = moreInformation.getText().toString();

        hasFur = fur.isChecked();

        animals = new Animal(name, legs, hasFur, information);

        Intent secondActivity = new Intent(this,Main2Activity.class);

        secondActivity.putExtra(Keys.NAME, animals);

        startActivity(secondActivity);
    }
}
