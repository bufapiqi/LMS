package po.accountPO;
/**
 * 用来表示账号信息持久化对象
 * 
 * @author YangHua'an
 *
 */
import java.io.Serializable;
import java.util.Calendar;

public class AccountInfoPO implements Serializable {
	
	/**
	 * 序列号版本号
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;//账号姓名
	private long ID;//账号ID
	private String password;//账号密码
	private String state;
	/**
	 * 职位信息-所在城市-所属机构名称
	 * null代表空闲
	 * 1代表快递员
	 * 2代表营业厅业务员
	 * 3代表中转中心业务员
	 * 4代表中转中心仓库管理员
	 * 5代表财务人员
	 * 6代表总经理
	 * 7代表系统管理员
	 */
	private String phone;//电话号码
	private String sID;//身份证号码
	private Calendar date;//注册时间
	
	public AccountInfoPO(String name, long iD, String password, String state, String phone, String sID, Calendar date) {
		super();
		this.name = name;
		ID = iD;
		this.password = password;
		this.state = state;
		this.phone = phone;
		this.sID = sID;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getsID() {
		return sID;
	}

	public void setsID(String sID) {
		this.sID = sID;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	
	

}
