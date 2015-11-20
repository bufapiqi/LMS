package po.documentsPO;

import java.io.Serializable;

public class PaymentPO extends DocumentPO implements Serializable {
	private String code;//������
	private String doName;//������
	private String date;
	private String account;//�������˺�
	private double fund;//������
	private String name2;//����������
	private String account2;//�����˺�
	private String type;//��Ŀ
	private String remark;//��ע
	public PaymentPO(String code, String doName, String date,String account, double fund,
			String name2, String account2, String type, String remark) {
		super();
		this.code = code;
		this.doName = doName;
		this.date = date;
		this.account = account;
		this.fund = fund;
		this.name2 = name2;
		this.account2 = account2;
		this.type = type;
		this.remark = remark;
	}
	
	public String getAccount2() {
		return account2;
	}

	public void setAccount2(String account2) {
		this.account2 = account2;
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
	public void setName2(String name) {
		this.name2 = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	

	
}
