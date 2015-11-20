package businesslogic.financebl.settlementModel;

import java.util.ArrayList;

import po.documentsPO.ReceiptPO;
import stub.financebl_stub.GetReceivablesBills_Stub;
import vo.documentsVO.ReceiptVO;
import businesslogicservice.modelservice.financeInfo.GetReceiptSer;

public class MockGetReceiptSer {

	GetReceivablesBills_Stub getReceipt;
	 public MockGetReceiptSer(){
		 super();
	 }
	
	public ArrayList<ReceiptVO> getReceipts(String selling, String date) {
		// TODO �Զ����ɵķ������
		 getReceipt = new GetReceivablesBills_Stub();
		return getReceipt.getReceivables(null, null);
	}

	public ArrayList<ReceiptVO> getAllReceipts(String selling) {
		// TODO �Զ����ɵķ������
		 getReceipt = new GetReceivablesBills_Stub();
		return getReceipt.getAllReceivables(null);
	}

	public ArrayList<ReceiptVO> getAllReceipts(String start, String end) {
		// TODO �Զ����ɵķ������
		 getReceipt = new GetReceivablesBills_Stub();
		return getReceipt.getSomeReceivables(null, null, null);
	}

}
