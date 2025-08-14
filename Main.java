public class Main {
    public static void main (String[] args) {
    
        //1.
       System.out.println("\n1. CLASS PERSON");
       Person personOne = new Person("LeBron James", 40);
       Person personTwo = new Person("Cristiano Ronaldo", 45);

       personOne.displayInfo();
       personTwo.displayInfo();

       System.out.println("\nSet new name and age:\n");
       personOne.setNewInfo("Ishowspeed", 21);
       personTwo.setNewInfo("Isaac Newton", 70);
       personOne.displayInfo();
       personTwo.displayInfo();

       System.out.println("\n");

       //2.
       System.out.println("2. CLASS RECTANGLE");
        Rectangle recOne = new Rectangle(2, 3);
        recOne.displayInfo();
        recOne.setNewDimension(9, 5);

        System.out.println("\n");

       //3.
       Employee employeeOne = new Employee("Lebron James", "Basketball Player", 230_000);
       Employee employeeTwo = new Employee("Cristiano Ronaldo", "Football Player", 450_000);
       System.out.println("3.CLASS EMPLOYEES\nEmployee Details");
       employeeOne.displayInfo();
       employeeTwo.displayInfo();
      
       System.out.println("\nAfter raising salary:");
       employeeOne.updateSalary(5);
       employeeTwo.updateSalary(3);


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
        System.out.println("\t" + name + " is " + age + " years old.");
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
        System.out.println("\tThe area of rectangle is " + area);
        System.out.println("\tThe perimeter of rectangle is " + perimeter);
    }

    public void setNewDimension(float width, float height) {
        this.width = width;
        this.height = height;
        this.area = width * height;
        this.perimeter = 2 * (width + height);
        System.out.println("\n\tThe area of rectangle is now " + area);
        System.out.println("\tThe perimeter of rectangle is now " + perimeter);
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
        System.out.println("\tName: " + name + "\n\tJob Title: " + jobTitle + "\n\tSalary: " + salary + "\n");
    }

    public void updateSalary(double percent) {
        salary += salary * (percent/100);
        System.out.println("\t"+ percent +"% for ' " + name + " ':\n\tName: " + name + "\n\tJob Title: " + jobTitle + "\n\tNew Salary: " + salary + "\n");
    }
}