package com.example.workout_advisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private workoutadvisor expert = new workoutadvisor();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gg(View view)
    {
        TextView work= (TextView) findViewById(R.id.textView2);

        Spinner worktype = (Spinner) findViewById(R.id.workout);
        String workout = String.valueOf(worktype.getSelectedItem());
        //work.setText(workout);
        List<String> workoutList = expert.getworkout(workout);
        StringBuilder workoutformat= new StringBuilder();
        for (String workk :workoutList){
            workoutformat.append(workk).append('\n');
        }

        work.setText(workoutformat);

    }


}
