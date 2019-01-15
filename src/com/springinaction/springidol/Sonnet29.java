package com.springinaction.springidol; 

public class Sonnet29 implements Poem {
	private static String[] LINES = {        
	"1",       
	"2",       
	"3",        
	"4",     
	"5",      
	"6",   
	"7",    
    "8",    
    "9",   
	"10",     
	"11",    
    "12",      
	"13",  
	"14"};
	
	public Sonnet29(){
		
	}
	
	public void recite(){
		for(int i=0; i<LINES.length; i++){
			System.out.println(LINES[i]);
		}
	}
}
	