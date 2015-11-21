package vo.orgVO;

import java.util.ArrayList;

import vo.accountVO.AccountNumberVO;


/**
 * ������ʾ��ת����
 * 
 * @author YangHua'an
 *
 */
public class MiddleOrgVO {

	private String city;//�������ڳ���
	private String codeNumber;//������ţ�3λ����000
	private ArrayList<AccountNumberVO> assisant;//��ת����ӪҵԱ�˺��б�
	private ArrayList<AccountNumberVO> storger;//�ֿ����Ա�˺��б�
	private ArrayList<BussinessOrgVO> bussinessHall;//��ϽӪҵ���б�
	//private ArrayList<VehicleVO> vehicle;//������Ϣ�б�
	//private ArrayList<DriverVO> driver;//˾����Ϣ�б�

	

	

	public MiddleOrgVO(String city, String codeNumber, ArrayList<AccountNumberVO> assisant,
			ArrayList<AccountNumberVO> storger, ArrayList<BussinessOrgVO> bussinessHall) {
		super();
		this.city = city;
		this.codeNumber = codeNumber;
		this.assisant = assisant;
		this.storger = storger;
		this.bussinessHall = bussinessHall;
		
		for(AccountNumberVO vo:assisant){
			vo.setState(3+"-"+city+"-��ת����"+"-"+codeNumber);
		}
		
		for(AccountNumberVO vo:storger){
			vo.setState(4+"-"+city+"-��ת����"+"-"+codeNumber);
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

	public ArrayList<AccountNumberVO> getAssisant() {
		return assisant;
	}

	public void setAssisant(ArrayList<AccountNumberVO> assisant) {
		this.assisant = assisant;
	}

	public ArrayList<AccountNumberVO> getStorger() {
		return storger;
	}

	public void setStorger(ArrayList<AccountNumberVO> storger) {
		this.storger = storger;
	}

	public ArrayList<BussinessOrgVO> getBussinessHall() {
		return bussinessHall;
	}

	public void setBussinessHall(ArrayList<BussinessOrgVO> bussinessHall) {
		this.bussinessHall = bussinessHall;
	}

	public void addAssisant(AccountNumberVO vo){
		this.assisant.add(vo);	
		vo.setState(3+"-"+city+"-��ת����"+"-"+codeNumber);
	}
	
	public void removeAssisant( AccountNumberVO vo){
	   this.assisant.remove(vo);
	   vo.setState("0");
	}
	
	public void addStorger(AccountNumberVO vo){
		this.assisant.add(vo);	
		vo.setState(4+"-"+city+"-��ת����"+"-"+codeNumber);
	}
	
	public void removeStorger( AccountNumberVO vo){
	    this.storger.remove(vo);
	    vo.setState("0");

	}
	
	public void addBussinessOrg(BussinessOrgVO vo){
		this.bussinessHall.add(vo);	
	}
	
	public void removeBussinessOrg(BussinessOrgVO vo){
		this.bussinessHall.remove(vo);	
	}

}
