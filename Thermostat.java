/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

/**
 *
 * @author DELL
 */
public class Thermostat implements smartHomeDevice {
    private int temperature;
    
    @Override
    public void turnON(){
        
        System.out.println();
        System.out.println("The Thermostat is turned ON.");
        
    }
    
    @Override
    public void turnOFF(){
        
        System.out.println("The Thermostat is turned OFF.");
        System.out.println();
        
    }
    
    public void setTemperature (int temperature){
        
        this.temperature = temperature;
        System.out.println("Thermostat temperature set to: " + temperature + "°C");
        System.out.println();
        
    }
    
    @Override
    public void executeCommand (String command){
        if(command.startsWith("setTemperature")){
            int temp = Integer.parseInt(command.split(" ")[1]);
            setTemperature(temp);
        }
        
    }
    
}
