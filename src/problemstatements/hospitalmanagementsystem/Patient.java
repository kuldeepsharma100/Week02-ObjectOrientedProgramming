package problemstatements.hospitalmanagementsystem;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Concrete method
    public String getPatientDetails() {
        String res = "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
        return res;
    }

    // Abstract method
    public abstract double calculateBill();
}
