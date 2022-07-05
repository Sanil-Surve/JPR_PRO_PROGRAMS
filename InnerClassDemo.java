 import java.awt.*; 
 import java.awt.event.*; 
 import java.applet.*; 
 
 /*<applet code="InnerClassDemo" width=250 height=200> </applet>*/ 
 
 public class InnerClassDemo extends Applet 
 { 
    public void init() 
	{ 
	    addMouseListener(new MyMouseAdapter()); 
		
	} 
	
	class MyMouseAdapter extends MouseAdapter 
	{ 
	    public void mouseClicked(MouseEvent me) 
		{ 
		    showStatus("Mouse clicked "); 
		} 
	} 
}  