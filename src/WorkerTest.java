import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkerTest {

    @Test
    public void validateWeeklyPayWithoutOvertime() {
        // Changing name to Ichigo Kurosaki and adjusting hourly wage for demonstration
        Worker workerInstance = new Worker("Ichigo", "Kurosaki", "002", "Mr.", 1995, 30);
        assertEquals(1200, workerInstance.weeklyPayment(40), "Expected payment for 40 hours is 1200");
    }

    @Test
    public void validateWeeklyPayWithOvertime() {
        // Changing name to Ichigo Kurosaki and adjusting hourly wage for demonstration
        Worker workerInstance = new Worker("Ichigo", "Kurosaki", "002", "Mr.", 1995, 30);
        assertEquals(1650, workerInstance.weeklyPayment(50), "Expected payment for 50 hours (with overtime) is 1650");
    }

    @Test
    public void validateOutputWithoutOvertime() {
        // Changing name to Ichigo Kurosaki and adjusting hourly wage for demonstration
        Worker workerInstance = new Worker("Ichigo", "Kurosaki", "002", "Mr.", 1995, 30);
        assertEquals("Weekly Earnings of Ichigo Kurosaki for 40.00 hours: $1200.00", workerInstance.showWeeklyPayment(40), "Output format or calculation mismatch");
    }

    @Test
    public void validateOutputWithOvertime() {
        // Changing name to Ichigo Kurosaki and adjusting hourly wage for demonstration
        Worker workerInstance = new Worker("Ichigo", "Kurosaki", "002", "Mr.", 1995, 30);
        assertEquals("Weekly Earnings of Ichigo Kurosaki for 50.00 hours: $1650.00", workerInstance.showWeeklyPayment(50), "Output format or calculation mismatch");
    }
}
