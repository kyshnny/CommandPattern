/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

/**
 *
 * @author DELL
 */
public class LightBrightness implements Command {
    private Light light;
    private int level;
    
    public LightBrightness (Light light){
        
        this.light = light;
        
    }
    
    @Override
    public void execute(){
        
        light.setBrightness(level);
        
    }
    
    @Override
    public void setParameter(String parameter){
        
        this.level = Integer.parseInt(parameter);
        
    }
    
}
