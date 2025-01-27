package SingleInheritance.SmartHomeSystem;

class Thermostat extends Device {
    int temperatureSetting;

    // Constructor for Thermostat
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        // Call to superclass constructor
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public void displayStatus() {
        super.displayStatus(); // Display general device details
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

