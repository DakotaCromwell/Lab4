
package com.mycompany.lab4;

public class CircleClassMain {
    public static void main(String[] args) {
        Circle newCirc = new Circle(5);
        double areaOfCirc = newCirc.area();
        double diameterOfCirc = newCirc.diameter();
        double circumferenceOfCirc = newCirc.circumference();
        System.out.println("The diameter of newCirc is:" + diameterOfCirc);
        System.out.println("The circumferance of newCirc is:" + circumferenceOfCirc);
        System.out.println("The area of newCirc is:" + areaOfCirc);

    }
}
