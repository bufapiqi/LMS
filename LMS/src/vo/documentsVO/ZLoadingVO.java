package vo.documentsVO;

import java.util.ArrayList;

public class ZLoadingVO  extends DocumentVO{
	private String date;
	private String code;//װ�˵����
	private String doName;//������
	private String account;//�������˺�
	private String transcode;//��������
	private String departure;//������
	private String arrival;//�����
	private String name2;//��װԱ����
	private ArrayList<String> codeList;//���ж����������
	private double carriage;//�˷�
	public ZLoadingVO(String date, String code, String doName,String account,
			String transcode, String departure, String arrival, String name2,
			ArrayList<String> codeList, double carriage) {
		super();
		this.date = date;
		this.code = code;
		this.doName = doName;
		this.transcode = transcode;
		this.departure = departure;
		this.arrival = arrival;
		this.account = account;
		this.name2=name2;
		this.codeList = codeList;
		this.carriage = carriage;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
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
	public String getTranscode() {
		return transcode;
	}
	public void setTranscode(String transcode) {
		this.transcode = transcode;
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
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public ArrayList<String> getCodeList() {
		return codeList;
	}
	public void setCodeList(ArrayList<String> codeList) {
		this.codeList = codeList;
	}
	public double getCarriage() {
		return carriage;
	}
	public void setCarriage(double carriage) {
		this.carriage = carriage;
	}
}
