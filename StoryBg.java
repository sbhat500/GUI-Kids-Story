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


class StoryBg extends JComponent implements ActionListener {
		
		private int x,y,z;
    	private JButton choice;
    	private ImageCreate images;
    	private String currentImage;
    	
    public StoryBg() 
    {
    	images = new ImageCreate();
    }
    
    public void addButton()
    {
    	choice = new JButton("Want to get started!");
		choice.addActionListener(this);
		setLayout(new FlowLayout());
		add(choice, BorderLayout.NORTH);
    }
    protected void paintComponent(Graphics g)
    {
    	Graphics2D g2 = (Graphics2D)g;
    	
    }
    
    public void actionPerformed(ActionEvent e){}
    
    
}