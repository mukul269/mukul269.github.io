//-------P1.java---------------------------------------------------------------------------------------------------
//By extending Frame class (inheritance)
import java.awt.*;  
class P1 extends Frame
{  
	P1()
	{  
		//Button class
		Button b=new Button("Sumeet");  

		//Setting button position  
/*setBounds(int x, int y, int width, int height) - Specifies the size of the frame and the location
 of the upper left corner x axis to the right and y axis to the bottom*/
		b.setBounds(30,100,80,30);		
			
		//Adding button into frame  
		add(b);
		
		//Frame size - 300 width and 300 height  
		setSize(300,300);

		//No layout manager  
		setLayout(null);

		//Now frame will be visible, by default not visible  
		setVisible(true);
	}  
	public static void main(String args[])
	{  
		P1 p=new P1();  
	}
}  

//-------P2.java---------------------------------------------------------------------------------------------------

//By creating the object of Frame class (association)
import java.awt.*;  
class P2
{  
	P2()
	{  
		//Frame class
		Frame f=new Frame();  
		Button b=new Button("Click Me");  
		b.setBounds(30,50,80,30);  
		f.add(b);  
		f.setSize(300,300);  
		f.setLayout(null);  
		f.setVisible(true);  
	}  
	public static void main(String args[])
	{  
		P2 p=new P2();  
	}
}  


-------P3.java---------------------------------------------------------------------------------------------------


//Labels and Buttons
import java.awt.*;  
class P3
{  
	public static void main(String args[])
	{  
    		Frame f= new Frame("Labels and Buttons");  

		//Labels
		Label l1,l2;  
    		l1=new Label("Label 1");  
   		l1.setBounds(50,100, 100,30); 
 
    		l2=new Label("Label 2");  
    		l2.setBounds(50,150, 100,30);  

    		f.add(l1); 
		f.add(l2);     		

		//Buttons
		Button b1, b2;
		b1=new Button("Label 1");  
		b1.setBounds(160,100, 100,30); 
	
		b2=new Button("Label 2");  
		b2.setBounds(160,150, 100,30); 
		 
		f.add(b1);  
		f.add(b2); 

		f.setSize(400,400);  
    		f.setLayout(null);  
    		f.setVisible(true);  
	}  
}  

-------P4.java---------------------------------------------------------------------------------------------------

//TextField
import java.awt.*;  
class P4
{  
	public static void main(String args[])
	{  
    		Frame f= new Frame("TextField");  

		//Labels
		Label l1,l2;  
    		l1=new Label("First Name");  
   		l1.setBounds(50,100, 100,30); 
 
    		l2=new Label("Last Name");  
    		l2.setBounds(50,150, 100,30);  

    		f.add(l1); 
		f.add(l2);     

		//TextField
		TextField t1,t2;  
    		t1=new TextField();  //Textbox
    		t1.setBounds(160,100, 100,30);  

    		t2=new TextField();  
    		t2.setBounds(160,150, 100,30);  

    		f.add(t1); 
		f.add(t2);  		

		//Buttons
		Button b1, b2;
		b1=new Button("Save");  
		b1.setBounds(290,100, 100,30); 
	
		b2=new Button("Save");  
		b2.setBounds(290,150, 100,30); 
		 
		f.add(b1);  
		f.add(b2); 

		f.setSize(600,400);  
    		f.setLayout(null);  
    		f.setVisible(true);  
	}  
}  



-------P5.java---------------------------------------------------------------------------------------------------


//TextArea
import java.awt.*;  
class P5 
{  
     	public static void main(String args[])  
	{  
        		Frame f= new Frame();  
            	TextArea t=new TextArea();  
        		t.setBounds(10,30, 300,200);  
        		f.add(t);  
        		f.setSize(400,400);  
        		f.setLayout(null);  
        		f.setVisible(true);
	}  
}  