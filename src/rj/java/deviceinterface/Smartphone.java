package rj.java.deviceinterface;
// Implementing the Device interface with Smartphone class
class Smartphone implements Device {
    private int batteryLevel;

    @Override
    public void turnOn() {
        System.out.println(POWER_ON_MESSAGE + " Smartphone is on.");
        batteryLevel = 50; // Set initial battery level when turning on
    }

    @Override
    public void turnOff() {
        System.out.println(POWER_OFF_MESSAGE + " Smartphone is off.");
    }

    @Override
    public void connectWiFi(String network) {
        System.out.println("Smartphone is connecting to Wi-Fi network: " + network);
    }

    // Optionally override default method to show battery status
    @Override
    public void showBatteryStatus(int batteryLevel) {
        if (batteryLevel < 20) {
            System.out.println("Warning: Battery is low on Smartphone.");
        } else {
            System.out.println("Battery level on Smartphone: " + batteryLevel + "%");
        }
    }
}