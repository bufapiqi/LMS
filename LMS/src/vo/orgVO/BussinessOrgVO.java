package vo.orgVO;

import java.util.ArrayList;

import vo.accountVO.AccountNumberVO;

/**
 * ������ʾӪҵ��
 * 
 * @author YangHua'an
 *
 */
public class BussinessOrgVO {
	private String Mcity;//������ת���ĳ���
	private String city;//�������ڳ���
	private String codeNumber;//������ţ�3λ
	private String codeNemberOfMiddle;//������ת���ı�ţ�3λ
	private ArrayList<AccountNumberVO> assisant;//Ӫҵ��ҵ��Ա�˺��б�
	private ArrayList<AccountNumberVO> courier;//���Ա�˺��б�
	private ArrayList<VehicleVO> vehicle;//������Ϣ�б�
	private ArrayList<DriverVO> driver;//˾����Ϣ�б�
	


	public BussinessOrgVO(String Mcity,String city, String codeNumber, String codeNemberOfMiddle,
			ArrayList<AccountNumberVO> assisant, ArrayList<AccountNumberVO> courier, ArrayList<VehicleVO> vehicle,
			ArrayList<DriverVO> driver) {
		super();
		this.Mcity=Mcity;
		this.city = city;
		this.codeNumber = codeNumber;
		this.codeNemberOfMiddle = codeNemberOfMiddle;
		this.assisant = assisant;
		this.courier = courier;
		this.vehicle = vehicle;
		this.driver = driver;
		
		for(AccountNumberVO vo:assisant){
			vo.setState(2+"-"+Mcity+"-"+city+"-Ӫҵ��"+"-"+Mcity+"-"+city);
		}
		for(AccountNumberVO vo:courier){
			vo.setState(1+"-"+Mcity+"-"+city+"-Ӫҵ��"+"-"+Mcity+"-"+city);
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

	public String getCodeNemberOfMiddle() {
		return codeNemberOfMiddle;
	}

	public void setCodeNemberOfMiddle(String codeNemberOfMiddle) {
		this.codeNemberOfMiddle = codeNemberOfMiddle;
	}

	public ArrayList<AccountNumberVO> getAssisant() {
		return assisant;
	}

	public void setAssisant(ArrayList<AccountNumberVO> assisant) {
		this.assisant = assisant;
	}

	public ArrayList<AccountNumberVO> getCourier() {
		return courier;
	}

	public void setCourier(ArrayList<AccountNumberVO> courier) {
		this.courier = courier;
	}
	
	
	public ArrayList<VehicleVO> getVehicle() {
		return vehicle;
	}

	public void setVehicle(ArrayList<VehicleVO> vehicle) {
		this.vehicle = vehicle;
	}

	public ArrayList<DriverVO> getDriver() {
		return driver;
	}

	public void setDriver(ArrayList<DriverVO> driver) {
		this.driver = driver;
	}

	public void addAssisant(AccountNumberVO vo){
		this.assisant.add(vo);	
		vo.setState(2+"-"+Mcity+"-"+city+"-Ӫҵ��"+"-"+Mcity+"-"+city);
	}
	
	public void removeAssisant( AccountNumberVO vo){
	    this.assisant.remove(vo);
	    vo.setState("0");

	}
	
	public void addCourier(AccountNumberVO vo){
		this.courier.add(vo);	
		vo.setState(2+"-"+Mcity+"-"+city+"-Ӫҵ��"+"-"+Mcity+"-"+city);
	}
	
	public void removeCourier( AccountNumberVO vo){
	    this.courier.remove(vo);
	    vo.setState("0");

	}
	
	public void addVehicle(VehicleVO vo){
		this.vehicle.add(vo);
	}
	
	public void removeVehicle(VehicleVO vo){
		this.vehicle.remove(vo);
	}

	public void addDriver(DriverVO vo){
		this.driver.add(vo);
	}
	
	public void removeDriverVO(DriverVO vo){
		this.driver.remove(vo);
	}
	
}
