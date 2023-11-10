import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void fullName() {
        Person person = new Person("John", "Doe", "001", "Mr.", 1980);
        assertEquals("John Doe", person.fullName());
    }

    @Test
    void formalName() {
        Person person = new Person("John", "Doe", "001", "Mr.", 1980);
        assertEquals("Mr. John Doe", person.formalName());
    }

    @Test
    void getAge() {
        Person person = new Person("John", "Doe", "001", "Mr.", 1980);
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        assertEquals(currentYear - 1980, person.getAge());
    }

    @Test
    void getAgeForYear() {
        Person person = new Person("John", "Doe", "001", "Mr.", 1980);
        assertEquals(30, person.getAge(2010));
    }
}