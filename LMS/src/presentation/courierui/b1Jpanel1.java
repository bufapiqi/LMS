package presentation.courierui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.peer.LightweightPeer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class b1Jpanel1 extends JPanel{
	private JLabel jijianrenJLabel;
	private JLabel jijianrennameJLabel;
	private JTextField jijianrennameField;
	private JLabel jijianrendianhuaJLabel;
	private JTextField jijianrendianhuaField;
	private JLabel jijianrenshoujiJLabel;
	private JTextField jijianrenshoujiField;
	private JLabel jijianrendanweiJLabel;
	private JTextField jijianrendanweiField;
	private JLabel jijianrenzhuzhiJLabel;
	private JTextField jijianrenzhuzhiField;
	private JLabel shoujianrenJLabel;
	private JLabel shoujianrennameJLabel;
	private JTextField shoujianrennameField;
	private JLabel shoujianrendianhuaJLabel;
	private JTextField shoujianrendianhuaField;
	private JLabel shoujianrenshoujiJLabel;
	private JTextField shoujianrenshoujiField;
	private JLabel shoujianrendanweiJLabel;
	private JTextField shoujianrendanweiField;
	private JLabel shoujianrenzhuzhiJLabel;
	private JTextField shoujianrenzhuzhiField;
	private JLabel tuoyunwupinxinxiJLabel;
	private JLabel jianshuJLabel;
	private JTextField jianshuField;
	private JLabel zhongliangJLabel;
	private JTextField zhongliangField;
	private JLabel kgJLabel;
	private JLabel tijiJLabel;
	private JTextField tijiField;
	private JLabel lifangcmJLabel;
	private JLabel chicunJLabel;
	private JTextField chicun1Field;
	private JLabel cm1JLabel;
	private JTextField chicun2Field;
	private JLabel cm2JLabel;
	private JTextField chicun3Field;
	private JLabel cm3JLabel;
	private JLabel neijianpinmingJLabel;
	private JTextField neijianpinmingField;
	private JLabel dingdanxinxiJLabel;
	private JLabel kuaidizhongleiJLabel;
	private JTextField kuaidizhongleiField;
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	private JButton yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
	public b1Jpanel1(courierui courierui,courierJpanel courierJpanel) {
		// TODO Auto-generated constructor stub
		init();
		courierui.setTitle("���Ա�����ļ������� 1");
	 	courierJpanel.add(this);
		registListener(courierui,courierJpanel,this);
	}
	private void init(){
		Font font=new Font("��Բ",Font.BOLD,20);
		jijianrenJLabel=new JLabel("�ļ���:");
		jijianrenJLabel.setForeground(Color.white);
		jijianrenJLabel.setFont(font);
		jijianrenJLabel.setBounds(10, 30, 80, 27);
		jijianrennameJLabel=new JLabel("����:");
		jijianrennameJLabel.setForeground(Color.white);
		jijianrennameJLabel.setFont(font);
		jijianrennameJLabel.setBounds(135, 30, 56, 27);
		jijianrennameField=new JTextField();
		jijianrennameField.setFont(font);
		jijianrennameField.setBounds(205, 30, 145, 30);
		jijianrendianhuaJLabel=new JLabel("�绰:");
		jijianrendianhuaJLabel.setForeground(Color.white);
		jijianrendianhuaJLabel.setFont(font);
		jijianrendianhuaJLabel.setBounds(135, 75, 56, 27);
		jijianrendianhuaField=new JTextField();
		jijianrendianhuaField.setBounds(440, 30, 250, 30);
		jijianrendianhuaField.setFont(font);
		jijianrenshoujiJLabel=new JLabel("�ֻ�:");
		jijianrenshoujiJLabel.setForeground(Color.white);
		jijianrenshoujiJLabel.setFont(font);
		jijianrenshoujiJLabel.setBounds(360, 30, 56, 27);
		jijianrenshoujiField=new JTextField();
		jijianrenshoujiField.setFont(font);
		jijianrenshoujiField.setBounds(205, 75, 145, 30);
		jijianrendanweiJLabel=new JLabel("��λ:");
		jijianrendanweiJLabel.setForeground(Color.white);
		jijianrendanweiJLabel.setFont(font);
		jijianrendanweiJLabel.setBounds(360, 75, 56, 27);
		jijianrendanweiField=new JTextField();
		jijianrendanweiField .setFont(font);
		jijianrendanweiField.setBounds(440, 75, 250, 30);
		jijianrenzhuzhiJLabel=new JLabel("סַ:");
		jijianrenzhuzhiJLabel.setForeground(Color.white);
		jijianrenzhuzhiJLabel.setFont(font);
		jijianrenzhuzhiJLabel.setBounds(135, 120, 56, 27);
		jijianrenzhuzhiField=new JTextField();
		jijianrenzhuzhiField.setFont(font);
		jijianrenzhuzhiField.setBounds(205, 120, 485, 30);
		shoujianrenJLabel=new JLabel("�ռ���:");
		shoujianrenJLabel.setForeground(Color.white);
		shoujianrenJLabel.setFont(font);
		shoujianrenJLabel.setBounds(10, 185, 80, 27);
		shoujianrennameJLabel=new JLabel("����:");
		shoujianrennameJLabel.setForeground(Color.white);
		shoujianrennameJLabel.setFont(font);
		shoujianrennameJLabel.setBounds(135,185,56,27);
		shoujianrennameField=new JTextField();
		shoujianrennameField.setFont(font);
		shoujianrennameField.setBounds(205, 185, 145, 30);
		shoujianrendianhuaJLabel=new JLabel("�绰:");
		shoujianrendianhuaJLabel.setForeground(Color.white);
		shoujianrendianhuaJLabel.setFont(font);
		shoujianrendianhuaJLabel.setBounds(135, 230, 56, 27);
		shoujianrendianhuaField=new JTextField();
		shoujianrendianhuaField.setFont(font);
		shoujianrendianhuaField.setBounds(440, 185, 250, 30);
		shoujianrenshoujiJLabel=new JLabel("�ֻ�:");
		shoujianrenshoujiJLabel.setForeground(Color.white);
		shoujianrenshoujiJLabel.setFont(font);
		shoujianrenshoujiJLabel.setBounds(360, 185, 56, 27);
		shoujianrenshoujiField=new JTextField();
		shoujianrenshoujiField.setFont(font);
		shoujianrenshoujiField.setBounds(205, 230, 145, 30);
		shoujianrendanweiJLabel=new JLabel("��λ:");
		shoujianrendanweiJLabel.setForeground(Color.white);
		shoujianrendanweiJLabel.setFont(font);
		shoujianrendanweiJLabel.setBounds(360, 230, 56, 27);
		shoujianrendanweiField=new JTextField();
		shoujianrendanweiField.setFont(font);
		shoujianrendanweiField.setBounds(440, 230,250 , 30);
		shoujianrenzhuzhiJLabel=new JLabel("סַ:");
		shoujianrenzhuzhiJLabel.setForeground(Color.white);
		shoujianrenzhuzhiJLabel.setFont(font);
		shoujianrenzhuzhiJLabel.setBounds(135, 275, 56, 27);
		shoujianrenzhuzhiField=new JTextField();
		shoujianrenzhuzhiField.setFont(font);
		shoujianrenzhuzhiField.setBounds(205, 275, 485, 30);
		tuoyunwupinxinxiJLabel=new JLabel("������Ʒ��Ϣ:");
		tuoyunwupinxinxiJLabel.setForeground(Color.white);
		tuoyunwupinxinxiJLabel.setFont(font);
		tuoyunwupinxinxiJLabel.setBounds(10, 340, 152, 27);
		jianshuJLabel=new JLabel("����:");
		jianshuJLabel.setForeground(Color.white);
		jianshuJLabel.setFont(font);
		jianshuJLabel.setBounds(180, 340, 56, 27);
		jianshuField=new JTextField();
		jianshuField.setFont(font);
		jianshuField.setBounds(250, 340, 50, 30);
		zhongliangField=new JTextField();
		zhongliangField.setFont(font);
		zhongliangField.setBounds(440, 340, 50, 30);
		zhongliangJLabel=new JLabel("����:");
		zhongliangJLabel.setForeground(Color.white);
		zhongliangJLabel.setFont(font);
		zhongliangJLabel.setBounds(360, 340, 56, 27);
		kgJLabel=new JLabel("Kg");
		kgJLabel.setForeground(Color.white);
		kgJLabel.setFont(font);
		kgJLabel.setBounds(500, 340, 24, 27);
		tijiJLabel=new JLabel("���:");
		tijiJLabel.setForeground(Color.white);
		tijiJLabel.setFont(font);
		tijiJLabel.setBounds(180, 385, 56, 27);
		tijiField=new JTextField();
		tijiField.setFont(font);
		tijiField.setBounds(250, 385, 50, 30);
		lifangcmJLabel=new JLabel("cm^3");
		lifangcmJLabel.setForeground(Color.white);
		lifangcmJLabel.setFont(font);
		lifangcmJLabel.setBounds(310, 385, 47, 27);
		chicunJLabel=new JLabel("�ߴ�:");
		chicunJLabel.setForeground(Color.white);
		chicunJLabel.setFont(font);
		chicunJLabel.setBounds(360, 385, 56, 27);
		chicun1Field=new JTextField();
		chicun1Field.setFont(font);
		chicun1Field.setBounds(440, 385, 50, 30);
		chicun2Field=new JTextField();
		chicun2Field.setFont(font);
		chicun2Field.setBounds(526, 385, 50, 30);
		chicun3Field=new JTextField();
		chicun3Field.setFont(font);
		chicun3Field.setBounds(612, 385, 50, 30);
		cm1JLabel=new JLabel("cm*");
		cm1JLabel.setFont(font);
		cm1JLabel.setForeground(Color.white);
		cm1JLabel.setBounds(490, 385, 36, 27);
		cm2JLabel=new JLabel("cm*");
		cm2JLabel.setForeground(Color.white);
		cm2JLabel.setFont(font);
		cm2JLabel.setBounds(576, 385, 36, 27);
		cm3JLabel=new JLabel("cm");
		cm3JLabel.setForeground(Color.white);
		cm3JLabel.setFont(font);
		cm3JLabel.setBounds(662, 385, 36, 27);
		neijianpinmingField=new JTextField();
		neijianpinmingField.setFont(font);
		neijianpinmingField.setBounds(290,430, 250, 30);
		neijianpinmingJLabel=new JLabel("�ڼ�Ʒ��:");
		neijianpinmingJLabel.setFont(font);
		neijianpinmingJLabel.setForeground(Color.white);
		neijianpinmingJLabel.setBounds(180, 430, 104, 27);
		dingdanxinxiJLabel=new JLabel("������Ϣ:");
		dingdanxinxiJLabel.setForeground(Color.white);
		dingdanxinxiJLabel.setFont(font);
		dingdanxinxiJLabel.setBounds(10, 495, 104, 27);
		kuaidizhongleiField=new JTextField();
		kuaidizhongleiField.setFont(font);
		kuaidizhongleiField.setBounds(250, 495, 150, 30);
		kuaidizhongleiJLabel=new JLabel("�������:");
		kuaidizhongleiJLabel.setForeground(Color.white);
		kuaidizhongleiJLabel.setFont(font);
		kuaidizhongleiJLabel.setBounds(135, 495, 104, 27);
		this.add(jijianrenJLabel);
		this.add(jijianrennameJLabel);
		this.add(jijianrennameField);
		this.add(jijianrenshoujiField);
		this.add(jijianrenshoujiJLabel);
		this.add(jijianrendianhuaField);
		this.add(jijianrendianhuaJLabel);
		this.add(jijianrendanweiField);
		this.add(jijianrendanweiJLabel);
		this.add(jijianrenzhuzhiField);
		this.add(jijianrenzhuzhiJLabel);
		this.add(shoujianrenJLabel);
		this.add(shoujianrennameJLabel);
		this.add(shoujianrennameField);
		this.add(shoujianrendianhuaField );
		this.add(shoujianrendianhuaJLabel);
		this.add(shoujianrenshoujiField);
		this.add(shoujianrenshoujiJLabel);
		this.add(shoujianrendanweiField);
		this.add(shoujianrendanweiJLabel);
		this.add(shoujianrenzhuzhiField);
		this.add(shoujianrenzhuzhiJLabel);
		this.add(tuoyunwupinxinxiJLabel);
		this.add(jianshuField);
		this.add(jianshuJLabel);
		this.add(zhongliangField);
		this.add(zhongliangJLabel);
		this.add(kgJLabel);
		this.add(tijiField);
		this.add(tijiJLabel);
		this.add(lifangcmJLabel);
		this.add(chicunJLabel);
		this.add(chicun1Field);
		this.add(chicun2Field);
		this.add(chicun3Field);
		this.add(cm1JLabel);
		this.add(cm2JLabel);
		this.add(cm3JLabel);
		this.add(neijianpinmingField);
		this.add(neijianpinmingJLabel);
		this.add(dingdanxinxiJLabel);
		this.add(kuaidizhongleiField);
		this.add(kuaidizhongleiJLabel);
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		yesButton=new JButton(yesIcon);
		yesButton.setBounds(602, 575,48,48);
		yesButton.setContentAreaFilled(false);
	 	this.setBounds(260, 30, 730,650);
	 	this.add(yesButton);
	 	this.add(returnButton);
	 	this.setLayout(null);
	 	this.setOpaque(false);
	}
	private void registListener(final courierui courierui,final courierJpanel courierJpanel,final b1Jpanel1 b1Jpanel1){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				courierui.setTitle("���Ա����");
				courierJpanel.remove(b1Jpanel1);
				courierJpanel.add(courierui.operationJpanel);
				courierui.orderfinishButton.setEnabled(true);
				courierui.orderfoundButton.setEnabled(true);
				courierui.documentreplyButton.setEnabled(true);
				courierJpanel.repaint();
			}
		});
		yesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				courierui.setTitle("���Ա�����ļ������� 2");
				courierJpanel.remove(b1Jpanel1);
				new b1Jpanel2(courierui, courierJpanel, b1Jpanel1);
				courierJpanel.repaint();
			}
		});
	}
	public void paintComponent(Graphics g)  
{  
		super.paintComponent(g);    
		g.drawImage(frameIcon.getImage(),-7,-12,null);
 }
}
class b1Jpanel2 extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	private JButton yesButton;
	private JLabel dingdantiaoxingmahaoJLabel;
	private JLabel dingdannumberJLabel;
	private JLabel cankaobaojiaJLabel;
	private JLabel cankaobaojianumberJLabel;
	private JLabel yuan1;
	private JLabel baozhuangfeiJLabel;
	private JLabel baozhuangfeinumberJLabel;
	private JLabel yuan2;
	private JLabel yugushijianJLabel;
	private JLabel yugushijiannumberJLabel;
	private JLabel tianJLabel;
	private JLabel shijibaojiaJLabel;
	private JLabel yuan3;
	private JTextField shijibaojianumber;
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
	public b1Jpanel2(courierui courierui,courierJpanel courierJpanel,b1Jpanel1 b1Jpanel1) {
		// TODO Auto-generated constructor stub
		init();
	 	courierJpanel.add(this);
		registListener(courierui,courierJpanel,b1Jpanel1,this);
	}
	private void init(){
		Font font=new Font("��Բ",Font.BOLD,20);
		dingdantiaoxingmahaoJLabel=new JLabel("�����������:");
		dingdantiaoxingmahaoJLabel.setForeground(Color.white);
		dingdantiaoxingmahaoJLabel.setFont(font);
		dingdantiaoxingmahaoJLabel.setBounds(150, 150, 150, 30);
		dingdannumberJLabel=new JLabel();
		dingdannumberJLabel.setForeground(Color.white);
		dingdannumberJLabel.setFont(font);
		dingdannumberJLabel.setBounds(350, 150, 300, 30);
		cankaobaojiaJLabel=new JLabel("�ο�����:");
		cankaobaojiaJLabel.setForeground(Color.white);
		cankaobaojiaJLabel.setFont(font);
		cankaobaojiaJLabel.setBounds(150, 250, 100, 30);
		cankaobaojianumberJLabel=new JLabel();
		cankaobaojianumberJLabel.setForeground(Color.white);
		cankaobaojianumberJLabel.setFont(font);
		cankaobaojianumberJLabel.setBounds(260, 250, 50, 30);
		yuan1=new JLabel("Ԫ");
		yuan1.setForeground(Color.white);
		yuan1.setFont(font);
		yuan1.setBounds(320, 250, 24, 30);
		baozhuangfeiJLabel=new JLabel("��װ��:");
		baozhuangfeiJLabel.setForeground(Color.white);
		baozhuangfeiJLabel.setFont(font);
		baozhuangfeiJLabel.setBounds(400, 250,100, 30);
		baozhuangfeinumberJLabel=new JLabel();
		baozhuangfeinumberJLabel.setForeground(Color.white);
		baozhuangfeinumberJLabel.setFont(font);
		baozhuangfeinumberJLabel.setBounds(510, 250, 50, 30);
		yuan2=new JLabel("Ԫ");
		yuan2.setForeground(Color.white);
		yuan2.setFont(font);
		yuan2.setBounds(570, 250, 24, 30);
		yugushijianJLabel=new JLabel("Ԥ��ʱ��:");
		yugushijianJLabel.setForeground(Color.white);
		yugushijianJLabel.setFont(font);
		yugushijianJLabel.setBounds(150, 350, 100, 30);
		yugushijiannumberJLabel=new JLabel();
		yugushijiannumberJLabel.setForeground(Color.white);
		yugushijiannumberJLabel.setFont(font);
		yugushijiannumberJLabel.setBounds(260, 350, 50, 30);
		tianJLabel=new JLabel("��");
		tianJLabel.setForeground(Color.white);
		tianJLabel.setFont(font);
		tianJLabel.setBounds(320, 350, 24, 30);
		shijibaojiaJLabel=new JLabel("ʵ�ʱ���:");
		shijibaojiaJLabel.setForeground(Color.white);
		shijibaojiaJLabel.setFont(font);
		shijibaojiaJLabel.setBounds(150, 450, 100, 30);
		shijibaojianumber=new JTextField();
		shijibaojianumber.setFont(font);
		shijibaojianumber.setBounds(260, 450, 50, 30);
		yuan3=new JLabel("Ԫ");
		yuan3.setForeground(Color.white);
		yuan3.setFont(font);
		yuan3.setBounds(320, 450,24, 30);
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		yesButton=new JButton(yesIcon);
		yesButton.setBounds(602, 575,48,48);
		yesButton.setContentAreaFilled(false);
		this.add(dingdannumberJLabel);
		this.add(dingdantiaoxingmahaoJLabel);
		this.add(cankaobaojiaJLabel);
		this.add(cankaobaojianumberJLabel);
		this.add(yuan1);
		this.add(baozhuangfeiJLabel);
		this.add(baozhuangfeinumberJLabel);
		this.add(yuan2);
		this.add(yugushijianJLabel);
		this.add(yugushijiannumberJLabel);
		this.add(shijibaojiaJLabel);
		this.add(shijibaojianumber);
		this.add(tianJLabel);
		this.add(yuan3);
	 	this.setBounds(260, 30, 730,650);
	 	this.add(yesButton);
	 	this.add(returnButton);
	 	this.setLayout(null);
	 	this.setOpaque(false);
	}
	private void registListener(final courierui courierui,final courierJpanel courierJpanel,final b1Jpanel1 b1Jpanel1,final b1Jpanel2 b1Jpanel2){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				courierui.setTitle("���Ա�����ļ������� 1");
				courierJpanel.remove(b1Jpanel2);
				courierJpanel.add(b1Jpanel1);
				courierJpanel.repaint();
			}
		});
		yesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new finishDialog(courierui, "�ļ����������", true);
				courierui.setTitle("���Ա����");
				courierJpanel.remove(b1Jpanel2);
				courierJpanel.add(courierui.operationJpanel);
				courierui.orderfinishButton.setEnabled(true);
				courierui.orderfoundButton.setEnabled(true);
				courierui.documentreplyButton.setEnabled(true);
				courierJpanel.repaint();
			}
		});
	}
	public void paintComponent(Graphics g)  
{  
		super.paintComponent(g);    
		g.drawImage(frameIcon.getImage(),-7,-12,null);
 }
}
class finishDialog extends JDialog{
	private dialogJpanel jPanel;
	private JLabel jLabel;
	private JButton jButton;
	public finishDialog(JFrame frame,String title,boolean modal) {
		super(frame,title,modal);
		init();
		registerListener();
		this.setVisible(true);
	}
	private void init(){
		ImageIcon yesIcon=new ImageIcon("picture/��¼.png");
		jLabel=new JLabel("�ļ����������",jLabel.CENTER);
		jLabel.setForeground(Color.white);
		jLabel.setFont(new Font("��Բ",Font.BOLD,27));
		jPanel=new dialogJpanel();
		jButton=new JButton(yesIcon);
		jButton.setContentAreaFilled(false);
		jPanel.setLayout(null);
		jButton.setBounds(218,160, 64, 64);
		jLabel.setBounds(0, 0, 500, 200);
		jPanel.add(jLabel);
		jPanel.add(jButton);
		this.add(jPanel);
		this.setSize(500, 300);
		Toolkit kitToolkit =Toolkit.getDefaultToolkit();
		Dimension screenSize=kitToolkit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int dialogWidth=this.getWidth();
		int dialogHeight=this.getHeight();
		this.setLocation((screenWidth-dialogWidth)/2, (screenHeight-dialogHeight)/2);
		this.setResizable(false);
	}
	private void registerListener(){
		jButton.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				finishDialog.this.dispose();
			}
		});
	}
}
class dialogJpanel extends JPanel{
	private ImageIcon dialogIcon=new ImageIcon("picture/����.png");
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(dialogIcon.getImage(),0,0,null);
      
     }
   }