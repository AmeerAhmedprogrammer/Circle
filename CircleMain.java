//Ameer Ahmed

public class Main {

    public static void main (String [] args) { 

        //call the no-arg constructor
        Circle myCircle1 = new Circle();
        
        //print it
        System.out.println("The Area of the first Circle is: " 
        + myCircle1.getArea());

        //call the one arg constructor
        Circle myCircle2 = new Circle(5.5);

        //print it
        System.out.println("The Area of the second Circle is: " 
        + myCircle2.getArea());
    }
}