package Popi.If;

public class TimeOfDay {
    public static void main(String[] args) {
        int hour = 15;


        if (hour >= 6 && hour < 12) {
            System.out.println("Good morning!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good afternoon!");
        } else if (hour >= 18 && hour < 24) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Good night!");
        }
    }
}

