import java.util.ArrayList;
import java.util.List;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create workers
        Worker w1 = new Worker("Ichigo", "Kurosaki", "001", "Mr.", 1990, 20);
        Worker w2 = new Worker("Naruto", "Uzumaki", "002", "Mr.", 1995, 22);
        Worker w3 = new Worker("Luffy", "Monkey", "003", "Mr.", 1985, 25);

        // Create salary workers
        SalaryWorker sw1 = new SalaryWorker("Anna", "Smith", "004", "Ms.", 1995, 52000);
        SalaryWorker sw2 = new SalaryWorker("Bob", "Marley", "005", "Mr.", 1980, 60000);
        SalaryWorker sw3 = new SalaryWorker("Charlie", "Brown", "006", "Mr.", 1990, 48000);

        // Add workers to the list
        List<Worker> workers = new ArrayList<>();
        workers.add(w1);
        workers.add(w2);
        workers.add(w3);
        workers.add(sw1);
        workers.add(sw2);
        workers.add(sw3);

        // Simulate 3 weekly pay periods
        int[] weeklyHours = {40, 50, 40};  // given weekly working hours

        for (int week = 0; week < weeklyHours.length; week++) {
            System.out.println("Week " + (week + 1) + " payment details:");
            for (Worker worker : workers) {
                System.out.println(worker.fullName() + ":");
                System.out.println(worker.showWeeklyPayment(weeklyHours[week]));
                System.out.println("----------");
            }
            System.out.println("======================");
        }
    }
}
