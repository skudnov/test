package com.springinaction.springidol;
public abstract class Instrumentalist implements Performer { 
    public Instrumentalist() {}
    public void perform(){   
	System.out.print("Playing " + song + " : ");  
	getInstrument().play();  
    }                        
    private String song;
    public void setSong(String song) { 
	this.song = song;   
	}
    public abstract Instrument getInstrument(); // Внедряемый метод 
	}

