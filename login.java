import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class login extends Frame 
//implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b1;
	
	login()
	{
		Label l1 = new Label("ID");
		l1.setBounds(50,50,100,25);
		f.add(l1);
		
		TextField t1 = new TextField("");
		t1.setBounds(95,50,100,25);
		f.add(t1);
		
		Label l2 = new Label("PASSWORD");
		l1.setBounds(50,95,100,25);
		f.add(l2);
		
		TextField t2 = new TextField("");
		t2.setBounds(95,95,100,25);
		f.add(t2);
		
		Button b1 = new Button("Submit");
		b1.setBounds(50,140,100,25);
		f.add(b1);
		
		f.setTitle("LOGIN FORM");
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}
	public static void main(String[] arg)
	{
		Frame f = new Frame();
	}
}
		
		
		
		