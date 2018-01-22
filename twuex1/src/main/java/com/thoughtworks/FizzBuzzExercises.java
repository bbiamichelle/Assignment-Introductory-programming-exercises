package main.java.com.thoughtworks;

public class FizzBuzzExercises {

    public void printFizzBuzz (){

        for (int counter = 1; counter < 101; counter++) {
            if (counter % 3 == 0 && counter % 5 == 0) {
                System.out.println("Fizz");
            } else if (counter % 5 == 0) {
                System.out.println("Buzz");
            } else if (counter % 3 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(counter);
            }
        }
    }
}
