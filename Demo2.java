 import java.awt.*; 
 import javax.swing.*; 
 
 public class Demo2 extends JFrame 
 { 
    Demo2() 
	{ 
	     JButton b1=new JButton("Hello"); 
		 JButton b2=new JButton("Welcome"); 
		 add(b1); add(b2); 
		 setSize(300,300); 
		 setVisible(true); 
	} 
	
	public static void main(String argv[]) 
	{ 
	      Demo2 d=new Demo2(); 
    } 
	
}  