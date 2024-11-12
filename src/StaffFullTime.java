public class StaffFullTime extends Staff {
    private double moneyBonus;
    private double moneyFine;
    private double baseSalary;

    public StaffFullTime(int ID, String name, int age, String phone, String email, double moneyBonus, double moneyFine, double baseSalary ){
        super(ID, name, age, phone, email);
        this.moneyFine = moneyFine;
        this.moneyBonus = moneyBonus;
        this.baseSalary = baseSalary;
    }

    public String toString() {
        return "StaffFulltime{" +
                "id=" + getID() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", phoneNumber=" + getPhone() +
                ", email='" + getEmail() + '\'' +
                ", bonus=" + moneyBonus +
                ", fine=" + moneyFine +
                ", fixedSalary=" + baseSalary +
                '}';
    }

    public double getSalary() {
        return baseSalary + (moneyBonus - moneyFine);
    }
}
