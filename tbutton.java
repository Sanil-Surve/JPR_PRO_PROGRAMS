import java.awt.*; 
import java.applet.*; 
import java.awt.event.*; 

/*<applet code=tbutton.java width=300 height=300></applet>*/ 

public class tbutton extends Applet implements ActionListener 
{ 
     Button b;
	 public void init() 
	 { 
	    b=new Button("Start"); 
		add(b); 
	 } 
	 
	 public void actionPerformed(ActionEvent ae) 
	 { 
	    String s=b.getLabel(); 
		
		if(s.equals("Start")) 
			b.setLabel("Stop"); 
		else 
			b.setLabel("Start");
	 }
}  