package rj.java.deviceinterface;
// Device Interface with Constants, Abstract Methods, Default Methods, and Static Methods
interface Device {
    // Constants (public static final variables)
    int MAX_BATTERY = 100;  // Maximum battery level
    int MIN_BATTERY = 0;    // Minimum battery level
    String POWER_ON_MESSAGE = "Device is powered on.";
    String POWER_OFF_MESSAGE = "Device is powered off.";

    // Abstract methods (to be implemented by the classes)
    void turnOn();          // Turn on the device
    void turnOff();         // Turn off the device
    void connectWiFi(String network); // Connect to Wi-Fi

    // Default method (provides a default implementation)
    default void showBatteryStatus(int batteryLevel) {
        if (batteryLevel == MAX_BATTERY) {
            System.out.println("Battery is fully charged.");
        } else if (batteryLevel == MIN_BATTERY) {
            System.out.println("Battery is empty.");
        } else {
            System.out.println("Battery level: " + batteryLevel + "%");
        }
    }

    // Static method (can be called on the interface itself)
    static void showDeviceInfo() {
        System.out.println("This interface defines the basic operations for any device.");
    }

    // Default method to simulate turning on the Wi-Fi
    default void enableWiFi() {
        System.out.println("Wi-Fi is enabled on the device.");
    }

    // Default method to simulate turning off the Wi-Fi
    default void disableWiFi() {
        System.out.println("Wi-Fi is disabled on the device.");
    }
}