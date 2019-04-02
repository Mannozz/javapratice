
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JApplet;
@SuppressWarnings("unchecked")

public class JAppletpratice2 extends JApplet implements ActionListener {
       	
       	
		
    	String str[];
		JLabel label1=new JLabel("这个是文本框");
		JLabel label2=new JLabel("这个是文本区");
		JTextArea msg=new JTextArea();
		JTextField tx=new JTextField(100);
		JButton button1=new JButton("OK");
		JPanel p1 = new JPanel();
		

    public void init() 
    {	
  		
    	p1.setLayout(null);
		

			  	p1.add(label1);
			  	p1.add(tx);
			  	p1.setBackground(Color.gray);
			  	label1.setBounds(0,250,100,20);
			  	tx.setBounds(120,250,100,20);
			  	p1.add(label2);
			  	p1.add(msg);
			  	label2.setBounds(0,150,100,20);
			  	msg.setBounds(120,150,200,100);
			  	

			  	p1.add(button1);//四个参数分别为(x坐标,y坐标,按钮宽度,按钮高度)
			  	button1.setBounds(0,300,500,20);
		
			
				
				button1.addActionListener(this);
    			tx.addActionListener(this);
				
				setVisible(true);
				add(p1);
				
		
   	}
	
    
	public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==button1)
    		msg.append(tx.getText()+"\n");
    		else 
    		{  
    			 msg.append(tx.getText()+"\n");
    		}
		}
    public void paint(Graphics g) {}

}