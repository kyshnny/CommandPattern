/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

/**
 *
 * @author DELL
 */
public class ThermostatTemperature implements Command {
    private Thermostat thermostat;
    private int temperature;
    
    public ThermostatTemperature (Thermostat thermostat){
        
        this.thermostat = thermostat;
        
    }
    
    @Override
    public void execute(){
        
        thermostat.setTemperature(temperature);
        
    }
    
    @Override
    public void setParameter(String parameter){
        
        this.temperature = Integer.parseInt(parameter);
        
    }
    
}
