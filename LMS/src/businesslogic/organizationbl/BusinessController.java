package businesslogic.organizationbl;

import vo.orgVO.BussinessOrgVO;

public class BusinessController {
	
	BusinessBL bBL = new BusinessBL();
	
	public String[] getBussinessmanList() {
		// TODO �Զ����ɵķ������
		return bBL.getBussinessmanList(null);
	}


	public boolean addBussinessman(long ID) {
		// TODO �Զ����ɵķ������
		return bBL.addBussinessman(null, ID);
	}


	public boolean removeBussinessman(long ID) {
		// TODO �Զ����ɵķ������
		return bBL.removeBussinessman(null, ID);
	}


	public String[] getCourierList() {
		// TODO �Զ����ɵķ������
		return bBL.getCourierList(null);
	}


	public boolean addCourier(long ID) {
		// TODO �Զ����ɵķ������
		return addCourier(ID);
	}


	public boolean removeCourier(long ID) {
		// TODO �Զ����ɵķ������
		return bBL.removeCourier(null, ID);
	}
	
	public boolean addBussinessHall(BussinessOrgVO vo) {
		// TODO �Զ����ɵķ������
		return bBL.addBussinessHall(null, vo);
	}


	public boolean removeBussinessHall(String codeNumber) {
		// TODO �Զ����ɵķ������
		return bBL.removeBussinessHall(null, codeNumber);
	}


	public String getCodeNumber() {
		// TODO �Զ����ɵķ������
		return bBL.getCodeNumber();
	}


	public boolean changeCodeNumberOfMiddle(String codeNumberOfMiddle) {
		// TODO �Զ����ɵķ������
		return bBL.changeCodeNumberOfMiddle(null, codeNumberOfMiddle);
	}


	public String getInfo() {
		// TODO �Զ����ɵķ������
		return bBL.getInfo();
	}


	public boolean changeCity(String city) {
		// TODO �Զ����ɵķ������
		return bBL.changeCity(null, city);
	}


	public boolean changeCodeNumber(String codeNumber) {
		// TODO �Զ����ɵķ������
		return bBL.changeCodeNumber(null, codeNumber);
	}


}
