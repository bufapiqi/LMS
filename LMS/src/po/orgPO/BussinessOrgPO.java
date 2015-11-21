package po.orgPO;
//����һ��//
import java.io.Serializable;
import java.util.ArrayList;

import po.accountPO.AccountInfoPO;


public class BussinessOrgPO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Mcity;//������ת���ĳ���
	private String city;//�������ڳ���
	private String codeNumber;//������ţ�3λ
	private String codeNumberOfMiddle;//������ת���ı�ţ�3λ
	private ArrayList<AccountInfoPO> assisant;//Ӫҵ��ҵ��Ա�˺��б�
	private ArrayList<AccountInfoPO> courier;//���Ա�˺��б�
	private ArrayList<VehiclePO> vehicle;//������Ϣ�б�
	private ArrayList<DriverPO> driver;//˾����Ϣ�б�
	
	
	public BussinessOrgPO(String Mcity,String city, String codeNumber, String codeNumberOfMiddle, ArrayList<AccountInfoPO> assisant,
			ArrayList<AccountInfoPO> courier, ArrayList<VehiclePO> vehicle, ArrayList<DriverPO> driver) {
		super();
		this.Mcity=Mcity;
		this.city = city;
		this.codeNumber = codeNumber;
		this.codeNumberOfMiddle = codeNumberOfMiddle;
		this.assisant = assisant;
		this.courier = courier;
		this.vehicle = vehicle;
		this.driver = driver;
		
		for(AccountInfoPO po:assisant){
			po.setState(2+"-"+Mcity+"-"+city+"-Ӫҵ��"+"-"+Mcity+"-"+city);
		}
		for(AccountInfoPO po:courier){
			po.setState(1+"-"+Mcity+"-"+city+"-Ӫҵ��"+"-"+Mcity+"-"+city);
		}
	}
	
	public String getMcity() {
		return Mcity;
	}

	public void setMcity(String mcity) {
		Mcity = mcity;
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
	
	public String getCodeNumberOfMiddle() {
		return codeNumberOfMiddle;
	}
	public void setCodeNumberOfMiddle(String codeNumberOfMiddle) {
		this.codeNumberOfMiddle = codeNumberOfMiddle;
	}
	public ArrayList<AccountInfoPO> getAssisant() {
		return assisant;
	}
	public void setAssisant(ArrayList<AccountInfoPO> assisant) {
		this.assisant = assisant;
	}
	public ArrayList<AccountInfoPO> getCourier() {
		return courier;
	}
	public void setCourier(ArrayList<AccountInfoPO> courier) {
		this.courier = courier;
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
	
	public void addCourier(AccountInfoPO po){
		this.courier.add(po);	
		po.setState(2+"-"+Mcity+"-"+city+"-Ӫҵ��"+"-"+Mcity+"-"+city);
	}
	
	public void removeCourier(AccountInfoPO po){
	    this.courier.remove(po);
	    po.setState("0");

	}
	
	public void addAssisant(AccountInfoPO po){
		this.assisant.add(po);	
		po.setState(3+"-"+Mcity+"-"+city+"-Ӫҵ��"+"-"+Mcity+"-"+city);
	}
	
	public void removeAssisant(AccountInfoPO po){
	    this.assisant.remove(po);
	    po.setState("0");

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
	
	public void removeDriverVO(DriverPO po){
		this.driver.remove(po);
	}
	
}
