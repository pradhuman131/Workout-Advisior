package com.example.pradhuman.workoutsadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindWorkoutActivity extends Activity {

    private WorkoutExperts expert = new WorkoutExperts();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_workout);
    }

    public void OnClickFinder(View view)
    {
        TextView workouts = (TextView)findViewById(R.id.workout);
        Spinner workoutType = (Spinner)findViewById(R.id.workoutype);
        String workout = String.valueOf(workoutType.getSelectedItem());
        List<String> workoutList = expert.getWorkouts(workout);
        StringBuilder workoutsFormatted = new StringBuilder();

        for(String work : workoutList)
        {
            workoutsFormatted.append(work).append('\n');
        }

        workouts.setText(workoutsFormatted);
    }

}
