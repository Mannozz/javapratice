import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFramepratice2 extends JFrame implements ActionListener{
	
	JMenuBar mb = new JMenuBar();
	JMenu m1 = new JMenu("Menu");
	JMenuItem ex = new JMenuItem("�˳�");
	JButton exit=new JButton("�˳�");

	
	JFramepratice2()
	{
		setTitle("�˵�Ӧ��");
    	Container c=getContentPane();//�����������c

  		setSize(400,400);
  		setLayout(null);
  		c.add(mb);
  		mb.add(m1);
 		m1.add(ex);
  		c.add(exit);
  		exit.setBounds(0, 230 , 300 , 20);


  		setVisible(true);

  		setJMenuBar(mb);
		ex.addActionListener(this);
		exit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{	
		
		if(e.getSource()==exit||e.getSource()==ex)
		{
			dispose();//�ر�
		}
	}
	
	
	
	
	public static void main(String args[])
	{
		new JFramepratice2();
		
	}
}