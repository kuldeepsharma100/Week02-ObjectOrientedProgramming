package problemstatements.employeemanagementsystem;

class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private double hourlyRate;
    private String departmentName;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return getBaseSalary() + (workHours * hourlyRate);
    }

    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}

