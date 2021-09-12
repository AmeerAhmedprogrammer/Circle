//Ameer Ahmed 

public class Circle { 
    
    double radius = 1.0;

    Circle() {
        System.out.println("The no-arg circle: ");
    }
    Circle(double newRadius) { 
        System.out.println("The one-arg circle: ");
        radius = newRadius;

    }
    double getArea() { 
        return radius * radius * 3.14159;
    }
}