package businesslogic.organizationbl;

import vo.orgVO.BussinessOrgVO;

public class BusinessController {
	
	BusinessBL bBL = new BusinessBL();
	
	public String[] getBussinessmanList() {
		// TODO �Զ����ɵķ������
		return bBL.getBussinessmanList();
	}


	public boolean addBussinessman(long ID) {
		// TODO �Զ����ɵķ������
		return bBL.addBussinessman(ID);
	}


	public boolean removeBussinessman(long ID) {
		// TODO �Զ����ɵķ������
		return bBL.removeBussinessman(ID);
	}


	public String[] getCourierList() {
		// TODO �Զ����ɵķ������
		return bBL.getCourierList();
	}


	public boolean addCourier(long ID) {
		// TODO �Զ����ɵķ������
		return addCourier(ID);
	}


	public boolean removeCourier(long ID) {
		// TODO �Զ����ɵķ������
		return bBL.removeCourier(ID);
	}
	
	public boolean addBussinessHall(BussinessOrgVO vo) {
		// TODO �Զ����ɵķ������
		return bBL.addBussinessHall(vo);
	}


	public boolean removeBussinessHall(String codeNumber) {
		// TODO �Զ����ɵķ������
		return bBL.removeBussinessHall(codeNumber);
	}


	public String getCodeNumber() {
		// TODO �Զ����ɵķ������
		return bBL.getCodeNumber();
	}


	public boolean changeCodeNumberOfMiddle(String codeNumberOfMiddle) {
		// TODO �Զ����ɵķ������
		return bBL.changeCodeNumberOfMiddle(codeNumberOfMiddle);
	}


	public String getInfo() {
		// TODO �Զ����ɵķ������
		return bBL.getInfo();
	}


	public boolean changeCity(String city) {
		// TODO �Զ����ɵķ������
		return bBL.changeCity(city);
	}


	public boolean changeCodeNumber(String codeNumber) {
		// TODO �Զ����ɵķ������
		return bBL.changeCodeNumber(codeNumber);
	}


}