/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

/**
 *
 * @author DELL
 */
public class turnOFF implements Command {
    private smartHomeDevice device;
    
    public turnOFF (smartHomeDevice device){
        
        this.device = device;
        
    }
    
    @Override
    public void execute(){
        
        device.turnOFF();
        
    }
    
    @Override
    public void setParameter(String parameter){
        
    }
    
}
