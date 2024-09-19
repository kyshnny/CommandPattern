/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

/**
 *
 * @author DELL
 */
public class turnON implements Command {
    private smartHomeDevice device;
    
    public turnON (smartHomeDevice device){
        
        this.device = device;
        
    }
    
    @Override
    public void execute(){
        
        device.turnON();
        
    }
    
    @Override
    public void setParameter(String parameter){
        
    }
    
}
