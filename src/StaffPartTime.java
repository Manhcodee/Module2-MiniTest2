public class StaffPartTime extends Staff {
    private double workingHours;
    private double time = 100000;

    public StaffPartTime(int ID, String name, int age, String phone, String email, double workingHours) {
        super(ID, name, age, phone, email);
        this.workingHours = workingHours;
    }

    public String toString() {
        return "EmployeeParttime{" +
                "id=" + getID() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", phoneNumber=" + getPhone() +
                ", email='" + getEmail() + '\'' +
                ", workHours=" + workingHours +
                '}';
    }

    public double getSalary() {
        return workingHours * time;
    }
}
