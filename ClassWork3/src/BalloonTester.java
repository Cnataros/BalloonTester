/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris
 */
public class BalloonTester {
    
    
    	public static void main (String args[])
	{
            Balloon balloonOne = new Balloon("chrisBalloon", 150);
            Balloon balloonTwo = new Balloon ("luannaBalloon", -50);
            
            balloonOne.getAltitude();
            balloonOne.getName();
            
            System.out.println("balloonOne has the Altitude of " + 
                                balloonOne.getAltitude()+ " and and the Name of " 
                                + balloonOne.getName());
            
            balloonTwo.getAltitude();
            balloonTwo.getName();
            
                        System.out.println("balloonTwo has the Altitude of " + 
                                balloonTwo.getAltitude()+ " and and the Name of " 
                                + balloonTwo.getName());
            
        
        }

    
    
}
