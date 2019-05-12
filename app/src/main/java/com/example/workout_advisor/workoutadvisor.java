package com.example.workout_advisor;

import java.util.ArrayList;
import java.util.List;

public class workoutadvisor {
    List<String> getworkout (String workoutt)
    {
        List<String> workout = new ArrayList<String>();

        if (workoutt.equals("Chest")){
            workout.add("For Chest Workout:\n Bench Press\n Heavy Lifting");
        }
        else if(workoutt.equals("Legs")){
            workout.add("For Leg Workout:\nSquats\nDeadlift");
        }
        else if(workoutt.equals("Bicep")){
            workout.add("For Biscep Workout");
            workout.add("\nHeavy lift\nDumbell Lift(s)");

        }
        else if(workoutt.equals("Shoulder")){
            workout.add("For Shoulder Workout:\nShoulder Curls\nAnd Other Types of Exercises:)");
        }
        else if(workoutt.equals("Items Here")){
            workout.add("Choose one of the body parts given in drop down menu! ");
        }
        return workout;
    }

}
