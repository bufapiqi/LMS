package presentation.senderui;

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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import presentation.mainui.mainui;

public class senderui extends JFrame{
	private String[] args;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private senderJpanel senderJpanel;
	private senderOperationJpanel operationJpanel;
	private JLabel informationJLabel;
	private JButton returnjButton;
	public senderui(String s,String[] args) {
		// TODO Auto-generated constructor stub
		super(s);
		this.args=args;	
		init();
		registerLister(this);
	}
	private void init(){
		Font font=new Font("��Բ",Font.BOLD,20);
		jLabel1=new JLabel("2015.10.1 08:17 ���Ŀ���ѵ�������Ӫҵ��");
		jLabel1.setForeground(Color.white);
		jLabel1.setFont(font);
		jLabel1.setBounds(326, 60, 500, 30);
		jLabel2=new JLabel("2015.10.1 09:05 ���Ŀ�����뿪����Ӫҵ��");
		jLabel2.setForeground(Color.white);
		jLabel2.setFont(font);
		jLabel2.setBounds(326, 120, 500, 30);
		jLabel3=new JLabel("2015.10.1 09:49 ���Ŀ���ѵ��ﱱ����ת����");
		jLabel3.setForeground(Color.white);
		jLabel3.setFont(font);
		jLabel3.setBounds(326, 180, 500, 30);
		jLabel4=new JLabel("2015.10.1 13:22 ���Ŀ�����뿪������ת����");
		jLabel4.setForeground(Color.white);
		jLabel4.setFont(font);
		jLabel4.setBounds(326, 240, 500, 30);
		jLabel5=new JLabel("2015.10.3 02:13 ���Ŀ���ѵ����Ͼ���ת����");
		jLabel5.setForeground(Color.white);
		jLabel5.setFont(font);
		jLabel5.setBounds(326, 300, 500, 30);
		jLabel6=new JLabel("2015.10.3 08:44 ���Ŀ�����뿪�Ͼ���ת����");
		jLabel6.setForeground(Color.white);
		jLabel6.setFont(font);
		jLabel6.setBounds(326, 360, 500, 30);
		jLabel7=new JLabel("2015.10.3 10:31 ���Ŀ���ѵ����¥Ӫҵ��");
		jLabel7.setForeground(Color.white);
		jLabel7.setFont(font);
		jLabel7.setBounds(326, 420, 500, 30);
		jLabel8=new JLabel("2015.10.3 15:26 ��¥Ӫҵ�������ɼ�");
		jLabel8.setForeground(Color.white);
		jLabel8.setFont(font);
		jLabel8.setBounds(326, 480, 500, 30);
		jLabel9=new JLabel("2015.10.3 17:11 ���Ŀ����ǩ�� ǩ����:������");
		jLabel9.setForeground(Color.white);
		jLabel9.setFont(font);
		jLabel9.setBounds(326, 540, 500, 30);
		senderJpanel=new senderJpanel();
		operationJpanel=new senderOperationJpanel();
		informationJLabel=new JLabel("������Ϣ");
		operationJpanel.setBounds(260, 30, 730,650);
		ImageIcon returnIcon=new ImageIcon("picture/����.png");
		returnjButton=new JButton(returnIcon);
		returnjButton.setBounds(662, 575, 48,48);
		returnjButton.setContentAreaFilled(false);
		operationJpanel.setLayout(null);
		operationJpanel.add(returnjButton);
		informationJLabel.setFont(new Font("��Բ",Font.BOLD, 36));
		informationJLabel.setBounds(30, 100, 200, 50);
		informationJLabel.setForeground(Color.white);
		senderJpanel.add(informationJLabel);
		senderJpanel.add(operationJpanel);
		senderJpanel.setLayout(null);
		operationJpanel.setOpaque(false);
		senderJpanel.add(jLabel1);
		senderJpanel.add(jLabel2);
		senderJpanel.add(jLabel3);
		senderJpanel.add(jLabel4);
		senderJpanel.add(jLabel5);
		senderJpanel.add(jLabel6);
		senderJpanel.add(jLabel7);
		senderJpanel.add(jLabel8);
		senderJpanel.add(jLabel9);
		this.add(senderJpanel);
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
	private void registerLister(final senderui s){
		returnjButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				new mainui().main(args);
				s.dispose();
			}
		});
	}
}
class senderJpanel extends JPanel{
	private ImageIcon backgroundIcon=new ImageIcon("picture/����.png");
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(backgroundIcon.getImage(),0,0,null);
     }
   }
class senderOperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}