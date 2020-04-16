import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;
import java.util.*;



class DialogueBackground extends JComponent{
	
	private Scanner sc;
	private ArrayList<String> text;
	private JTextArea theStory;
	private int counter;
    public DialogueBackground() 
    {
    	//imageSet = new ArrayList<String>();
    	counter = 0;
    	text = new ArrayList<String>();
    	text.add("test.txt");
    	text.add("test2.txt");
    	text.add("test3.txt");
    	text.add("test4.txt");
    	
    	//currentImage = imageSet.get(counter);
    	//addButton();
    	addTextArea();
    	//x= 10;
    	//y=10;
    }
    
    public void addTextArea()
    {
    	theStory = new JTextArea("");
    	theStory.setEditable(false);
    	theStory.setCursor(null);
    	theStory.setOpaque(false);
    	theStory.setFocusable(false);
    	theStory.setLineWrap(true);
    	theStory.setWrapStyleWord(true);
    	theStory.setPreferredSize(new Dimension(200,200));
    	try 
    	{
  			sc = new Scanner(new File(text.get(counter)));
  			String story = "";
  			while (sc.hasNext())
  			{
  				story +="\n" + sc.nextLine() + "\n";
  			}
    		theStory.setText(story);
    	}
    	catch(FileNotFoundException e)
    	{
    		System.out.println (e);
    	}
    	
		//theImage.addActionListener(this);
		setLayout(new FlowLayout());
		add(theStory, BorderLayout.NORTH);
    }
    public void setCounter(int x)
    {
    	counter = x;
    	//System.out.println (counter);
    }
	public void updateText()
	{
		try
		{
			//sc = new Scanner(new File(text.get(counter)));
			sc = new Scanner(new File(text.get(counter)));
  			String story = "";
  			while (sc.hasNext())
  			{
  				story +=  "\n" + sc.nextLine() + "\n";
  			}
			theStory.setText(story);
		}
		catch(Exception e)
		{
			System.out.println (e);
		}
		
	}
	public int getCounter()
	{
		return counter;
	}

    
    
}