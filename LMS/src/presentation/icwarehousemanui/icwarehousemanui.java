package presentation.icwarehousemanui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import presentation.mainui.mainui;

public class icwarehousemanui extends JFrame{
	private JLabel warnJLabel;
	private String[] args;
	private JButton outjButton;
	private icwarehousemanJpanel icwarehousemanJpanel;
	private icwarehousemanOperationJpanel operationJpanel;
	private JButton b1,b2,b3,b4,b5,b6;
	public icwarehousemanui(String s,String [] args) {
		// TODO Auto-generated constructor stub
		super(s);
		this.args=args;
		init();
		registListener(this);
	}
	private void init(){
		ImageIcon b1Icon=new ImageIcon("picture/����.png");
		ImageIcon b2Icon=new ImageIcon("picture/���.png");
		ImageIcon b3Icon=new ImageIcon("picture/����ѯ.png");
		ImageIcon b4Icon=new ImageIcon("picture/����̵�.png");
		ImageIcon b5Icon=new ImageIcon("picture/����������.png");
		ImageIcon b6Icon=new ImageIcon("picture/����ʼ��.png");
		icwarehousemanJpanel=new icwarehousemanJpanel();
		operationJpanel=new icwarehousemanOperationJpanel(icwarehousemanJpanel);
		warnJLabel=new JLabel();
		warnJLabel.setOpaque(true);
		//��汨����������ӷ����ı�
		warnJLabel.setBackground(Color.GREEN);
		b1=new JButton(b1Icon);
		b2=new JButton(b2Icon);
		b3=new JButton(b3Icon);
		b4=new JButton(b4Icon);
		b5=new JButton(b5Icon);
		b6=new JButton(b6Icon);
		b1.setContentAreaFilled(false);
		b2.setContentAreaFilled(false);
		b3.setContentAreaFilled(false);
		b4.setContentAreaFilled(false);
		b5.setContentAreaFilled(false);
		b6.setContentAreaFilled(false);

		b1.setBounds(30,90,200, 50);
		b2.setBounds(30,180,200, 50);
		b3.setBounds(30, 270,200, 50);
		b4.setBounds(30, 360,200, 50);
		b5.setBounds(30,450 , 200, 50);
		b6.setBounds(30, 540, 200, 50);

		warnJLabel.setBounds(30,30, 30, 30);
		ImageIcon outIcon=new ImageIcon("picture/�˳���¼.png");
		outjButton=new JButton(outIcon);
		outjButton.setBounds(30, 620,  48,48);
		outjButton.setContentAreaFilled(false);
		 icwarehousemanJpanel.add(warnJLabel);
		 icwarehousemanJpanel.add(outjButton);
		icwarehousemanJpanel.add(b1);
		icwarehousemanJpanel.add(b2);
		icwarehousemanJpanel.add(b3);
		icwarehousemanJpanel.add(b4);
		icwarehousemanJpanel.add(b5);
		icwarehousemanJpanel.add(b6);

		icwarehousemanJpanel.setLayout(null);

		this.add(icwarehousemanJpanel);
		this.setSize( 1024, 730);
		//����
		Toolkit kitToolkit =Toolkit.getDefaultToolkit();
		Dimension screenSize=kitToolkit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int windowWidth=this.getWidth();
		int windowHeight=this.getHeight();
		this.setLocation((screenWidth-windowWidth)/2, (screenHeight-windowHeight)/2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�������ڸı��С
		this.setResizable(false);
		this.setVisible(true);
	}
	private void registListener(final icwarehousemanui icwarehousemanui){
		outjButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new mainui().main(args);
				icwarehousemanui.dispose();
			}
		});
	b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new b1icwarehousemanui("��ת���Ĳֿ����Ա��������", icwarehousemanui);
				icwarehousemanui.setVisible(false);
			}
		});
	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new b2icwarehousemanui("��ת���Ĳֿ����Ա�������", icwarehousemanui);
			icwarehousemanui.setVisible(false);
		}
	});
	}
}
class icwarehousemanJpanel extends JPanel{
	private ImageIcon backgroundIcon=new ImageIcon("picture/����.png");
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(backgroundIcon.getImage(),0,0,null);
     }
   }
class icwarehousemanOperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	public icwarehousemanOperationJpanel(icwarehousemanJpanel icwarehousemanJpanel) {
		// TODO Auto-generated constructor stub
		init();
		icwarehousemanJpanel.add(this);
	}
	private void init(){
		this.setOpaque(false);
		this.setBounds(260, 30, 730,650);

	}
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}