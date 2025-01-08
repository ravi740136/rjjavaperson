package rj.java.deviceinterface;
// Implementing the Device interface with Tablet class
class Tablet implements Device {
    private int batteryLevel;

    @Override
    public void turnOn() {
        System.out.println(POWER_ON_MESSAGE + " Tablet is on.");
        batteryLevel = 60; // Set initial battery level when turning on
    }

    @Override
    public void turnOff() {
        System.out.println(POWER_OFF_MESSAGE + " Tablet is off.");
    }

    @Override
    public void connectWiFi(String network) {
        System.out.println("Tablet is connecting to Wi-Fi network: " + network);
    }

    // Optionally override default method to show battery status
    @Override
    public void showBatteryStatus(int batteryLevel) {
        System.out.println("Battery level on Tablet: " + batteryLevel + "%");
    }
}