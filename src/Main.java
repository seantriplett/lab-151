// Programmers:  Sean, Jorge
// Course:  CS 212, Dr. Cui
// Due Date: 1/23/24
// Lab Assignment: 0
// Problem Statement:  Calculate and output the future population based on information given by the user.
// Input: Seconds between births, seconds between deaths, seconds between immigrations, current population, number of years in the future
// Output:  The future population.
// Credits: N/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Output opening statement
        System.out.println("This code will calculate the future population in a number of years based on the current population, seconds between births, seconds between deaths, and seconds between immigrations.");
        //Setup scanner
        Scanner input = new Scanner(System.in);
        // Prompt and scan for seconds between births, deaths, and immigrations, current population, and number of years
        System.out.println("How many seconds between births?");
        int birthSeconds = input.nextInt();
        System.out.println("How many seconds between deaths?");
        int deathSeconds = input.nextInt();
        System.out.println("How many seconds between immigrations?");
        int immigrationSeconds = input.nextInt();
        System.out.println("What is the current population?");
        int populationCurrent = input.nextInt();
        System.out.println("How many years in the future?");
        int futureYears = input.nextInt();
        // Calculate seconds in a year
        int secondsPerYear = 365 * 24 * 60 * 60;
        // Calculate births, deaths, and immigrations per year
        int birthsPerYear = secondsPerYear/birthSeconds;
        int deathsPerYear = secondsPerYear/deathSeconds;
        int immigrationsPerYear = secondsPerYear/immigrationSeconds;
        // Calculate future population
        int futurePopulation = populationCurrent + futureYears*(birthsPerYear+immigrationsPerYear-deathsPerYear);
        // Output future population
        System.out.println("The US population in " + futureYears + " years will be " + futurePopulation);
    }
}