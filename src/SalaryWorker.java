public class SalaryWorker extends Worker {
    protected double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double annualSalary) {
        // Passing 0 as the hourlyWage because it's not applicable for a salary worker
        super(firstName, lastName, ID, title, YOB, 0);
        this.annualSalary = annualSalary;
    }

    // Overriding weeklyPayment from Worker class
    @Override
    public double weeklyPayment(double hoursWorked) {
        return annualSalary / 52;
    }

    // Overriding showWeeklyPayment from Worker class
    @Override
    public String showWeeklyPayment(double hoursWorked) {
        return String.format("Total Pay for %s: $%.2f (Salary Worker)", fullName(), weeklyPayment(hoursWorked));
    }
}
