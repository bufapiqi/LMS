package po.orgPO;
/**
 * ������ʾ˾����Ϣ�־û�����
 */
import java.io.Serializable;

public class DriverPO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codeDriver;//˾����ţ����б��+Ӫҵ�����+���
	private String codeCity;//���б�ţ�3λ���֣��Ͼ�025����000
	private String codeBussinessHall;//Ӫҵ����ţ�3λ������000
	private String codeID;//��ţ�3λ������000
	
	private String name;//����
	private String date;//��������
	private String ID;//���֤����
	private String phone;//�ֻ�����
	private String sex;//�Ա�
	private String toDate;//��ʻ֤����
	public DriverPO( String codeCity, String codeBussinessHall, String codeID, String name,
			String date, String iD, String phone, String sex, String toDate) {
		super();
		this.codeDriver = codeCity+codeBussinessHall+codeID;
		this.codeCity = codeCity;
		this.codeBussinessHall = codeBussinessHall;
		this.codeID = codeID;
		this.name = name;
		this.date = date;
		ID = iD;
		this.phone = phone;
		this.sex = sex;
		this.toDate = toDate;
	}
	public String getCodeDriver() {
		return codeDriver;
	}
	public void setCodeDriver(String codeDriver) {
		this.codeDriver = codeDriver;
	}
	public String getCodeCity() {
		return codeCity;
	}
	public void setCodeCity(String codeCity) {
		this.codeCity = codeCity;
	}
	public String getCodeBussinessHall() {
		return codeBussinessHall;
	}
	public void setCodeBussinessHall(String codeBussinessHall) {
		this.codeBussinessHall = codeBussinessHall;
	}
	public String getCodeID() {
		return codeID;
	}
	public void setCodeID(String codeID) {
		this.codeID = codeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	

}
