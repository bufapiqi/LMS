package businesslogic.financebl.settlementModel;

import java.util.ArrayList;

import vo.documentsVO.ReceiptVO;

public class GetReceiptController {
	
	private SettlementBL settle;
	
	
	
	public GetReceiptController() {
		super();
		// TODO �Զ����ɵĹ��캯�����
		settle = new SettlementBL();
	}

	
	public ArrayList<ReceiptVO> getReceipt(String selling, String date){
		ArrayList<ReceiptVO>  vo = new ArrayList();
		return null;
	}
	
	public ArrayList<ReceiptVO> getAllReceipt(String selling) {
		
		return null;
	}
	
	public ArrayList<ReceiptVO> getSomeReceipt(String selling,
			String start, String end) {
		return null;
	}

	public void Controller(){
		
		
	}
}
