package businesslogic.organizationbl;

public class FinanceController {
	
	FinanceBL fBL = new FinanceBL();
	
	public String[] getFinancersList() {
		// TODO �Զ����ɵķ������
		return fBL.getFinancersList();
	}


	public boolean addFinancer(long ID) {
		// TODO �Զ����ɵķ������
		return fBL.addFinancer(ID);
	}


	public boolean removeFinancer(long ID) {
		// TODO �Զ����ɵķ������
		return fBL.removeFinancer(ID);
	}

}
