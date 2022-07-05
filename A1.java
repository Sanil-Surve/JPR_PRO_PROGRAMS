import java.awt.*;
import java.awt.event.*;
import java.applet;

public class A1 extends Applet 
{ 
   Button b1; 
   Label l1; 
   public void init() 
   { 
      setLayout(new FlowLayout()); 
	  b1=new Button("Click"); 
	  l1=new Label(); 
	  add(b1);
	  add(l1); 
      	  
   } 
   
   public void actionPerformed(ActionEvent ae)
   {
	   if(ae.getSource()==b1) 
		   l1.setText("Hello");
   } 
}  

