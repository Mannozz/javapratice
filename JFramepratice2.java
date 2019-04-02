import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFramepratice2 extends JFrame implements ActionListener{
	
	JMenuBar mb = new JMenuBar();
	JMenu m1 = new JMenu("Menu");
	JMenuItem ex = new JMenuItem("退出");
	JButton exit=new JButton("退出");

	
	JFramepratice2()
	{
		setTitle("菜单应用");
    	Container c=getContentPane();//建立窗口组件c

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
			dispose();//关闭
		}
	}
	
	
	
	
	public static void main(String args[])
	{
		new JFramepratice2();
		
	}
}