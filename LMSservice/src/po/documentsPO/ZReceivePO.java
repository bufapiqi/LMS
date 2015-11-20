package po.documentsPO;

import java.io.Serializable;

import state.CargoState;

public class ZReceivePO extends DocumentPO implements Serializable {
	private String code;//��ת�����
	private String doName;//������
	private String date;
	private String account;//�������˺�
	private String zCode;//��ת�������˱��
	private String departure;
	private String arrival;
	public ZReceivePO(String code, String doName, String date,String account, String zCode,
			String departure,String arrival) {
		super();
		this.code = code;
		this.doName = doName;
		this.date = date;
		this.account = account;
		this.zCode = zCode;
		this.departure = departure;
		this.arrival=arrival;
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
	public String getzCode() {
		return zCode;
	}
	public void setzCode(String zCode) {
		this.zCode = zCode;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}

}
