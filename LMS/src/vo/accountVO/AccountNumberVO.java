package vo.accountVO;

import java.util.Calendar;

/**
 * ������ʾ�˺���Ϣ
 * 
 * @author YangHua'an
 *
 */
public class AccountNumberVO {

	private String name;//�˺�����
	private long ID;//�˺�ID
	private String password;//�˺�����
	private String state;
	/**
	 * int-(������ת���ĳ���-�����ڳ���-������������-��ת���ı�ţ�-Ӫҵ����ţ�
	 * null�������
	 * 1������Ա
	 * 2����Ӫҵ��ҵ��Ա
	 * 3������ת����ҵ��Ա
	 * 4������ת���Ĳֿ����Ա
	 * 5���������Ա
	 * 6�����ܾ���
	 * 7����ϵͳ����Ա
	 * ���磺1-�Ͼ�-��¥-Ӫҵ��-001-001  ��ʾ�Ͼ���¥Ӫҵ���Ŀ��Ա
	 *      3-�Ͼ�-��ת����-001  ��ʾ�Ͼ���ת���ĵ�ҵ��Ա
	 *      0 ��ʾ����
	 */
	private String phone;//�绰����
	private String sID;//���֤����
	private Calendar date;//ע��ʱ��
	
	
	public AccountNumberVO(String name, long iD, String password, String state, String phone, String sID, Calendar date) {
		super();
		this.name = name;
		ID = iD;
		this.password = password;
		this.state = state;
		this.phone = phone;
		this.sID = sID;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getsID() {
		return sID;
	}

	public void setsID(String sID) {
		this.sID = sID;
	}
	
}
