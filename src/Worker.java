public class Worker extends Person {

    protected double hourlyWage;

    public Worker(String first, String last, String IDNum, String title, int birthYear, double hourlyWage) {
        super(first, last, IDNum, title, birthYear);
        this.hourlyWage = hourlyWage;
    }

    public double weeklyPayment(double workedHours) {
        if (workedHours <= 40) {
            return workedHours * hourlyWage;
        } else {
            double overtimeHours = workedHours - 40;
            return (40 * hourlyWage) + (overtimeHours * hourlyWage * 1.5);
        }
    }

    public String showWeeklyPayment(double workedHours) {
        return String.format("Weekly Earnings of %s for %.2f hours: $%.2f", fullName(), workedHours, weeklyPayment(workedHours));
    }
}
