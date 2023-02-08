package com.verizon.share;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    String MYSHAREDPREF = "sharedPref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.textView);
        sharedPreferences = getSharedPreferences(MYSHAREDPREF, MODE_PRIVATE);
        String name = "Nikhil";
        int age = 23;
        String gender = "Male";

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("NAME", name);
        editor.putInt("AGE", age);
        editor.putString("GENDER", gender);
        editor.commit();

        String nameShare = sharedPreferences.getString("NAME", "NONAME");
        int agee = sharedPreferences.getInt("AGE", 0);
        tv.setText("Name is " + nameShare + " and Age is " + agee);

    }
}