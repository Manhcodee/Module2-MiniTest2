public class StaffFullTime extends Staff {

    private double bonus;
    private double fine;
    private double fixedSalary;

    public StaffFullTime(int id, String name, int age, String phone, String email, double bonus, double fine, double fixedSalary) {
        super(id, name, age, phone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.fixedSalary = fixedSalary;
    }

    @Override
    public String toString() {
        return String.format("StaffFullTime {ID: %d, Name: '%s', Age: %d, Phone: %s, Email: '%s', Bonus: %.2f, Fine: %.2f, Fixed Salary: %.2f}",
                getID(), getName(), getAge(), getPhone(), getEmail(), bonus, fine, fixedSalary);
    }

    @Override
    public double getSalary() {
        return fixedSalary + bonus - fine;
    }
}
