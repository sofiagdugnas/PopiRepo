package Popi.If;

public class WorkGeneration
{
    public static void main(String[] args) {
        int score = 1900;


        if (score >= 1996) {
            System.out.println("Centenial");
        } else if (score >= 1980) {
            System.out.println("Millenial");
        } else if (score >= 1965) {
            System.out.println("Generación X");
        } else if (score >= 1946) {
            System.out.println("Baby Boomer");
        } else {
            System.out.println("Otros");
        }
    }
}



