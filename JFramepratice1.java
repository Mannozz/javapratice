import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFramepratice1 extends JFrame implements ActionListener{
	
	int a,b,c;
	String res;
	JLabel label1=new JLabel("请输入a");
	JLabel label2=new JLabel("请输入b");
	JLabel label3=new JLabel("请输入c");
	JLabel label4=new JLabel("乘积为:");
	JTextField seta=new JTextField(50);
	JTextField setb=new JTextField(50);
	JTextField setc=new JTextField(50);
	JButton ok=new JButton("确定");
	JButton exit=new JButton("退出");
	JTextField result=new JTextField();

	
	JFramepratice1()
	{
		setTitle("整数乘积计算");
    	Container c=getContentPane();//建立窗口组件c

  		setSize(400,400);
  		setLayout(null);
  		c.add(label1);
  		c.add(label2);
  		c.add(label3);
  		c.add(label4);
  		label1.setBounds(50,30,100,20);//四个参数分别为(x坐标,y坐标,按钮宽度,按钮高度)
  		label2.setBounds(50,130,100,20);
  		label3.setBounds(50,230,100,20);
  		label4.setBounds(50,330,100,20);
  		c.add(ok);
  		c.add(exit);
  		ok.setBounds(300 , 130 , 80 , 30);
  		exit.setBounds(300 , 230 , 80 , 30);
  		c.add(seta);
  		c.add(setb);
  		c.add(setc);
  		seta.setBounds(150,30,100,20);
  		setb.setBounds(150,130,100,20);
  		setc.setBounds(150,230,100,20);
  		seta.setText("0");
  		setb.setText("0");
  		setc.setText("0");
  		result.setText("0");
  		setVisible(true);
  		c.add(result);
  		result.setBounds(150,330,100,20);
  		ok.addActionListener(this);
		exit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{	if(e.getSource()==ok)
		{
			a = Integer.parseInt(seta.getText());
			b = Integer.parseInt(setb.getText());
			c = Integer.parseInt(setc.getText());
			System.out.println(a);
			res = String.valueOf(a*b*c);
			result.setText(res);
		}
		if(e.getSource()==exit)
		{
			dispose();//关闭
		}
	}
	
	
	
	
	public static void main(String args[])
	{
		new JFramepratice1();
		
	}
}