/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

/**
 *
 * @author DELL
 */
public class MusicPlayer implements smartHomeDevice {
    private int volume;
    
    @Override
    public void turnON(){
        
        System.out.println();
        System.out.println("The Music Player is turned ON.");
        setVolume(100);
        
    }
    
    @Override
    public void turnOFF(){
        
        System.out.println("The Music Player is turned OFF.");
        System.out.println();
        
    }
    
    public void setVolume(int volume){
        
        this.volume = volume;
        System.out.println("Volume set to: " + volume);
    }
    
    public void play_Playlist (String playlist){
        
        System.out.println("Now Playing. Playlist: " + playlist);
        System.out.println();
        
    }
    
    @Override
    public void executeCommand (String command){
        if(command.startsWith("play")){
            String playlist = command.split(" ")[1];
            play_Playlist(playlist);
        } else if (command.startsWith("setVolume")){
            int vol = Integer.parseInt(command.split(" ")[1]);
            setVolume(vol);
            
        }
        
    }
    
}
