import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JApplet;
@SuppressWarnings("unchecked")

public class JAppletpratice3 extends JApplet implements ActionListener {
       	
       	
		
    	String str;
		double sum;
		
		JTextArea result=new JTextArea(20,20);
		JTextField in=new JTextField(20);
		JButton button1=new JButton("ÇóÆ½·½");
		JPanel p1 = new JPanel();
		

    public void init() 
    {	
  		
    	p1.setLayout(new FlowLayout());
		

			  	p1.add(in);
			  	p1.add(button1);
			  	p1.add(result);

				button1.addActionListener(this);
				
				setVisible(true);
				add(p1);
				
		
   	}
	
    
	public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==button1)
			str=in.getText();
			//String->double
			sum = Double.valueOf(str).doubleValue();//String->double
    		result.append(sum*sum+"\n");
		}
    public void paint(Graphics g) {}


}