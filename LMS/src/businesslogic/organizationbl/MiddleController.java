package businesslogic.organizationbl;

import vo.orgVO.MiddleOrgVO;

public class MiddleController {
	
	MiddleBL mBL = new MiddleBL();
	
	

	public String[] getBussinessmanList() {
		// TODO �Զ����ɵķ������
		return mBL.getBussinessHallList(null);
	}


	public boolean addBussinessman(long ID) {
		// TODO �Զ����ɵķ������
		return mBL.addBussinessman(null, ID);
	}

	
	public boolean removeBussinessman(long ID) {
		// TODO �Զ����ɵķ������
		return mBL.removeBussinessman(null, ID);
	}

	
	public String[] getStorgerList() {
		// TODO �Զ����ɵķ������
		return mBL.getStorgerList(null);
	}

	
	public boolean addStorger(long ID) {
		// TODO �Զ����ɵķ������
		return mBL.addStorger(null, ID);
	}


	public boolean removeStorger(long ID) {
		// TODO �Զ����ɵķ������
		return mBL.removeStorger(null, ID);
	}

	
	public String[] getBussinessHallList() {
		// TODO �Զ����ɵķ������
		return mBL.getBussinessHallList(null);
	}


	public String GetInfo() {
		// TODO �Զ����ɵķ������
		return mBL.GetInfo();
	}


	public boolean changeCity(String city) {
		// TODO �Զ����ɵķ������
		return mBL.changeCity(null, city);
	}


	public boolean addMiddleOrg(MiddleOrgVO vo) {
		// TODO �Զ����ɵķ������
		return mBL.addMiddleOrg(null, vo);
	}


	public boolean removeMiddleOrg(String codeNumber) {
		// TODO �Զ����ɵķ������
		return mBL.removeMiddleOrg(codeNumber);
	}


}
