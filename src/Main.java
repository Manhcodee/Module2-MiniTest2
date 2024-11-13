public class Main {
    public static void main(String[] args) {
        Staff[] staffMembers = createStaffList();

        double averageSalary = calculateAverageSalary(staffMembers);
        listFullTimeStaffBelowAverage(staffMembers, averageSalary);

        double totalPartTimeSalary = calculateTotalPartTimeSalary(staffMembers);
        System.out.println("Tổng lương phải trả cho tất cả nhân viên PartTime: " + totalPartTimeSalary);
    }

    private static Staff[] createStaffList() {
        return new Staff[] {
                new StaffFullTime(1, "Dung", 20, "0987654321", "dunganhai@hmail.com", 2500, 150, 5000),
                new StaffFullTime(2, "Vuong", 20, "0987654321", "vuonganhai@hmail.com", 2500, 150, 5000),
                new StaffFullTime(3, "Huy", 20, "0987654321", "huyanhai@hmail.com", 2500, 150, 5000),
                new StaffFullTime(4, "Phu", 20, "0987654321", "phuanhai@hmail.com", 2500, 150, 5000),
                new StaffFullTime(5, "Long", 20, "0987654321", "longanhai@hmail.com", 2500, 150, 5000),
                new StaffPartTime(6, "Son", 29, "0123456789", "Sonanhai@gmail.com", 120),
                new StaffPartTime(7, "Son1", 29, "0123456789", "Sonanhai@gmail.com", 120),
                new StaffPartTime(8, "Son2", 29, "0123456789", "Sonanhai@gmail.com", 120),
                new StaffPartTime(9, "Son3", 29, "0123456789", "Sonanhai@gmail.com", 120),
                new StaffPartTime(10, "Son4", 29, "0123456789", "Sonanhai@gmail.com", 120)
        };
    }

    private static double calculateAverageSalary(Staff[] staffMembers) {
        double totalSalary = 0;
        for (Staff staff : staffMembers) {
            totalSalary += staff.getSalary();
        }
        double averageSalary = totalSalary / staffMembers.length;
        System.out.printf("Lương trung bình của nhân viên trong công ty: %.2f%n", averageSalary);
        return averageSalary;
    }

    private static void listFullTimeStaffBelowAverage(Staff[] staffMembers, double averageSalary) {
        System.out.println("Danh sách nhân viên full-time có lương thấp hơn lương trung bình:");
        for (Staff staff : staffMembers) {
            if (staff instanceof StaffFullTime) {
                if (staff.getSalary() < averageSalary) {
                    System.out.printf("%s - Lương: %.2f%n", staff.getName(), staff.getSalary());
                }
            }
        }
    }

    private static double calculateTotalPartTimeSalary(Staff[] staffMembers) {
        double totalPartTimeSalary = 0;
        for (Staff staff : staffMembers) {
            if (staff instanceof StaffPartTime) {
                totalPartTimeSalary += staff.getSalary();
            }
        }
        return totalPartTimeSalary;
    }
}
