package vo.documentsVO;


import businesslogic.state.CargoState;

public class ZReceiveVO  extends DocumentVO{
	private String code;//��ת�����
	private String doName;//������
	private String date;
	private String account;//�������˺�
	private String zCode;
	private String departure;
	private String arrival;
	private CargoState state;//����״̬
	public ZReceiveVO(String code, String doName, String date, String account, String zCode,
			String departure, String arrival,CargoState state) {
		super();
		this.code = code;
		this.doName = doName;
		this.date = date;
		this.account=account;
		this.zCode = zCode;
		this.departure = departure;
		this.arrival=arrival;
		this.state = state;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
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
	public CargoState getState() {
		return state;
	}
	public void setState(CargoState state) {
		this.state = state;
	}
	
	
}
