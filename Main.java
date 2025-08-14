public class Main {
    public static void main (String[] args) {
    
        //1.
       System.out.println("\nSample Output:\n");
       Person personOne = new Person("Claude Xiana", 3);
       Person personTwo = new Person("Chris Xian", 9);

       personOne.displayInfo();
       personTwo.displayInfo();

       System.out.println("\nSet new age and name:\n");
       personOne.setNewInfo("Claude Xiana", 9);
       personTwo.setNewInfo("Chris Xian", 15);
       personOne.displayInfo();
       personTwo.displayInfo();

       System.out.println("\n");

       //2.
       System.out.println("\nSample output:");
        Rectangle recOne = new Rectangle(12, 7);
        recOne.displayInfo();
        recOne.setNewDimension(12, 6);

        System.out.println("\n");

       //3.
       Employee employeeOne = new Employee("Juan Dela Cruz", "HR Manager", 40_000);
       Employee employeeTwo = new Employee("Andreas Hobard", "Software Engineer", 60_000);
       System.out.println("\nSample output:\nEmployee Details:");
       employeeOne.displayInfo();
       employeeTwo.displayInfo();
      
       System.out.println("\nAfter raising salary:\n");
       employeeOne.updateSalary(8, 8);
       employeeTwo.updateSalary(12, 12);


    }
}
//1.
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println(name + " is " + age + " years old.\n");
    }

    public void setNewInfo(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }
}

//2.

class Rectangle {
    float width;
    float height;
    float area;
    float perimeter;

    Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
        this.area = width * height;
        this.perimeter = 2 * (width + height);
    }

    public void displayInfo() {
        System.out.println("The area of rectangle is " + area);
        System.out.println("The perimeter of rectangle is " + perimeter);
    }

    public void setNewDimension(float width, float height) {
        this.width = width;
        this.height = height;
        this.area = width * height;
        this.perimeter = 2 * (width + height);
        System.out.println("\nThe area of rectangle is now " + area);
        System.out.println("The perimeter of rectangle is now " + perimeter);
    }
}

//3.
class Employee {
    String name;
    String jobTitle;
    float salary;

    Employee(String name, String jobTitle, float salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\nJob Title: " + jobTitle + "\nSalary: " + salary);
    }

    public void updateSalary(int percentPlaceHolder, double percent) {
        salary += salary * (percent/100);
        System.out.println(percentPlaceHolder + "% for ' " + name + " ':\nName: " + name + "\nJob Title: " + jobTitle + "\nNew Salary: " + salary + "\n");
    }
}