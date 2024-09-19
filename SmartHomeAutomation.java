/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package commandpattern;

/**
 *
 * @author DELL | Shania Mae Ucag
 */
public class SmartHomeAutomation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        smartHomeHub hub = new smartHomeHub();
        UserInput ui = new UserInput(hub);
        ui.getUserInput();
    }
    
}
