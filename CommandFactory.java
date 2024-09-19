/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;
/**
 *
 * @author DELL
 */
public class CommandFactory {
    public Command createCommand(String type, smartHomeDevice device){
        switch(type.toLowerCase()){
            case "turn on" -> {
                return new turnON(device);
            }
            case "turn off" -> {
                return new turnOFF(device);
            }
            case "set brightness" -> {
                return new LightBrightness((Light) device);
            }
            case "set temperature" -> {
                return new ThermostatTemperature((Thermostat) device);
            }
            case "set volume" -> {
                return new MusicPlayerVolume((MusicPlayer) device);
            }
                
            default -> throw new IllegalArgumentException("Unknown command type");
        }
        
    }
    
}
