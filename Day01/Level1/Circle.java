public class Circle {
    //Instance Variable
    int radius;

    // Constructor of the class
    public Circle(int radius){
        this.radius = radius;
    }
    // Method to find area of the circle
    public double area(int radius){

        return Math.PI*radius*radius;
    }
    //method to find circumference of the circle
    public double circumference(int radius){
        return 2*Math.PI*radius;
    }
    // method to display the details
    public void displayDetails(){
        System.out.println("The area of the circle is : "+ area(radius));
        System.out.println("The circumference of the circle is "+ circumference(radius));
        System.out.println();
    }
    public static void main(String[] args) {

        Circle c1 = new Circle(4);
        Circle c2 = new Circle(5);

        c1.displayDetails();
        c2.displayDetails();
        
    }
}
