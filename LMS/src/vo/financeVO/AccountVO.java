package vo.financeVO;


/**
 * ������ʾ�˻����� �� ���
 * @author YangGuan
 *
 */
public class AccountVO {
	
	private String name; //�˺�����
	private double sums; // ���
	public AccountVO(String name, double sums) {
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
