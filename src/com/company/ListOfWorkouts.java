package com.company;

import java.util.ArrayList;


/*
Author: Will Rowston 09/18/2019
Project: Workout Tracker
 */

public class ListOfWorkouts {

    private ArrayList<Workout> listOfWorkouts;

    public ListOfWorkouts() {
        this.listOfWorkouts = new ArrayList<Workout>();
    }

    public void addWorkout(Workout workout) {
        this.listOfWorkouts.add(workout);
    }

    public ArrayList<Workout> getWorkouts() {
        return this.listOfWorkouts;
    }

    public void showWorkouts() {
        for (Workout workout : this.listOfWorkouts) {
            System.out.println(workout); //prints toString from class Workout which prints date
            workout.showExercises();
            System.out.println("----------------------------------------------------------------------");
        }
    }
}
