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



class StoryBackground extends JComponent implements ActionListener, KeyListener{
		
		private int x,y;
    	//private JButton choice;
    	//private ImageCreator images;
    	//private String currentImage;
		private ArrayList<String> imageSet;
    	private JLabel theImage;
    	private JButton next;
    	private JButton back;
    	private JPanel panel;
    	private int counter;
    	private ArrayList<String>documentSet;
    	private DialogueBackground dialogue;
    	private DialogueFrame diaFrame;
    	private JComboBox ToC;
    	
    public StoryBackground() 
    {
    	imageSet = new ArrayList<String>();
    	documentSet = new ArrayList<String>();
    	documentSet.add("test.txt");
    	documentSet.add("test2.txt");
    	documentSet.add("test3.txt");
    	documentSet.add("test4.txt");
    	counter =0;
    	imageSet.add("test.jpg");
    	imageSet.add("test2.jpg");
    	imageSet.add("test3.jpg");
    	imageSet.add("test4.jpg");
    	//currentImage = imageSet.get(counter);
    	panel = new JPanel(new BorderLayout());
    	add(panel);
    	addButton();
    	addLabel();
    	addDialogue();
    	addBox();

    }
    
    public void addBox()
    {
    	ToC = new JComboBox();
    	ToC.addItem("1");
    	ToC.addItem("2");
    	ToC.addItem("3");
    	ToC.addItem("4");
    	panel.add(ToC, BorderLayout.SOUTH);
    }
    public void addLabel()
    {
    	theImage = new JLabel("");
    	theImage.setPreferredSize(new Dimension(800,800));
    	try
    	{
    		String imagePath = imageSet.get(counter);
    		InputStream imgStream = getClass().getResourceAsStream(imagePath);
    		Image img= ImageIO.read(imgStream);
    		theImage.setIcon(new ImageIcon(img));
    	}
    	catch(Exception ex)
    	{
    		System.out.println ("No Image Could Be Placed");
    	}
		//theImage.addActionListener(this);
		setLayout(new FlowLayout());
		panel.add(theImage, BorderLayout.NORTH);
    }
    private void addButton()
    {
    	
    	next = new JButton("Next");
    	back = new JButton("Back");
    	next.setPreferredSize(new Dimension(200,50));
    	next.addActionListener(this);
    	next.addKeyListener(this);
 		back.setPreferredSize(new Dimension(200,50));
    	back.addActionListener(this);
    	back.addKeyListener(this);
 
    	panel.add(next, BorderLayout.EAST);
    	panel.add(back, BorderLayout.WEST);
    }
    protected void paintComponent(Graphics g)
    {
    //	Graphics2D g2 = (Graphics2D)g;
    	//g2.drawRect(x,y,10,10);
    	
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	if (e.getSource() == next)
    	{
    		storyChapter(1);
    	}
    	else if (e.getSource() == back)
    	{
    		storyChapter(-1);
    	}
    	
    }
    
    public void keyPressed(KeyEvent e)
    {
    	if (e.getKeyCode() == KeyEvent.VK_LEFT)
    	{
    		storyChapter(-1);
    		System.out.println ("Left Was Pressed");
    	}
    	else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
    	{
    		storyChapter(1);
    		System.out.println ("Right Was Pressed");
    	}
    }

    public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e){}    
    public void storyChapter(int x)
    {
    	counter+=x;
    	dialogue.setCounter(counter);
    	dialogue.updateText();
    	//updateDialogueFrame();
    	
    	System.out.println ("Dialogue Counter: " + dialogue.getCounter());
    		System.out.println ("Story Counter: " + counter );
    	//currenImage = 
    	try
    	{
    		String imagePath = imageSet.get(counter);
    		InputStream imgStream = getClass().getResourceAsStream(imagePath);
    		Image img= ImageIO.read(imgStream);
    		theImage.setIcon(new ImageIcon(img));
    	}
    	catch(Exception ex)
    	{
    		System.out.println ("No Image Could Be Placed");
    	}
    }
    public void addDialogue()
    {
    	dialogue = new DialogueBackground();
    	diaFrame = new DialogueFrame(dialogue);
    }

    
    
}