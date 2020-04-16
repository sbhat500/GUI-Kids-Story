import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.Object.*;
import java.util.*;

public class ImageCreate extends JComponent {
	
	private TreeMap <String, Image> imageSet;
	
    public ImageCreate() 
    {
    	imageSet = new TreeMap<String, Image>();
    }
    
    public void addImage(String s, Image i)
    {
    	imageSet.put(s,i);
    }
    public Image getImage(String s) throws NullPointerException
    {
    	if (imageSet.get(s) == null)
    	{
    		throw new NullPointerException("Can not find said image in repository");
    	}
    	return imageSet.get(s);
    }
    
    
}