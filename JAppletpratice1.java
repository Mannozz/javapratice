
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JApplet;
@SuppressWarnings("unchecked")

public class JAppletpratice1 extends JApplet implements ActionListener {
       	
       	Container c = getContentPane();
		
    	String str[]={ "item1","item2","item3"};
		JComboBox cb=new JComboBox(str);
		JLabel label1=new JLabel("С����");
		JTextArea msg=new JTextArea();
		JButton button1=new JButton("��ť1");
		JButton button2=new JButton("��ť2");
		JButton button3=new JButton("��ť3");
		JPanel p1 = new JPanel();	

    public void init() 
    {	
    			c.setLayout(null);
				
			  	c.add(label1);
			  	c.add(button1);
			  	c.add(button2);
			  	c.add(button3);
			  	label1.setBounds(0,0,100,20);//�ĸ������ֱ�Ϊ(x����,y����,��ť���,��ť�߶�)
			  	button1.setBounds(350,130,100,20);
			  	button2.setBounds(350,230,100,20);
			  	button3.setBounds(350,330,100,20);
			 	c.add(cb);
			 	c.add(msg);
			  	cb.setBounds(150,30,100,20);
			  	msg.setBounds(100,0,300,300);
    		
			
		
   	}
	
    
	public void actionPerformed(ActionEvent e){}
    public void paint(Graphics g) {}

}