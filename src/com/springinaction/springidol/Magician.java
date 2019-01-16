package com.springinaction.springidol;
public class Magician implements Performer {
    public Magician() {}
    public void perform(){   
	System.out.println(magicWords);  
	System.out.println("The magic box contains...");    
    System.out.println(magicBox.getContents());    
	}                                      
    // внедрение    
	private MagicBox magicBox;  
	public void setMagicBox(MagicBox magicBox) { 
	this.magicBox = magicBox; // Внедрение волшебного ящика 
	}
    private String magicWords = "BOM ";
    public void setMagicWords(String magicWords) {  
	this.magicWords = magicWords;   
	}
	}
