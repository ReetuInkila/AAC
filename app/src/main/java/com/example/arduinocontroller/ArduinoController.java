package com.example.arduinocontroller;
import java.util.ArrayList;
import java.util.List;

public class ArduinoController {

    private String macAddress;
    private List<String> messages;

    public ArduinoController() {
        this.messages = new ArrayList<>();
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void addMessage(String message) {
        messages.add(message);
    }

    public void clearMessages() {
        messages.clear();
    }

    public void printMessages() {
        for (String message : messages) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        // Esimerkki käytöstä
        ArduinoController arduinoController = new ArduinoController();
        arduinoController.setMacAddress("00:11:22:33:44:55");
        arduinoController.addMessage("Hello, Arduino!");
        arduinoController.addMessage("How are you?");
        arduinoController.printMessages();
    }
}
