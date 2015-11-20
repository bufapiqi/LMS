package po.orgPO;
/**
 * ������ʾ���񲿻�����Ϣ�־û�����
 * 
 * @author YangHua'an
 *
 */
import java.io.Serializable;
import java.util.ArrayList;

import po.accountPO.AccountInfoPO;


public class FinanceOrgPO implements Serializable {

	/**
	 * 
	 * ���кŰ汾��
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String city;//�������ڳ���
	private String codeNumber;//������ţ�����Ψһ��Ϊ000��
	private ArrayList<AccountInfoPO> financer;//������Ա�˺��б�
	
	public FinanceOrgPO(String city, String codeNumber, ArrayList<AccountInfoPO> financer) {
		super();
		this.city = city;
		this.codeNumber = codeNumber;
		this.financer = financer;
		for(AccountInfoPO po:financer){
			po.setState(5+"-"+city+"-����");
		}
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCodeNumber() {
		return codeNumber;
	}

	public void setCodeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
	}

	
	public ArrayList<AccountInfoPO> getFinancer() {
		return financer;
	}

	public void setFinancer(ArrayList<AccountInfoPO> financer) {
		this.financer = financer;
	}

	public void addFinancer(AccountInfoPO po){
		this.financer.add(po);	
		po.setState(5+"-"+city+"-����");
	}
	
	public void removeFinancer(AccountInfoPO po){
	this.financer.remove(po);
	po.setState(null);

	}
	
	
}
