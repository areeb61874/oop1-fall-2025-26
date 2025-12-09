class Position {
    private String title;
    private double salary;

    Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }
}

class Employee {
    private String name;
    private Position position;   

    Employee(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}

class Company {
    private String companyName;
    private Employee[] employees;   
    private int count = 0;

    Company(String companyName, int size) {
        this.companyName = companyName;
        employees = new Employee[size];  
    }

    public void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
        } else {
            System.out.println("No space for more employees!");
        }
    }

    public void showEmployees() {
        System.out.println("Employees of " + companyName + ":");
        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + employees[i].getName());
            System.out.println("Position: " + employees[i].getPosition().getTitle());
            System.out.println("Salary: " + employees[i].getPosition().getSalary());
            System.out.println("--------------------------------");
        }
    }
}

public class companyMain {
    public static void main(String[] args) {
       
        Position p1 = new Position("Software Engineer", 60000);
        Position p2 = new Position("HR Manager", 50000);
        Position p3 = new Position("Accountant", 45000);

        Employee e1 = new Employee("Areeb", p1);
        Employee e2 = new Employee("Karim", p2);
        Employee e3 = new Employee("Rahman", p3);

      
        Company comp = new Company("TechWave Ltd.", 5);

        
        comp.addEmployee(e1);
        comp.addEmployee(e2);
        comp.addEmployee(e3);

        
        comp.showEmployees();
    }
}
