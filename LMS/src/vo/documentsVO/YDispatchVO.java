package vo.documentsVO;


public class YDispatchVO  extends DocumentVO{
	private String date;//�ɼ�����
	private String code;//�ɼ������
	private String doName;//������
	private String account;//�������˺�
	private String name2;//�ɼ����Ա����
	public YDispatchVO(String date, String code, String doName, String account,String name2) {
		super();
		this.date = date;
		this.code = code;
		this.doName = doName;
		this.account = account;
		this.name2=name2;
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


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}

}
