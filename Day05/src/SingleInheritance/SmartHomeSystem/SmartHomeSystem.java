package SingleInheritance.SmartHomeSystem;

public class SmartHomeSystem {
    public static void main(String[] args) {
        // Creating an object for Thermostat
        Thermostat thermostat = new Thermostat("TH123", "ON", 22);

        // Displaying thermostat status
        System.out.println("Smart Home Device Status:");
        thermostat.displayStatus();
    }
}

