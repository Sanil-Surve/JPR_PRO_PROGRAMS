import java.awt.*;
import java.awt.event.*;

public class mousee implements MouseListener
{
	Label l;
	public static void main(String[] args) 
	{
		new mousee();
	}
	
	public mousee()
	{
		Frame f = new Frame("Student Info");
		f.setLayout(null);
		
		l = new Label();
		l.setBounds(95,155,100,25);
		f.add(l);
		
		f.addMouseListener(this);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public void mouseClicked(MouseEvent e)
	{
		l.setText("mouse is clicked");
	}
	
	public void mouseEntered(MouseEvent e)
	{
		l.setText("mouse is entered");
	}
	
	public void mouseExited(MouseEvent e)
	{
		l.setText("mouse is exited");
	} 
	
	public void mousePressed(MouseEvent e)
	{
		l.setText("mouse is Pressed");
	}
	
	public void mouseReleased(MouseEvent e)
	{
		l.setText("mouse is released");
	}
	
}
	
   