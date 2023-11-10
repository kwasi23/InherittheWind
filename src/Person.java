// Import the Calendar class for getting the current year
import java.util.Calendar;

// Declare a public class named "Person"
public class Person {
    // Declare private member variables to store person attributes.
    // 'ID' is final since it should not change once set.
    private String firstName;
    private String lastName;
    private final String ID;
    private String title;
    private int YOB;  // Year of Birth

    // Constructor: Initializes the member variables with the provided arguments
    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    // Define a method that returns the full name of the person
    public String fullName() {
        return firstName + " " + lastName;
    }

    // Define a method that returns the formal name, including the title
    public String formalName() {
        return title + " " + fullName();
    }

    // Define a method that calculates and returns the age using the current year
    public int getAge() {
        // Get the current year
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        // Return the age by subtracting the year of birth from the current year
        return currentYear - YOB;
    }

    // Define a method that calculates and returns the age at a specific year provided as a parameter
    public int getAge(int year) {
        // Return the age by subtracting the year of birth from the provided year
        return year - YOB;
    }

    // Define a method that returns a CSV record of the person's data
    public String toCSVDataRecord() {
        // Concatenate the data members with commas and return the result
        return ID + "," + firstName + "," + lastName + "," + title + "," + YOB;
    }

    // Override the toString method to provide a meaningful representation of the person
    @Override
    public String toString() {
        // Return a string that concisely represents the person
        return ID + "  " + formalName() + "  " + YOB;
    }

}