package businesslogic.accountbl;

import vo.accountVO.AccountNumberVO;

public class AccountInfoController {
	AccountBL aBL=new AccountBL();

	public boolean addAccount(long ID, AccountNumberVO vo) {
		// TODO �Զ����ɵķ������
		return aBL.addAccount(ID, vo);
	}


	public boolean changeInfo(long ID, AccountNumberVO vo) {
		// TODO �Զ����ɵķ������
		return aBL.changeInfo(ID, vo);
	}


	public boolean deleteAccount(long ID) {
		// TODO �Զ����ɵķ������
		return deleteAccount(ID);
	}


	public String[] getAccount(long ID) {
		// TODO �Զ����ɵķ������
		return aBL.getAccount(ID);
	}


	public String[] getAccountList(String name) {
		// TODO �Զ����ɵķ������
		return aBL.getAccountList(name);	}


	public AccountNumberVO getInfo(long ID) {
		// TODO �Զ����ɵķ������
		return aBL.getInfo(ID);
	}


	public String[] getAccountList() {
		// TODO �Զ����ɵķ������
		return getAccountList();
	}


}
