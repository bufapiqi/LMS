package po.financePO;

import java.io.Serializable;



/**
 * ���ڴ洢�򷵻��˻����� �� ���
 * @author YangGuan
 *
 */
public class AccountPO  implements Serializable {
	
	
	private String name; //�˻�����
	private double sums; // ���
	
	
	public AccountPO(String name, double sums) {
		super();
		this.name = name;
		this.sums = sums;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSums() {
		return sums;
	}


	public void setSums(double sums) {
		this.sums = sums;
	}
	
	
	
	
}
