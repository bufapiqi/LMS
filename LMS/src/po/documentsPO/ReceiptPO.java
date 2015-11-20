package po.documentsPO;

import java.io.Serializable;
import java.util.ArrayList;

public class ReceiptPO extends DocumentPO implements Serializable {
	private String code;//�տ���
	private String doName;//������
	private String date;//�տ�����
	private String account;//�������˺�
	private double fund;//�տ���
	private String name2;//���Ա����
	private ArrayList<String> TCode;//���ж����������
	public ReceiptPO(String code, String doName, String date, String account,double fund,
			String name2, ArrayList<String> tCode) {
		super();
		this.code = code;
		this.doName = doName;
		this.date = date;
		this.account=account;
		this.fund = fund;
		this.name2 = name2;
		TCode = tCode;
	}
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
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
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public ArrayList<String> getTCode() {
		return TCode;
	}
	public void setTCode(ArrayList<String> tCode) {
		TCode = tCode;
	}
	
	
	
}
