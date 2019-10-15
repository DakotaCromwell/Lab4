package com.mycompany.lab4;

public class carClassMain {

    public static void main(String[] args) {
        Car car0 = new Car(1998, "Ford");
        for (int i = 0; i < 5; i++) {
            int currentSpeed = car0.accelerate();
            System.out.println("The speed of car0 is: " + currentSpeed);
        }
        for (int j = 0; j < 5; j++) {
            int currentSpeed = car0.brake();
            System.out.println("The speed of car0 is:" + currentSpeed);
        }

    }
}
