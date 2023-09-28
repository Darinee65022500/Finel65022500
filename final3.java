class Employee {
    String name;
    double position;

    public Employee(String name, double price) {
        this.name = name;
        this.position = price;
    }

    public void displayInfo() {
        System.out.println(" Name : " + name);
        System.out.println("position : " + position);
    }
}

class Person extends Employee {
    String EmpID;
    String Projects;

    public Person(String name, double price, String brand, String model) {
        super(name, price);
        this.EmpID = brand;
        this.Projects = model;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("EmpID : " + EmpID);
        System.out.println("Projects  " + Projects);
        System.out.println("Web A : " );
    }
}

class job extends Employee {
    String brand;
    String model;
    String os;

    public job(String name, double price, String brand, String model, String os) {
        super(name, price);
        this.brand = brand;
        this.model = model;
        this.os = os;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("EmpID : " + brand);
        System.out.println("Projects : " + model);
        System.out.println("Web A : " + os);
    }
}

class Book extends Employee {
    String author;
    int numOfPages;

    public Book(String name, double price, String author, int numOfPages) {
        super(name, price);
        this.author = author;
        this.numOfPages = numOfPages;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author : " + author);
        System.out.println("Number of Pages : " + numOfPages);
    }
}

public class final3 {
    public static void main(String[] args) {
      
        System.out.println();
        System.out.println("**************************");

        Person television = new Person("Tom", 0, "0001", "");
        television.displayInfo();

        System.out.println();
        System.out.println("**************************");

        job iphone = new job("Tim", 0, "0002", "", "Developing a web application");
        iphone.displayInfo();

    }
}