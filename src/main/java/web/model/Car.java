package web.model;

public class Car {
    String color;
    int age;
    int maxSpeed;

    public Car(String color, int age, int maxSpeed) {
        this.color = color;
        this.age = age;
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}