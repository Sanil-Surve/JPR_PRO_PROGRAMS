import javax.swing.*;
//import java.awt.event.*;

public class table
{
	public static void main(String[] args) 
	{
		JFrame f = new JFrame();
		String data[][] = { { "101","Amit", "670000"}, 
			                { "102","Jai", "7800000"},
		                    { "103", "Sanil", "100000"}};
		String column[] = { "ID", "NAME", "SALARY"};
		JTable jt = new JTable(data,column);
		jt.setBounds(30,40,200,300);
		JScrollPane sp = new JScrollPane(jt);
		f.add(sp);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
							