/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

/**
 *
 * @author DELL
 */
public class Light implements smartHomeDevice {
    private int brightness;
    
    @Override
    public void turnON(){
        
        System.out.println("The Light is turned ON.");
        setBrightness(100);
        
    }
    
    @Override
    public void turnOFF(){
        
        System.out.println("The Light is turned OFF.");
        System.out.println();
        
    }
    
    public void setBrightness (int brightness){
        
        this.brightness = brightness;
        System.out.println("Light brightness set to: " + brightness);
        
    }
    
    @Override
    public void executeCommand (String command){
        if(command.startsWith("setBrightness")){
            int level = Integer.parseInt(command.split(" ")[1]);
            setBrightness(level);
        }
        
    }
     
}
