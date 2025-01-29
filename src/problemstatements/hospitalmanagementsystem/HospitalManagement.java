package problemstatements.hospitalmanagementsystem;
import java.util.*;
public class HospitalManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        // Adding patients
        InPatient inPatient = new InPatient("P001", "Harsh", 45, 3455, 5);
        inPatient.addRecord("Admitted for surgery");
        inPatient.addRecord("For checkup");

        OutPatient outPatient = new OutPatient("P002", "Kanishk", 22, 500);
        outPatient.addRecord("Routine checkup");

        patients.add(inPatient);
        patients.add(outPatient);

        // Processing patients
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                System.out.println("Medical Records: " + record.viewRecords());
            }

            System.out.println();
        }
    }
}

