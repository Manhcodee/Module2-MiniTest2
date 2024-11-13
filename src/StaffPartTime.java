public class StaffPartTime extends Staff {

    private double workingHours;
    private double hourlyRate = 100000;

    public StaffPartTime(int id, String name, int age, String phone, String email, double workingHours) {
        super(id, name, age, phone, email);
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return String.format("StaffPartTime {ID: %d, Name: '%s', Age: %d, Phone: %s, Email: '%s', Work Hours: %.2f}",
                getID(), getName(), getAge(), getPhone(), getEmail(), workingHours);
    }

    @Override
    public double getSalary() {
        return workingHours * hourlyRate;
    }
}
