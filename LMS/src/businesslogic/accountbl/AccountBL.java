package businesslogic.accountbl;

import businesslogicservice.accountblservice.AccountBLSer;
import vo.accountVO.AccountNumberVO;

public class AccountBL implements AccountBLSer {

	@Override
	public String login(long ID, String password) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean addAccount(long ID, AccountNumberVO vo) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean changeInfo(long ID, AccountNumberVO vo) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean deleteAccount(long ID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String[] getAccount(long ID) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public String[] getAccountList(String name) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public AccountNumberVO getInfo(long ID) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public String[] getAccountList() {
		// TODO �Զ����ɵķ������
		return null;
	}

}
