import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFramepratice1 extends JFrame implements ActionListener{
	
	int a,b,c;
	String res;
	JLabel label1=new JLabel("������a");
	JLabel label2=new JLabel("������b");
	JLabel label3=new JLabel("������c");
	JLabel label4=new JLabel("�˻�Ϊ:");
	JTextField seta=new JTextField(50);
	JTextField setb=new JTextField(50);
	JTextField setc=new JTextField(50);
	JButton ok=new JButton("ȷ��");
	JButton exit=new JButton("�˳�");
	JTextField result=new JTextField();

	
	JFramepratice1()
	{
		setTitle("�����˻�����");
    	Container c=getContentPane();//�����������c

  		setSize(400,400);
  		setLayout(null);
  		c.add(label1);
  		c.add(label2);
  		c.add(label3);
  		c.add(label4);
  		label1.setBounds(50,30,100,20);//�ĸ������ֱ�Ϊ(x����,y����,��ť���,��ť�߶�)
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
			dispose();//�ر�
		}
	}
	
	
	
	
	public static void main(String args[])
	{
		new JFramepratice1();
		
	}
}