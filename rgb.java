import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
/*<applet code=rgb width=400 height=400></applet>*/ 

public class rgb extends Applet implements ActionListener 
{  
    Button r=new Button("Red"); 
	Button g=new Button("Green"); 
	Button b=new Button("Blue"); 
	
	public void init() 
	{ 
	   add(r);
	   add(g);
	   add(b); 
	   r.addActionListener(this); 
	   g.addActionListener(this); 
	   b.addActionListener(this); 
	} 
	
	public void actionPerformed(ActionEvent e) 
	{ 
	   if(e.getSource()==r) 
	       setBackground(Color.red); 
       if(e.getSource()==g) 
		   setBackground(Color.green); 
	   if(e.getSource()==b) 
		   setBackground(Color.blue); 
	} 
	
} 