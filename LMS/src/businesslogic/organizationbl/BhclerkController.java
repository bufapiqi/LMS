package businesslogic.organizationbl;

import vo.orgVO.DriverVO;
import vo.orgVO.VehicleVO;

public class BhclerkController {
	
	BusinessBL bBL = new BusinessBL();
	
	public String[] getVehicleList() {
		// TODO �Զ����ɵķ������
		return bBL.getVehicleList(null);
	}


	public VehicleVO getVehicleInfo(String codeVehicle) {
		// TODO �Զ����ɵķ������
		return bBL.getVehicleInfo(null, codeVehicle);
	}


	public boolean addVehicle(VehicleVO vo) {
		// TODO �Զ����ɵķ������
		return bBL.addVehicle(null, vo);
	}


	public boolean removeVehicle(String codeVehicle) {
		// TODO �Զ����ɵķ������
		return bBL.removeVehicle(null, codeVehicle);
	}


	public boolean changeVehicle(VehicleVO vo) {
		// TODO �Զ����ɵķ������
		return bBL.changeVehicle(null, vo);
	}


	public String[] getDriverList() {
		// TODO �Զ����ɵķ������
		return bBL.getDriverList(null);
	}


	public DriverVO getDriverInfo(String codeDriver) {
		// TODO �Զ����ɵķ������
		return bBL.getDriverInfo(null, codeDriver);
	}


	public boolean addDriver(DriverVO vo) {
		// TODO �Զ����ɵķ������
		return bBL.addDriver(null, vo);
	}


	public boolean removeDriver(String codeDriver) {
		// TODO �Զ����ɵķ������
		return bBL.removeDriver(null, codeDriver);
	}


	public boolean changeDriver(DriverVO vo) {
		// TODO �Զ����ɵķ������
		return bBL.changeDriver(null, vo);
	}

}
