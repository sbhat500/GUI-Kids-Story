/**
 *Name: Suraj Bhat
 *Class: CSIII
 *Teacher: Gallatin
 *Period: 1
 */
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class StoryFrame {

    public static void main(String args[]) 
    {
    	JFrame frame = new JFrame();
    	frame.setSize(900,900);
    	frame.setTitle("BLOCKCHAIN; A Story of Immense Value");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	StoryBackground story = new StoryBackground();
    	frame.add(story);
    	frame.setVisible(true);
    	
	}
    
    
}