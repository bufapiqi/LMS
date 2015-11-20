package businesslogic.financebl.settlementModel;

import java.util.ArrayList;

import vo.documentsVO.ReceiptVO;

public class GetReceiptControllerTester {
	
	static MockGetReceiptSer ss = new MockGetReceiptSer();
	public  static void main(String[] args){
		ArrayList<ReceiptVO> receip = new ArrayList();
		ArrayList<String> code = new ArrayList();
		receip = ss.getAllReceipts(null);
		for(int i = 0 ; i < receip.size();i++){
			System.out.print(receip.get(i).getDate()+"  ");
			System.out.print(receip.get(i).getFund()+"  ");
			System.out.print(receip.get(i).getName()+"    ");
			code = receip.get(i).getTCode();
			for(int j = 0 ; j < code.size();j++){
				if(j==code.size()-1){
					System.out.println(code.get(j));
				}else{
					System.out.print(code.get(j)+"  ");
				}
			}

		}
	}
}
