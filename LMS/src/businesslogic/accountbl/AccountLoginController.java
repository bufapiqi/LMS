package businesslogic.accountbl;

public class AccountLoginController {
	AccountBL aBL=new AccountBL();
	public String login(long ID, String password) {
		// TODO �Զ����ɵķ������
		return aBL.login(ID, password);
	}
	public String[] getAccount(long ID) {
		// TODO �Զ����ɵķ������
		return aBL.getAccount(ID);
	}

}
