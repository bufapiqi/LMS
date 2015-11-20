package po.documentsPO;

import java.io.Serializable;
import java.util.ArrayList;

import state.OrderState;

public class OrderPO extends DocumentPO implements Serializable {
	private String code;//�������
	private String doName;//������
	private String account;//�������˺�
	private String date;//����(���嵽���ӣ�
	private String SenderName;//�ļ�������
	private String SenderAddress;//�ļ��˵�ַ
	private String SenderOrg;//�ļ��˵�λ
	private String SPhoneNumber;//�ļ��˵绰
	private String SMobileNumber;//�ļ����ֻ���
	private String ReceiverName;//�ռ�������
	private String ReceiverAddress;//�ռ��˵�ַ
	private String ReceiverOrg;//�ռ��˵�λ
	private String RPhoneNumber;//�ռ��˵绰
	private String RMobileNumber;//�ռ����ֻ���
	private int number;//��������
	private double weight;//��������
	private double shape;//�������
	private ArrayList<String> cargoNameList;//������
	private double[] sizeList;//�����С
	//private double packageCost;//��װ��
	private double sumCost;//�ܷ���
	private OrderState state;//�������
	
	public OrderPO(String code, String doName,String account,String date, String senderName,
			String senderAddress, String senderOrg, String sPhoneNumber,
			String sMobileNumber, String receiverName, String receiverAddress,
			String receiverOrg, String rPhoneNumber, String rMobileNumber,
			int number, double weight, double shape,
			ArrayList<String> cargoNameList, double[] sizeList,
			double packageCost, double sumCost, OrderState state) {
		super();
		this.code = code;
		this.doName = doName;
		this.account=account;
		this.date=date;
		SenderName = senderName;
		SenderAddress = senderAddress;
		SenderOrg = senderOrg;
		SPhoneNumber = sPhoneNumber;
		SMobileNumber = sMobileNumber;
		ReceiverName = receiverName;
		ReceiverAddress = receiverAddress;
		ReceiverOrg = receiverOrg;
		RPhoneNumber = rPhoneNumber;
		RMobileNumber = rMobileNumber;
		this.number = number;
		this.weight = weight;
		this.shape = shape;
		this.cargoNameList = cargoNameList;
		this.sizeList = sizeList;
		//this.packageCost = packageCost;
		this.sumCost = sumCost;
		this.state = state;
	}
	
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
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
	public String getSenderName() {
		return SenderName;
	}
	public void setSenderName(String senderName) {
		SenderName = senderName;
	}
	public String getSenderAddress() {
		return SenderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		SenderAddress = senderAddress;
	}
	public String getSenderOrg() {
		return SenderOrg;
	}
	public void setSenderOrg(String senderOrg) {
		SenderOrg = senderOrg;
	}
	public String getSPhoneNumber() {
		return SPhoneNumber;
	}
	public void setSPhoneNumber(String sPhoneNumber) {
		SPhoneNumber = sPhoneNumber;
	}
	public String getSMobileNumber() {
		return SMobileNumber;
	}
	public void setSMobileNumber(String sMobileNumber) {
		SMobileNumber = sMobileNumber;
	}
	public String getReceiverName() {
		return ReceiverName;
	}
	public void setReceiverName(String receiverName) {
		ReceiverName = receiverName;
	}
	public String getReceiverAddress() {
		return ReceiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		ReceiverAddress = receiverAddress;
	}
	public String getReceiverOrg() {
		return ReceiverOrg;
	}
	public void setReceiverOrg(String receiverOrg) {
		ReceiverOrg = receiverOrg;
	}
	public String getRPhoneNumber() {
		return RPhoneNumber;
	}
	public void setRPhoneNumber(String rPhoneNumber) {
		RPhoneNumber = rPhoneNumber;
	}
	public String getRMobileNumber() {
		return RMobileNumber;
	}
	public void setRMobileNumber(String rMobileNumber) {
		RMobileNumber = rMobileNumber;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getShape() {
		return shape;
	}
	public void setShape(double shape) {
		this.shape = shape;
	}
	public ArrayList<String> getCargoNameList() {
		return cargoNameList;
	}
	public void setCargoNameList(ArrayList<String> cargoNameList) {
		this.cargoNameList = cargoNameList;
	}
	public double[] getSizeList() {
		return sizeList;
	}
	public void setSizeList(double[] sizeList) {
		this.sizeList = sizeList;
	}
//	public double getPackageCost() {
//		return packageCost;
//	}
//	public void setPackageCost(double packageCost) {
//		this.packageCost = packageCost;
//	}
	public double getSumCost() {
		return sumCost;
	}
	public void setSumCost(double sumCost) {
		this.sumCost = sumCost;
	}
	public OrderState getState() {
		return state;
	}
	public void setState(OrderState state) {
		this.state = state;
	}
	
	
	
	
}
