package com.company;

/*
Author: Will Rowston 09/18/2019
Project: Workout Tracker
 */

public class Exercise {

    private final String exerciseType;
    private final int weight;
    private final int sets;
    private final int reps;

    public Exercise(String exerciseType, int sets, int reps, int weight) {
        this.exerciseType = exerciseType;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public int getWeight() {
        return weight;
    }

    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }

    public String toString(){
        return "Exercise Type: " + this.exerciseType + " | " +
                this.sets + " sets | " + this.reps + " reps | " + this.weight + " pounds.";
    }
}
