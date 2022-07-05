 import javax.swing.*; 
 import java.awt.*; 
 public class JRadioButtonDemo extends JApplet 
 { 
     JRadioButton r1,r2,r3; 
     Container c; 
     public void init() 
     { 
         c=getContentPane(); 
         c.setLayout(new FlowLayout()); 
         r1=new JRadioButton("Red"); 
         r2=new JRadioButton("Green"); 
         r3=new JRadioButton("Blue"); 
         JRadioButtonGroup b=new JRadioButtonGroup (); 
         b.add(r1);b.add(r2);b.add(r3); c.add(r1);c.add(r2);c.add(r3); 
     } 
     
} /*<applet code=JRadioButtonDemo.class width=500 height=500></applet>*/  