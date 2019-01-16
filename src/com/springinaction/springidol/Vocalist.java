package com.springinaction.springidol;
public class Vocalist implements Performer {

	public Vocalist() {    }
    public void perform(){
        System.out.print("Playing " + song);    
		}
    private String song;
    public void setSong(String song) {  // Внедрение мелодии         
	this.song = song;              
    }
    public String getSong() {
        return song;   
		}
    public String screamSong() { 
	return song;   
	}
 
	}