package vo.documentsVO;


import java.util.ArrayList;

public class ReceiptVO  extends DocumentVO{
	private String code;//�տ���
	private String doName;//������
	private String date;//�տ�����
	private String account;//�������˺�
	private double fund;//�տ���
	private String name2;//���Ա����
	private ArrayList<String> TCode;//���ж����������
	public ReceiptVO(String code, String doName, String date, double fund,
		 ArrayList<String> tCode, String account, String name2) {
		super();
		this.code = code;
		this.doName = doName;
		this.date = date;
		this.account=account;
		this.fund = fund;
		this.name2 = name2;
		TCode = tCode;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDoName() {
		return doName;
	}
	public void setDoName(String doName) {
		this.doName = doName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getFund() {
		return fund;
	}
	public void setFund(double fund) {
		this.fund = fund;
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public ArrayList<String> getTCode() {
		return TCode;
	}
	public void setTCode(ArrayList<String>TCode) {
		this.TCode = TCode;
	}
}
