package problemstatements.employeemanagementsystem;

class FullTimeEmployee extends Employee implements Department {
    private double bonus;
    private String departmentName;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }


    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }


    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}

