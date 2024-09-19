/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

/**
 *
 * @author DELL
 */
public class MusicPlayerVolume implements Command {
    private MusicPlayer musicPlayer;
    private int volume;
    
    public MusicPlayerVolume (MusicPlayer musicPlayer){
        
        this.musicPlayer = musicPlayer;
        
    }
    
    @Override
    public void execute(){
        
        musicPlayer.setVolume(volume);
        
    }
    
    @Override
    public void setParameter(String parameter){
        
        this.volume = Integer.parseInt(parameter);
        
    }
    
}
