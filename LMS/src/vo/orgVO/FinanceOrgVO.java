package vo.orgVO;

import java.util.ArrayList;

import vo.accountVO.AccountNumberVO;

/**
 * 
 *������ʾ����
 *
 * @author YangHua'an
 *
 */
public class FinanceOrgVO {

	private String city;//�������ڳ���
	private String codeNumber;//������ţ�����Ψһ��Ϊ000��
	private ArrayList<AccountNumberVO> financer;//������Ա�˺��б�
	
	public FinanceOrgVO(String city, String codeNumber, ArrayList<AccountNumberVO> financer) {
		super();
		this.city = city;
		this.codeNumber = codeNumber;
		this.financer = financer;
		for(AccountNumberVO vo:financer){
			vo.setState(5+"-"+city+"-����");
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

	public ArrayList<AccountNumberVO> getFinancer() {
		return financer;
	}

	public void setFinancer(ArrayList<AccountNumberVO> financer) {
		this.financer = financer;
	}
	
	public void addFinancer(AccountNumberVO vo){
		this.financer.add(vo);	
		vo.setState(5+"-"+city+"-����");
	}
	
	public void removeFinancer( AccountNumberVO vo){
	this.financer.remove(vo);
	vo.setState(null);

	}
}
