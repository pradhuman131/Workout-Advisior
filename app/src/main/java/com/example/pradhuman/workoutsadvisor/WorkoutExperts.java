package com.example.pradhuman.workoutsadvisor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pradhuman on 4/8/2017.
 */

public class WorkoutExperts {

    List<String> getWorkouts (String workoutTypes)
    {
        List<String> workout = new ArrayList<String>();

        if(workoutTypes.equals("Chest"))
        {
            workout.add("Pushups");
            workout.add("Bench Press");
            workout.add("Chest Fly");
            workout.add("Pec Deck Machine");
        }
        else if(workoutTypes.equals("Triceps"))
        {
            workout.add("Triceps Ext");
            workout.add("Triceps Pushdown");
        }
        else if(workoutTypes.equals("Shoulders"))
        {
            workout.add("Shoulder Press");
        }
        else if(workoutTypes.equals("Biceps"))
        {
           workout.add("Biceps curls");
        }

        return workout;
    }

}
