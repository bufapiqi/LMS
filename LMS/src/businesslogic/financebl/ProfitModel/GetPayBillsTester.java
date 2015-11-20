package businesslogic.financebl.ProfitModel;

import java.util.ArrayList;

import stub.financebl_stub.GetAllPay_Stub;
import vo.documentsVO.PaymentVO;

public class GetPayBillsTester {
	public static void main(String[] args){
		GetAllPay_Stub pay = new GetAllPay_Stub();
		ArrayList<PaymentVO> payVO = new ArrayList();
		payVO = pay.getAllPay(null);
		for(int i = 0 ; i < payVO.size();i++){
			System.out.print(payVO.get(i).getDate()+"  ");
			System.out.print(payVO.get(i).getFund()+"  ");
			System.out.print(payVO.get(i).getName()+"  ");
			System.out.print(payVO.get(i).getAccount()+"  ");
			System.out.print(payVO.get(i).getType()+"  ");
			System.out.println(payVO.get(i).getRemark()+"  ");
		}
	}
}
