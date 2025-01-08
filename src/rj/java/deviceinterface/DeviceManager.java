package rj.java.deviceinterface;

// DeviceManager class that acts on different device objects
class DeviceManager {
    // Method that takes a Device interface parameter and acts on different objects
    public void manageDevice(Device device) {
        // Here we are calling methods on different objects (Smartphone, Laptop, Tablet) 
        // through the common Device interface
        device.turnOn();
        device.connectWiFi("HomeNetwork");
        device.showBatteryStatus(50); // Assuming 50 is the battery level passed
        device.turnOff();
    }
    public static void main(String[] args) {
        DeviceManager deviceManager = new DeviceManager();

        // Creating different devices (Smartphone, Laptop, Tablet)
        Device smartphone = new Smartphone();
        Device laptop = new Laptop();
        Device tablet = new Tablet();

        // Managing devices using the same method
        System.out.println("Managing Smartphone:");
        deviceManager.manageDevice(smartphone);

        System.out.println("\nManaging Laptop:");
        deviceManager.manageDevice(laptop);

        System.out.println("\nManaging Tablet:");
        deviceManager.manageDevice(tablet);
    }
}