import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryWorkerTest {
    @Test
    public void testCalculateWeeklyPay() {
        SalaryWorker sw = new SalaryWorker("Anna", "Smith", "004", "Ms.", 1995, 52000); // annual salary: 52000 (1000 per week)
        // Change from calculateWeeklyPay to weeklyPayment
        assertEquals(1000, sw.weeklyPayment(0), "Weekly pay should be 1000");
    }

    @Test
    public void testDisplayWeeklyPay() {
        SalaryWorker sw = new SalaryWorker("Anna", "Smith", "004", "Ms.", 1995, 52000);
        // Change from displayWeeklyPay to showWeeklyPayment
        assertEquals("Total Pay for Anna Smith: $1000.00 (Salary Worker)", sw.showWeeklyPayment(0), "Output mismatch");
    }
}
