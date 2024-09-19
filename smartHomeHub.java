/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DELL
 */
public class smartHomeHub {
    private List<smartHomeDevice> devices = new ArrayList<>();
    private CommandFactory commandFactory = new CommandFactory();
    
    public void addDevice (smartHomeDevice device){
        
        devices.add(device);
        
    }
    
    public void executeCommand (String commandType, String commandParameter, smartHomeDevice device){
        Command command = commandFactory.createCommand(commandType, device);
        
        if(commandParameter != null){
            command.setParameter(commandParameter);
        }
        
        command.execute();
        
    }
    
}
