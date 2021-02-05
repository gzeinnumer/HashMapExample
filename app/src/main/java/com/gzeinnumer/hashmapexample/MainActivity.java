package com.gzeinnumer.hashmapexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Main_Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HashMap<Object , String> map = new HashMap<>();

        String str = "strv";
        map.put(str, str);
        Log.d(TAG, "onCreate: "+ map.get(str)); //onCreate: strv

        TextView textView = findViewById(R.id.tv);
        map.put(textView, textView.getText().toString());
        Log.d(TAG, "onCreate: "+ map.get(textView)); //onCreate: Hello World!

        DummyClass dummyClass = new DummyClass();
        map.put(dummyClass.variable, dummyClass.variable);
        Log.d(TAG, "onCreate: "+ map.get(dummyClass.variable)); //onCreate: data_dummyclass
    }
}