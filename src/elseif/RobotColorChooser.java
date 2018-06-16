//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	//private static 

	public static void main(String[] args) {
		//1. Create a new Robot
		Robot Bob = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String answer=JOptionPane.showInputDialog(null,"What color do u want your robot to color/draw with?");
		
		//5. Use an if/else statement to set the pen color that the user requested
       for(int i=0; i<10;i++) {
		if(answer.equals("green")) {
        	Bob.setPenColor(120, 165, 212);
        	Bob.penDown();
        }
        else if(answer.equals("blue")) {
        Bob.setPenColor(130,239,230);
    		Bob.penDown();
        }
		else if(answer.equals("purple")) {
		Bob.setPenColor(234,123,110);	
		Bob.penDown();
       }
        //6. If the user doesn’t enter anything, choose a random color
          Bob.setRandomPenColor();
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		Bob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		//for(int i =0; i<360;i++) {
			Bob.move(5);
			Bob.turn(5);
		}

	}
}
