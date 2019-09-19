package com.company;

import java.util.Scanner;

/*
Author: Will Rowston 09/18/2019
Project: Workout Tracker
 */

public class Main {

    private static ListOfWorkouts workouts = new ListOfWorkouts();

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {

            System.out.print("Would you like to start a workout or see previous workouts? " + "\n" +
                    "(enter start to begin, previous for history, or quit to cancel)");
            String startInput = reader.nextLine();
            System.out.println("");

            if (startInput.equalsIgnoreCase("quit")) {
                System.out.println("You need to exercise!");
                break;

            } else if(startInput.equalsIgnoreCase("start")) {
                addWorkout(reader);

            } else if(startInput.equalsIgnoreCase("previous")) {
                System.out.print("See all workouts or search by date? ");
                String searchInput = reader.nextLine();

                if (searchInput.equalsIgnoreCase("all")) {
                    workouts.showWorkouts();

                } else if (searchInput.equalsIgnoreCase("date")) {
                    System.out.print("What date? (mm/dd/yy) ");
                    String dateInput = reader.nextLine();
                    showWorkoutOnDate(dateInput);
                }

            }
            System.out.println("");
        }

    }

    public static void addWorkout(Scanner reader) {
        System.out.println("Today's Date (mm/dd/yy):");
        String date = reader.nextLine();
        Workout workout = new Workout(date);

        while (true) {
            System.out.print("Would you like to add an exercise to the workout? ");
            String input = reader.nextLine();

            if (input.equalsIgnoreCase("no")){
                System.out.println("Workout complete.");
                break;
            } else if(input.equalsIgnoreCase("yes")) {
                addExercise(reader, workout);
            }
            System.out.println("");
        }


        workouts.addWorkout(workout);
    }

    public static void addExercise(Scanner reader, Workout workout) {
        System.out.print("Exercise type: ");
        String exerciseInput = reader.nextLine();

        System.out.print("How many sets? ");
        int setsInput = Integer.parseInt(reader.nextLine());

        System.out.print("How many reps? ");
        int repsInput = Integer.parseInt(reader.nextLine());

        System.out.print("At what weight? ");
        int weightInput = Integer.parseInt(reader.nextLine());

        workout.addExercise(exerciseInput, setsInput, repsInput, weightInput);

    }

    public static void showWorkoutOnDate(String date) {
        for (Workout w : workouts.getWorkouts()) {
            if (w.getDate().equalsIgnoreCase(date)) {
                System.out.println(w);
            }
        }
    }
}
