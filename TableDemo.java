import javax.swing.*; 
import java.awt.*; 

/*<applet code="TableDemo" width=200 height=200> </applet>*/ 

public class TableDemo extends JApplet 
{ 
    public void init() 
	{ 
	   Container cp=getContentPane(); 
	   cp.setLayout(new BorderLayout()); 
	   String data[][] = {{"Neeta","CO","A"},
	                      {"Mahesh","CE","B"},
						  {"Akanksha","IF","C"},
						  {"Neha","ME","A"}}; 
	   String col[] = {"Name","Branch","Grade"}; 
	   int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED; 
	   int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS; 
	   JScrollPane jsp=new JScrollPane(table,v,h); 
	   cp.add(jsp,BorderLayout.CENTER); 
	} 
	
}   