package main.java.com.thoughtworks;


public class App
{
    public static void main( String[] args )
    {
        TriangleExercises triangleExercises = new TriangleExercises();
        DiamondExercises diamondExercises = new DiamondExercises();
        FizzBuzzExercises fizzBuzzExercises = new FizzBuzzExercises();
        PrimeFactoreExercises primeFactoreExercises = new PrimeFactoreExercises();

        triangleExercises.printAsterisk();
        triangleExercises.printHorizontalLine();
        triangleExercises.printVerticalLine();
        triangleExercises.printRightTriangle();

        diamondExercises.printIsoscelesTriangle();
        diamondExercises.printDiamond();
        diamondExercises.printDiamondWithName();

        fizzBuzzExercises.printFizzBuzz();
        primeFactoreExercises.printPrimeFactorsExercises();


    }
}