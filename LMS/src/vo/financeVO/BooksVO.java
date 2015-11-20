package vo.financeVO;

import java.util.ArrayList;

import po.orgPO.BussinessOrgPO;
import po.orgPO.VehiclePO;
import po.accountPO.*;
import po.documentsPO.InBillsPO;
import po.financePO.AccountPO;

/**
 * ������ʾ�˱���Ϣ
 * @author YangGuan
 *
 */
public class BooksVO {
	
	private ArrayList<BussinessOrgPO>  ArrOrg; // ����
	private ArrayList<AccountInfoPO>  person; //��Ա
	private ArrayList<VehiclePO>  Vehicle; // ����
	private ArrayList<AccountPO> Account; //�˻�
	private ArrayList<InBillsPO> InBills; // ��ⵥ����֪���ǲ��ǿ�棩
	
	
	public BooksVO(ArrayList<BussinessOrgPO> arrOrg, ArrayList<AccountInfoPO> person,
			ArrayList<VehiclePO> vehicle, ArrayList<AccountPO> account,
			ArrayList<InBillsPO> inBills) {
		super();
		ArrOrg = arrOrg;
		this.person = person;
		Vehicle = vehicle;
		Account = account;
		InBills = inBills;
	}


	public ArrayList<BussinessOrgPO> getArrOrg() {
		return ArrOrg;
	}


	public void setArrOrg(ArrayList<BussinessOrgPO> arrOrg) {
		ArrOrg = arrOrg;
	}


	public ArrayList<AccountInfoPO> getPerson() {
		return person;
	}


	public void setPerson(ArrayList<AccountInfoPO> person) {
		this.person = person;
	}


	public ArrayList<VehiclePO> getVehicle() {
		return Vehicle;
	}


	public void setVehicle(ArrayList<VehiclePO> vehicle) {
		Vehicle = vehicle;
	}


	public ArrayList<AccountPO> getAccount() {
		return Account;
	}


	public void setAccount(ArrayList<AccountPO> account) {
		Account = account;
	}


	public ArrayList<InBillsPO> getInBills() {
		return InBills;
	}


	public void setInBills(ArrayList<InBillsPO> inBills) {
		InBills = inBills;
	}
	
	
	
	
}
