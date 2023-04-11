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


-------P6.java---------------------------------------------------------------------------------------------------


//Checkbox and Radio button (CheckboxGroup)
import java.awt.*;  
class P6
{  
     	public static void main(String args[])  
	{  
       	Frame f= new Frame("Checkbox and Radio button (CheckboxGroup)");  

        	Checkbox chk1, chk2, chk3;
		chk1 = new Checkbox("Core Java");  
        	chk1.setBounds(100,100, 100,50); 
 
        	chk2 = new Checkbox("DBMS");  
        	chk2.setBounds(100,140, 50,50);  

		chk3 = new Checkbox("TOC");  
        	chk3.setBounds(100,180, 50,50);  

        	f.add(chk1);  
        	f.add(chk2);  
		f.add(chk3);  

		//CheckboxGroup class converts checkbox into radio button
		CheckboxGroup cbg = new CheckboxGroup();  
        	Checkbox rbtn1, rbtn2, rbtn3;
	
		rbtn1 = new Checkbox("Core Java", cbg, true);    
        	rbtn1.setBounds(200,100, 100,50);    

        	rbtn2 = new Checkbox("DBMS", cbg, false);    
        	rbtn2.setBounds(200,140, 50,50);  
  
		rbtn3 = new Checkbox("TOC", cbg, false);    
        	rbtn3.setBounds(200,180, 50,50);  

        	f.add(rbtn1);    
        	f.add(rbtn2);   
		f.add(rbtn3);   

        	f.setSize(600,400);  
        	f.setLayout(null);  
        	f.setVisible(true);  
     	}  
}  




-------P7.java---------------------------------------------------------------------------------------------------




//Choice and List
import java.awt.*;  
class P7
{  
	public static void main(String args[])  
	{           
        	Frame f= new Frame();  

		Label l1=new Label("Select Item");  
   		l1.setBounds(40,100, 100,30);
		f.add(l1);

        	Choice c=new Choice();  
        	c.setBounds(150,100, 100,75);  
        	c.add("Vada Pav");  
        	c.add("Pani Puri");  
        	c.add("Sev Puri");  
        	c.add("Dabeli");  
        	c.add("Samosa");  
        
		f.add(c);  

		Label l2=new Label("Select Item");  
   		l2.setBounds(40,200, 100,30);
		f.add(l2);

		List lst=new List(5);  
        	lst.setBounds(150,200, 100,75);  
        	lst.add("Vada Pav");  
        	lst.add("Pani Puri");  
        	lst.add("Sev Puri");  
        	lst.add("Dabeli");  
        	lst.add("Samosa");  
        	f.add(lst);  

        	f.setSize(400,400);  
        	f.setLayout(null);  
        	f.setVisible(true);  
	}  
}   




-------P8.java---------------------------------------------------------------------------------------------------



//Menu and MenuItem
import java.awt.*;  
class P8 
{  
 	public static void main(String args[])  
	{  
         	Frame f= new Frame("Menu and MenuItem");  
         	MenuBar mb=new MenuBar(); 
 
     		Menu menu=new Menu("File");         		
		
     		MenuItem i1=new MenuItem("New");  
     		MenuItem i2=new MenuItem("Open");  
     		MenuItem i3=new MenuItem("Save");

		menu.add(i1);  
         	menu.add(i2);  
     		menu.add(i3);  

		//Adding Menu inside MenuBar
		mb.add(menu);  

		Menu submenu=new Menu("Save As");  
         	MenuItem i4=new MenuItem("PDF");  
         	MenuItem i5=new MenuItem("Word");  
         		  
         	submenu.add(i4);  
         	submenu.add(i5);  

		//Adding SubMenu inside Menu
         	menu.add(submenu);  
         		
         	f.setMenuBar(mb);  
         	f.setSize(400,400);  
         	f.setLayout(null);  
         	f.setVisible(true);   
	}  
}   




-------P9.java---------------------------------------------------------------------------------------------------



//Java BorderLayout
/*The BorderLayout is used to arrange the components in five regions: north, south, east, west and center. Each region (area) may contain one component only. It is the default layout of 
frame or window. The BorderLayout provides five constants for each region:

	public static final int NORTH
	public static final int SOUTH
	public static final int EAST
	public static final int WEST
	public static final int CENTER
*/

import java.awt.*;  
 
class P9
{  
  	public static void main(String[] args) 
	{  
   		Frame f=new Frame();  
      
    		Button b1=new Button("NORTH");
    		Button b2=new Button("SOUTH");
    		Button b3=new Button("EAST");
    		Button b4=new Button("WEST");
    		Button b5=new Button("CENTER");
      
    		f.add(b1,BorderLayout.NORTH);  
    		f.add(b2,BorderLayout.SOUTH);  
    		f.add(b3,BorderLayout.EAST);  
    		f.add(b4,BorderLayout.WEST);  
    		f.add(b5,BorderLayout.CENTER); 
      
    		f.setSize(500,500);  
    		f.setVisible(true);      
	}  
}  




-------P10.java---------------------------------------------------------------------------------------------------




//Java GridLayout
/*The GridLayout is used to arrange the components in rectangular grid. One component is displayed in each rectangle.*/

import java.awt.*;  
  
class P10
{  
	public static void main(String[] args) 
	{  
		Frame f=new Frame();  
      
    		Button b1=new Button("1");  
    		Button b2=new Button("2");  
    		Button b3=new Button("3");  
    		Button b4=new Button("4");  
    		Button b5=new Button("5");  
        Button b6=new Button("6");  
       	Button b7=new Button("7");  
    		Button b8=new Button("8");  
        Button b9=new Button("9");  
          
    		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);  
    		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);  
  
		//Setting grid layout of 3 rows and 3 columns  
    		f.setLayout(new GridLayout(3,3));      
  
    		f.setSize(300,300);  
    		f.setVisible(true);   
	}  
}  




-------P11.java---------------------------------------------------------------------------------------------------




//Java GridLayout
/*The GridLayout is used to arrange the components in rectangular grid. One component is displayed in each rectangle.*/

import java.awt.*;  
  
class P10
{  
	public static void main(String[] args) 
	{  
		Frame f=new Frame();  
      
    		Button b1=new Button("1");  
    		Button b2=new Button("2");  
    		Button b3=new Button("3");  
    		Button b4=new Button("4");  
    		Button b5=new Button("5");  
        Button b6=new Button("6");  
       	Button b7=new Button("7");  
    		Button b8=new Button("8");  
        Button b9=new Button("9");  
          
    		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);  
    		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);  
  
		//Setting grid layout of 3 rows and 3 columns  
    		f.setLayout(new GridLayout(3,3));      
  
    		f.setSize(300,300);  
    		f.setVisible(true);   
	}  
}  




-------P12.java---------------------------------------------------------------------------------------------------




//Java CardLayout
/*The CardLayout class manages the components in such a manner that only one component 
is visible at a time. It treats each component as a card that is why it is 
known as CardLayout.*/

import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  

//class extends JFrame and implements actionlistener 
public class P12 extends JFrame implements ActionListener
{  
	//Declaration of objects of CardLayout class. 
	CardLayout card;  

	//Declaration of objects of JButton class. 
	JButton b1,b2,b3;  

	// Declaration of objects of Container class to get the content 
	Container c;  
    	P12()
	{            
		//Gets the content
        		c=getContentPane();  

		//CardLayout class object with 40 horizontal space and 30 vertical space . 
        		card=new CardLayout(40,30);  		
        		c.setLayout(card);  
          
       		b1=new JButton("Core Java");  
        		b2=new JButton("is very");  
        		b3=new JButton("Easy ....");  
        		
		b1.addActionListener(this);  
        		b2.addActionListener(this);  
        		b3.addActionListener(this);  
              
        		c.add(b1);
		c.add(b2);
		c.add(b3);                            
    	}  
    	public void actionPerformed(ActionEvent e) 
		{  
		//Call the next card 
    		card.next(c);  
   	}  
  
    	public static void main(String[] args) 
	{  
        		P12 cl=new P12();  
        		cl.setSize(400,400);  
        		cl.setVisible(true);  

		 //Function to set default operation of JFrame. 
        		cl.setDefaultCloseOperation(EXIT_ON_CLOSE);  
    	}  
} 




-------P13.java---------------------------------------------------------------------------------------------------



//WAP Handling button click events by implementing ActionListener interface

/*
1) ActionListener - It is notified whenever you click on the button or menu item. It is notified against ActionEvent. The ActionListener interface is found in java.awt.event package. It has only one method: actionPerformed().

2) actionPerformed() method - This method is invoked automatically whenever you click on the registered component.*/

import java.awt.*;
import java.awt.event.*;

//Implement the ActionListener interface in the class
public class P13 extends Frame implements ActionListener
{
	Frame f;
	Button btn1, btn2, btn3;
	Label lbl;

	P13()
	{
		f= new Frame("Button and Click Events");
		btn1= new Button("Save");
		btn2= new Button("Cancel");	
		btn3= new Button("Exit");	
		lbl = new Label();

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(lbl);

		//Register the component with the Listener
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
//Creates a new flow layout manager with the indicated alignment and horizontal and vertical gaps with //the default size of 5 pixels
		f.setLayout(new FlowLayout(FlowLayout.CENTER,100,50));		
		f.setSize(550,250);
		f.setVisible(true);				
	}//P13()

	//Override the actionPerformed() method
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Save"))
		{
			lbl.setText("Clicked on - SAVE");
			f.add(lbl);
			f.setVisible(true);
		}

		if(ae.getActionCommand().equals("Cancel"))
		{
			lbl.setText("Clicked on - CANCEL");
			f.add(lbl);
			f.setVisible(true);			
		}	

		//Code to exit the frame
		if(ae.getActionCommand().equals("Exit"))
		{
			System.exit(0);		
		}		
	}//actionPerformed()

	public static void main(String args[])
	{
		new P13();
	}//main()
}//class P13






-------P14.java---------------------------------------------------------------------------------------------------




//WAP for Java AWT CheckboxGroup with ItemListener
import java.awt.*;    
import java.awt.event.*;  
public class P14 
{    	
    	 P14()
	{    
       		Frame f= new Frame("Checkbox and Radio button (CheckboxGroup)");  
 
		//Abstract method actionPerformed   
       		final Label lbl = new Label();   
    
       		lbl.setAlignment(Label.CENTER);  
       		lbl.setSize(500,500);  

		//CheckboxGroup class converts checkbox into radio button
        		CheckboxGroup cbg = new CheckboxGroup();  
		Checkbox rbtn1, rbtn2, rbtn3;

        		rbtn1 = new Checkbox("Core Java", cbg, true);    
        		rbtn1.setBounds(200,100, 100,50);    

        		rbtn2 = new Checkbox("DBMS", cbg, false);    
        		rbtn2.setBounds(200,140, 50,50);  
  
		rbtn3 = new Checkbox("TOC", cbg, false);    
        		rbtn3.setBounds(200,180, 50,50);  
		
        		f.add(rbtn1);    
        		f.add(rbtn2);   
		f.add(rbtn3);   
		
		f.add(lbl);    
        		f.setSize(550,400);    
        		f.setLayout(null);    
        		f.setVisible(true);    
		
        		rbtn1.addItemListener(new ItemListener() 
		{  
            			public void itemStateChanged(ItemEvent e) 
			{               
               				lbl.setText("Clicked : Core Java");  
            			}  
         		});  

        		rbtn2.addItemListener(new ItemListener()
		{  
            			public void itemStateChanged(ItemEvent e) 
			{               
               				lbl.setText("Clicked : DBMS");  
            			}  
         		});  

		rbtn3.addItemListener(new ItemListener()
		{  
            			public void itemStateChanged(ItemEvent e) 
			{               
               				lbl.setText("Clicked : TOC");  
            			}  
         		});  		
     	}//P14()  
		
	public static void main(String args[])    
	{    
    		new P14();    
	}//main()  
}//class P14






-------P15.java---------------------------------------------------------------------------------------------------





//WAP for Java AWT Checkbox with ItemListener
import java.awt.*;  
import java.awt.event.*;  
public class P15
{  
     	P15()
	{  
        		Frame f= new Frame("CheckBox Example");  
        		final Label label = new Label();          
        		label.setAlignment(Label.CENTER);  
        		label.setSize(400,100);  
        		Checkbox checkbox1 = new Checkbox("C++");  
        		checkbox1.setBounds(100,100, 50,50);  
        		Checkbox checkbox2 = new Checkbox("Java");  
        		checkbox2.setBounds(100,150, 50,50);  
        		f.add(checkbox1); f.add(checkbox2); f.add(label);  
        		checkbox1.addItemListener(new ItemListener() 
		{  
             			public void itemStateChanged(ItemEvent e) 
			{               
                				label.setText("C++ Checkbox: "   
                				+ (e.getStateChange()==1?"checked":"unchecked"));  
             			}  
          		});  

        		checkbox2.addItemListener(new ItemListener() 
		{  
             			public void itemStateChanged(ItemEvent e) 
			{               
                				label.setText("Java Checkbox: "   
                				+ (e.getStateChange()==1?"checked":"unchecked"));  
             			}  
         		});  
        		f.setSize(400,400);  
        		f.setLayout(null);  
        		f.setVisible(true);  
     	}  
	public static void main(String args[])  
	{  
    		new P15();  
	}  
}  
