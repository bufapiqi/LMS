package presentation.topmanagerui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class b3topmanagerui extends JFrame{
	private topmanagerJpanel topmanagerJpanel;
	private topmanagerb3OperationJpanel operationJpanel;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	public b3topmanagerui(String s,topmanagerui tmui) {
		// TODO Auto-generated constructor stub
		super(s);
		init(tmui);
	}
	private void init(topmanagerui topmanagerui){
		topmanagerJpanel=new topmanagerJpanel();
		operationJpanel=new topmanagerb3OperationJpanel(topmanagerJpanel,topmanagerui,this);
		ImageIcon b1Icon=new ImageIcon("picture/�ļ���.png");
		ImageIcon b2Icon=new ImageIcon("picture/�տ.png");
		ImageIcon b3Icon=new ImageIcon("picture/װ����.png");
		ImageIcon b4Icon=new ImageIcon("picture/��ת���Ľ��յ�.png");
		ImageIcon b5Icon=new ImageIcon("picture/װ�˵�.png");
		ImageIcon b6Icon=new ImageIcon("picture/���ⵥ.png");
		ImageIcon b7Icon=new ImageIcon("picture/��ⵥ.png");
		ImageIcon b8Icon=new ImageIcon("picture/Ӫҵ�����յ�.png");
		ImageIcon b9Icon=new ImageIcon("picture/�ɼ���.png");
		ImageIcon b10Icon=new ImageIcon("picture/�ռ���.png");
		ImageIcon b11Icon=new ImageIcon("picture/���.png");

		b1=new JButton(b1Icon);
		b2=new JButton(b2Icon);
		b3=new JButton(b3Icon);
		b4=new JButton(b4Icon);
		b5=new JButton(b5Icon);
		b6=new JButton(b6Icon);
		b7=new JButton(b7Icon);
		b8=new JButton(b8Icon);
		b9=new JButton(b9Icon);
		b10=new JButton(b10Icon);
		b11=new JButton(b11Icon);		
		b1.setContentAreaFilled(false);
		b2.setContentAreaFilled(false);
		b3.setContentAreaFilled(false);
		b4.setContentAreaFilled(false);
		b5.setContentAreaFilled(false);
		b6.setContentAreaFilled(false);
		b7.setContentAreaFilled(false);
		b8.setContentAreaFilled(false);
		b9.setContentAreaFilled(false);
		b10.setContentAreaFilled(false);
		b11.setContentAreaFilled(false);
		b1.setBounds(30, 40,200, 50);
		b2.setBounds(30,95,200, 50);
		b3.setBounds(30,150,200, 50);
		b4.setBounds(30,205,200, 50);
		b5.setBounds(30,260,200, 50);
		b6.setBounds(30,315,200, 50);
		b7.setBounds(30,370,200, 50);
		b8.setBounds(30,425,200, 50);
		b9.setBounds(30,480,200, 50);
		b10.setBounds(30,535,200, 50);
		b11.setBounds(30,590,200, 50);
		topmanagerJpanel.add(b1);
		topmanagerJpanel.add(b2);
		topmanagerJpanel.add(b3);
		topmanagerJpanel.add(b4);
		topmanagerJpanel.add(b5);
		topmanagerJpanel.add(b6);
		topmanagerJpanel.add(b7);
		topmanagerJpanel.add(b8);
		topmanagerJpanel.add(b9);
		topmanagerJpanel.add(b10);
		topmanagerJpanel.add(b11);
		topmanagerJpanel.setLayout(null);

		this.add(topmanagerJpanel);
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

}
class topmanagerb3OperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	public topmanagerb3OperationJpanel(topmanagerJpanel topmanagerJpanel,topmanagerui topmanagerui,b3topmanagerui b3topmanagerui) {
		// TODO Auto-generated constructor stub
		init();
		topmanagerJpanel.add(this);
		registListener(topmanagerui, b3topmanagerui);
	}
	private void init(){
		ImageIcon returnIcon=new ImageIcon("picture/����.png");
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575, 48,48);
		returnButton.setContentAreaFilled(false);
		this.setBounds(260, 30,730,650);
		this.setOpaque(false);
		this.setLayout(null);
		this.add(returnButton);
	}
	private void registListener(final topmanagerui tmui,final b3topmanagerui b3tmui){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tmui.setVisible(true);
				b3tmui.dispose();
				
			}
		});
	}
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}

