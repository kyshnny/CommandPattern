/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class UserInput {
    private smartHomeHub hub;
    private Scanner sc;
    
    public UserInput(smartHomeHub hub){
        
        this.hub = hub;
        this.sc = new Scanner(System.in);
        
    }
    
    public void getUserInput(){
        
        while (true) {
            System.out.println("Enter command ['Turn ON Light', 'Set brightness 100 Light', 'Set temperature 22 Thermostat', 'Set volume 100 Music Player', 'Play myTreasurePlaylist Music Player', 'Exit'): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("Exit")) {
                break;
            }

            processInput(input);
        }
        
    }
    
    private void processInput(String input) {
        String[] parts = input.split(" ", 3);
        String commandType = parts[0] + " " + parts[1];
        smartHomeDevice device = null;

        
        if (parts[2].equalsIgnoreCase("Light")) {
            device = new Light();
        } else if (parts[2].equalsIgnoreCase("Thermostat")) {
            device = new Thermostat();
        } else if (parts[2].equalsIgnoreCase("Music Player")) {
            device = new MusicPlayer();
        }

        if (device != null) {
            if (commandType.equalsIgnoreCase("Turn ON") || commandType.equalsIgnoreCase("Turn OFF")) {
                
                hub.executeCommand(commandType, null, device);
                
            } else if (commandType.startsWith("set brightness")) {
                
                String brightness = parts[1];
                hub.executeCommand("set brightness", brightness, device);
                
            } else if (commandType.startsWith("set temperature")) {
                
                String temperature = parts[1];
                hub.executeCommand("set temperature", temperature, device);
                
            } else if (commandType.startsWith("set volume")) {
                
                String volume = parts[1];
                hub.executeCommand("set volume", volume, device);
                
            } else if (commandType.startsWith("play")) {
                String playlist = parts[1];
                hub.executeCommand("play", playlist, device);
            } else {
                System.out.println("Invalid Command");
            }
        } else {
            System.out.println("Invalid Device");
        }
        
    }
    
}
