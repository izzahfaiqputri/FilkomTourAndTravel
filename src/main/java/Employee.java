import java.util.*;

public class Employee {
    private String name;
    private String phoneNumber;
    private String gender;
    private String category;

    public Employee(String name, String phoneNumber, String gender, String category) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.category = category;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Gender (Male/Female): " + gender);
        System.out.println("Category: " + category);
    }

    public void work() {
        System.out.println(name + " is working in general duties.");
    }

    protected String getName() {
        return name;
    }
}

