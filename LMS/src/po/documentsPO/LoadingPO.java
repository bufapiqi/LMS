package po.documentsPO;

import java.io.Serializable;
import java.util.ArrayList;

public class LoadingPO extends DocumentPO implements Serializable {
	private String date;
	private String code;//װ�˵����
	private String doName;//������
	private String account;//�������˺�
	private String departure;//������
	private String arrival;//Ŀ�ĵ�
	private String supervisor;//��װԱ
	private String supercargo;//Ѻ��Ա
	private ArrayList<String> codeList;//�������˵���
	private double charge;//�˷�
	public LoadingPO(String date, String code, String doName,String
			 account,String departure,
			String arrival, String supervisor, String supercargo,
			ArrayList<String> codeList, double charge) {
		super();
		this.date = date;
		this.code = code;
		this.doName = doName;
		this.account=account;
		this.departure = departure;
		this.arrival = arrival;
		this.supervisor = supervisor;
		this.supercargo = supercargo;
		this.codeList = codeList;
		this.charge = charge;
	}
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
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
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	public String getSupercargo() {
		return supercargo;
	}
	public void setSupercargo(String supercargo) {
		this.supercargo = supercargo;
	}
	public ArrayList<String> getCodeList() {
		return codeList;
	}
	public void setCodeList(ArrayList<String> codeList) {
		this.codeList = codeList;
	}
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	

	
	
}
