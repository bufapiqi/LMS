package rmiService.organization;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.orgPO.BussinessOrgPO;
import po.orgPO.DriverPO;
import po.orgPO.VehiclePO;
import dataservice.organizationdataservice.BussinessOrgDataSer;

public class BussinessOrgDataSerImpl extends UnicastRemoteObject implements BussinessOrgDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -2065348468020344293L;

	public BussinessOrgDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public String[] getBussinessmanList() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean addBussinessman(long ID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeBussinessman(long ID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String[] getCourierList() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean addCourier(long ID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeCourier(long ID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String[] getVehicleList() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public VehiclePO getVehicleInfo(String codeVehicle) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean addVehicle(VehiclePO po) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeVehicle(String codeVehicle) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean changeVehicle(VehiclePO po) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String[] getDriverList() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public DriverPO getDriverInfo(String codeDriver) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean addDriver(DriverPO po) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeDriver(String codeDriver) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean changeDriver(DriverPO po) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean addBussinessHall(BussinessOrgPO po) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeBussinessHall(String codeNumber) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String getCodeNumber() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean changeCodeNumberOfMiddle(String codeNumberOfMiddle) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String getInfo() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean changeCity(String city) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean changeCodeNumber(String codeNumber) {
		// TODO �Զ����ɵķ������
		return false;
	}

}
