/**
 *Name: Suraj Bhat
 *Class: CSIII
 *Teacher: Gallatin
 *Period: 1
 */
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class DialogueFrame extends JFrame {

   public DialogueFrame(DialogueBackground dialogue)
   {
   	setTitle("Dialogue");
   	setSize(300,300);
   	add(dialogue);
   	setVisible(true);
   	setAlwaysOnTop(true);
   	setLocation(1000,100);
   }
    
    
}