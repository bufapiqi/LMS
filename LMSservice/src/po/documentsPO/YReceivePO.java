package po.documentsPO;

import java.io.Serializable;

import state.CargoState;

public class YReceivePO extends DocumentPO implements Serializable {
	private String date;//��������
	private String code;//���յ����
	private String doName;//������
	private String code1;//�����������
	private String account;//�������˺�
	private String departure;//������
	private String arrival;//��Ӫҵ��
	private CargoState state;//����״̬
	public YReceivePO(String date, String code, String doName,String code1,String
			name,
			String departure, CargoState state) {
		super();
		this.date = date;
		this.code = code;
		this.doName = doName;
		this.code1=code1;
		this.account=account;
		this.departure = departure;
		this.arrival=arrival;
		this.state = state;
	}
	
	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getCode1() {
		return code1;
	}

	public void setCode1(String code1) {
		this.code1 = code1;
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
	public CargoState getState() {
		return state;
	}
	public void setState(CargoState state) {
		this.state = state;
	}
	
	
	
	
}
