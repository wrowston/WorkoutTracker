package com.company;

import java.util.ArrayList;


/*
Author: Will Rowston 09/18/2019
Project: Workout Tracker
 */

public class Workout {

    private ArrayList<Exercise> workout;
    private Exercise exercise;
    private final String date;


    public Workout(String date) {
        this.date = date;
        this.workout = new ArrayList<Exercise>();
    }

    public void addExercise(String exerciseType, int sets, int reps, int weight) {
        exercise = new Exercise(exerciseType, sets, reps, weight);
        this.workout.add(exercise);
    }

    public String getDate() {
        return date;
    }

    public String toString() {
        return "Workout date: " + this.date;
    }
    public void showExercises() {
        for (Exercise exercise : workout) {
            System.out.println(exercise);
        }
    }
}
