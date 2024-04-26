/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marielen.smarttv;

/**
 *
 * @author CCE
 */
public class SmartTV {
    
    boolean on = false;
    int channel = 1;
    int volume = 0;
    
    public void turningOn (){
        if (on){
        System.out.println("TV's already on!!!");
    } 
        else {
        on = true;
        System.out.println("TV is on");
    }
        
    }
    
    public void turningOff (){
        if (on){
        on = false;
        System.out.println("TV is off");
        }
        else {
            System.out.println("TV's already off!!!");
        }
    }
    
    public void turningVolumeUp(){
        if (on && volume < 100) {
        volume+= 10;
        System.out.println("The volume of TV is " + volume);
        }
        else if (!on) {
            System.out.println("TV's off!!!");
        }
        
        else {
            System.out.println("TV's on maximum volume!!!"); 
        }
    }
   
    public void turningVolumeDown(){
        if (on && volume > 0){
            volume-= 20;
            System.out.println("The volume of TV is " + volume);
        }
        
        else if (!on) {
            System.out.println("TV's off!!!");
        }
        
        else {
            System.out.println("TV's on mute!!!"); 
        }
        
    }
    
    
    public void changingChannel(int channelNumber){
        if (on) {
        channel = channelNumber;
        System.out.println("You're at the channel " + channel);
        }
        
        else {
            System.out.println("TV's off!!!");
        }
       
    }
    
}
