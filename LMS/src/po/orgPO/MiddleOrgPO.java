package po.orgPO;
/**
 * ������ʾ��ת���ĳ־û�����
 * 
 * @author YangHua'an
 *
 */
import java.io.Serializable;
import java.util.ArrayList;

import po.accountPO.AccountInfoPO;


public class MiddleOrgPO implements Serializable {
	
	/**
	 * 
	 * ���кŰ汾��
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String city;//�������ڳ���
	private String codeNumber;//������ţ�����Ψһ��Ϊ000��
	private ArrayList<AccountInfoPO> assisant;//��ת����ӪҵԱ�˺��б�
	private ArrayList<AccountInfoPO> storger;//�ֿ����Ա�˺��б�
	private ArrayList<BussinessOrgPO> bussinessHall;//��ϽӪҵ���б�
	private ArrayList<VehiclePO> vehicle;//������Ϣ�б�
	private ArrayList<DriverPO> driver;//˾����Ϣ�б�
	
	public MiddleOrgPO(String city, String codeNumber, ArrayList<AccountInfoPO> assisant,
			ArrayList<AccountInfoPO> storger, ArrayList<BussinessOrgPO> bussinessHall, ArrayList<VehiclePO> vehicle,
			ArrayList<DriverPO> driver) {
		super();
		this.city = city;
		this.codeNumber = codeNumber;
		this.assisant = assisant;
		this.storger = storger;
		this.bussinessHall = bussinessHall;
		this.vehicle = vehicle;
		this.driver = driver;
		
		for(AccountInfoPO po:assisant){
			po.setState(3+"-"+city+"-��ת����"+"-"+codeNumber);
		}
		
		for(AccountInfoPO po:storger){
			po.setState(4+"-"+city+"-��ת����"+"-"+codeNumber);
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

	public ArrayList<AccountInfoPO> getAssisant() {
		return assisant;
	}

	public void setAssisant(ArrayList<AccountInfoPO> assisant) {
		this.assisant = assisant;
	}

	public ArrayList<AccountInfoPO> getStorger() {
		return storger;
	}

	public void setStorger(ArrayList<AccountInfoPO> storger) {
		this.storger = storger;
	}

	public ArrayList<BussinessOrgPO> getBussinessHall() {
		return bussinessHall;
	}

	public void setBussinessHall(ArrayList<BussinessOrgPO> bussinessHall) {
		this.bussinessHall = bussinessHall;
	}

	public ArrayList<VehiclePO> getVehicle() {
		return vehicle;
	}

	public void setVehicle(ArrayList<VehiclePO> vehicle) {
		this.vehicle = vehicle;
	}

	public ArrayList<DriverPO> getDriver() {
		return driver;
	}

	public void setDriver(ArrayList<DriverPO> driver) {
		this.driver = driver;
	}
	
	public void addAssisant(AccountInfoPO po){
		this.assisant.add(po);	
		po.setState(3+"-"+city+"-��ת����"+"-"+codeNumber);
	}
	
	public void removeAssisant( AccountInfoPO po){
	    this.assisant.remove(po);
	    po.setState("0");

	}
	
	public void addStorger(AccountInfoPO po){
		this.assisant.add(po);	
		po.setState(4+"-"+city+"-��ת����"+"-"+codeNumber);
	}
	
	public void removeStorger( AccountInfoPO po){
	    this.storger.remove(po);
	    po.setState("0");

	}
	
	public void addBussinessOrg(BussinessOrgPO po){
		this.bussinessHall.add(po);	
	}
	
	public void removeBussinessOrg(BussinessOrgPO po){
		this.bussinessHall.remove(po);	
	}
	
	public void addVehicle(VehiclePO po){
		this.vehicle.add(po);
	}
	
	public void removeVehicle(VehiclePO po){
		this.vehicle.remove(po);
	}

	public void addDriver(DriverPO po){
		this.driver.add(po);
	}
	
	public void removeDriver(DriverPO po){
		this.driver.remove(po);
	}
	


}
