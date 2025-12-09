class Contact {
    private String phone;
    private String email;

    Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}

class Student {
    private String name;
    private Contact contact;   

    Student(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public Contact getContact() {
        return contact;
    }
}

class School {
    private String schoolName;
    private Student[] students; 
    private int count = 0;

    School(String schoolName, int size) {
        this.schoolName = schoolName;
        students = new Student[size]; 
    }

    public void addStudent(Student s) {
        if (count < students.length) {
            students[count++] = s;
        } else {
            System.out.println("No space for more students!");
        }
    }

    public void showStudents() {
        System.out.println("Students of " + schoolName + ":");
        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + students[i].getName());
            System.out.println("Phone: " + students[i].getContact().getPhone());
            System.out.println("Email: " + students[i].getContact().getEmail());
            System.out.println("----------------------------");
        }
    }
}

public class schoolMain {
    public static void main(String[] args) {
        
        Contact c1 = new Contact("01711111111", "a@example.com");
        Contact c2 = new Contact("01822222222", "b@example.com");

        
        Student s1 = new Student("Areeb", c1);
        Student s2 = new Student("Rahim", c2);

        
        School school = new School("Chittagong High School", 5);

        
        school.addStudent(s1);
        school.addStudent(s2);

        
        school.showStudents();
    }
}
