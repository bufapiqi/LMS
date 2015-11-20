package presentation.courierui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import presentation.mainui.mainui;


public class courierui extends JFrame{
		private String[] args;
		private JButton outjButton;
		JButton orderfoundButton;
  		JButton orderfinishButton;
  		JButton documentreplyButton;
  		private courierJpanel courierJpanel;
  		courierOperationJpanel operationJpanel;
  		public courierui(String s,String[] args) {
	// TODO Auto-generated constructor stub
  		super(s);
  		this.args=args;
		init();
		registListener(this,courierJpanel);
}
 private void init(){
	 	ImageIcon orderfoundIcon=new ImageIcon("picture/�ļ�������.png");
	 	ImageIcon orderfinishIcon=new ImageIcon("picture/�ռ�������.png");
	 	ImageIcon documentreplyIcon=new ImageIcon("picture/���ݷ���.png");
	 	orderfinishButton=new JButton(orderfinishIcon);
	 	orderfoundButton=new JButton(orderfoundIcon);
	 	orderfinishButton.setContentAreaFilled(false);
	 	orderfoundButton.setContentAreaFilled(false);
	 	documentreplyButton=new JButton(documentreplyIcon);
		documentreplyButton.setContentAreaFilled(false);
	 	courierJpanel=new courierJpanel();
	 	operationJpanel=new courierOperationJpanel(courierJpanel);

	 	orderfoundButton.setBounds(30, 100, 200, 50);
	 	orderfinishButton.setBounds(30, 300, 200, 50);
	 	documentreplyButton.setBounds(30, 500, 200, 50);
	 	ImageIcon outIcon=new ImageIcon("picture/�˳���¼.png");
		outjButton=new JButton(outIcon);
		outjButton.setBounds(30, 620,  48,48);
		outjButton.setContentAreaFilled(false);
		courierJpanel.add(documentreplyButton);
		 courierJpanel.add(outjButton);
	 	courierJpanel.add(orderfinishButton);
	 	courierJpanel.add(orderfoundButton);
	
	 	courierJpanel.setLayout(null);

	 	this.add(courierJpanel);
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
	private void registListener(final courierui courierui,final courierJpanel courierJpanel){
		outjButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	
				new mainui().main(args);
				courierui.dispose();
			}
		});
		documentreplyButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new documentreplyui("���Ա�������ݷ���",courierui);
				courierui.setVisible(false);
			}
		});
		orderfoundButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				courierJpanel.remove(courierui.operationJpanel);
				courierui.orderfinishButton.setEnabled(false);
				courierui.orderfoundButton.setEnabled(false);
				courierui.documentreplyButton.setEnabled(false);
				new b1Jpanel1(courierui,courierJpanel);
				courierJpanel.repaint();
			}
		});
		orderfinishButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				courierJpanel.remove(courierui.operationJpanel);
				courierui.orderfinishButton.setEnabled(false);
				courierui.orderfoundButton.setEnabled(false);
				courierui.documentreplyButton.setEnabled(false);
				new b2Jpanel1(courierui,courierJpanel);
				courierJpanel.repaint();
			}
		});
	}
}
class courierJpanel extends JPanel{
		private ImageIcon backgroundIcon=new ImageIcon("picture/����.png");
		public void paintComponent(Graphics g)  
		{  
			super.paintComponent(g);    
			g.drawImage(backgroundIcon.getImage(),0,0,null);
		}
   }
class courierOperationJpanel extends JPanel{
		private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
		public courierOperationJpanel(courierJpanel courierJpanel) {
			// TODO Auto-generated constructor stub
			init();
		 	courierJpanel.add(this);
		}
		private void init(){
		 	this.setBounds(260, 30, 730,650);
		 	this.setOpaque(false);
		}
		public void paintComponent(Graphics g)  
	{  
			super.paintComponent(g);    
			g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}
