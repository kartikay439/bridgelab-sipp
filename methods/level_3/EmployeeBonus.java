package level_3;

public class EmployeeBonus {
    public static int[][] generateEmployeeData() {
        int[][] employees = new int[10][2];
        for (int i = 0; i < 10; i++) {
            employees[i][0] = 30000 + (int)(Math.random() * 70000); // Salary (30,000-99,999)
            employees[i][1] = 1 + (int)(Math.random() * 15);       // Years of service (1-15)
        }
        return employees;
    }

    public static double calculateBonus(int salary, int yearsOfService) {
        if (yearsOfService > 5) {
            return salary * 0.05;
        } else {
            return salary * 0.02;
        }
    }

    public static void main(String[] args) {
        int[][] employees = generateEmployeeData();
        double totalBonus = 0;

        System.out.println("Emp# | Salary | Years | Bonus | New Salary");
        System.out.println("------------------------------------------");

        for (int i = 0; i < employees.length; i++) {
            int salary = employees[i][0];
            int years = employees[i][1];
            double bonus = calculateBonus(salary, years);
            totalBonus += bonus;

            System.out.printf("%4d | %6d | %5d | %6.2f | %6d\n",
                    i+1, salary, years, bonus, salary + (int)bonus);
        }

        System.out.println("\nTotal bonus to be paid: " + String.format("%.2f", totalBonus));
    }
}