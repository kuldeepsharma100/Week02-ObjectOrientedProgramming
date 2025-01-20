public class Employee{
    //Instance Variables
    String name;
    int id;
    int salary;
    
    //constructor to initialize the instance variables 
    public Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //method to display details
    public  void displayDetails(){
        System.out.println("The name of the employee is : " + name);
        System.out.println("The id of the employee is : " + id);
        System.out.println("The salary of the employee is : " + salary);
        System.out.println();
    }

    public static void main(String[] args) {

        //Objects of a employee class
        Employee e1 = new Employee("Ram", 1, 25000);
        Employee e2 = new Employee("Om", 2, 125000);
        e1.displayDetails();
        e2.displayDetails();

    }
}

