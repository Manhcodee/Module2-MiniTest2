//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Staff[] staffs = new Staff[10];
        staffs[0] = new StaffFullTime(1, "Dung", 20, "0987654321", "dunganhai@hmail.com", 2500, 150, 5000);
        staffs[1] = new StaffFullTime(2, "Vuong", 20, "0987654321", "vuonganhai@hmail.com", 2500, 150, 5000);
        staffs[2] = new StaffFullTime(3, "Huy", 20, "0987654321", "huyanhai@hmail.com", 2500, 150, 5000);
        staffs[3] = new StaffFullTime(4, "Phu", 20, "0987654321", "phuanhai@hmail.com", 2500, 150, 5000);
        staffs[4] = new StaffFullTime(5, "Long", 20, "0987654321", "longanhai@hmail.com", 2500, 150, 5000);
        staffs[5] = new StaffPartTime(6, "Son", 29, "0123456789", "Sonanhai@gmail.com", 120);
        staffs[6] = new StaffPartTime(7, "Son1", 29, "0123456789", "Sonanhai@gmail.com", 120);
        staffs[7] = new StaffPartTime(8, "Son2", 29, "0123456789", "Sonanhai@gmail.com", 120);
        staffs[8] = new StaffPartTime(9, "Son3", 29, "0123456789", "Sonanhai@gmail.com", 120);
        staffs[9] = new StaffPartTime(10, "Son4", 29, "0123456789", "Sonanhai@gmail.com", 120);

        double averageSalary = calculateAverageSalary(staffs);
        listFullTimeStaffBelowAverage(staffs, averageSalary);
        double totalPartTimeSalary = calculateTotalPartTimeSalary(staffs);
        System.out.println("Tổng lương phải trả cho tất cả nhân viên PartTime: " + totalPartTimeSalary);
    }

    private static double calculateAverageSalary(Staff[] staffs) {
        double totalSalary = 0;
        for (Staff staff : staffs) {
            totalSalary += staff.getSalary();
        }
        double averageSalary = totalSalary / staffs.length;
        System.out.println("Lương trung bình của nhân viên trong công ty: " + averageSalary);
        return averageSalary;
    }

    // Phương thức liệt kê nhân viên full-time có lương thấp hơn lương trung bình
    private static void listFullTimeStaffBelowAverage(Staff[] staffs, double averageSalary) {
        System.out.println("Danh sách nhân viên fullTime có lương thấp hơn lương trung bình:");
        for (Staff staff : staffs) {
            if (staff instanceof StaffFullTime && staff.getSalary() < averageSalary) {
                System.out.println(staff.getName() + " - Lương: " + staff.getSalary());
            }
        }
    }

    // Phương thức tính tổng lương của nhân viên PartTime
    private static double calculateTotalPartTimeSalary(Staff[] staffs) {
        double totalPartTimeSalary = 0;
        for (Staff staff : staffs) {
            if (staff instanceof StaffPartTime) {
                totalPartTimeSalary += staff.getSalary();
            }
        }
        return totalPartTimeSalary;
    }

}