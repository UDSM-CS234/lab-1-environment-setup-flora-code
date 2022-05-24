package com.company;

public class Main {

    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        finalPosition = finalPositionCalc(gravity, 10, 0, 0);
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }

    public static double finalPositionCalc(double acceleration, int time, double initialVelocity, double pos) {
        return (0.5 * acceleration * time * time) + (initialVelocity * time) + pos;
    }
}