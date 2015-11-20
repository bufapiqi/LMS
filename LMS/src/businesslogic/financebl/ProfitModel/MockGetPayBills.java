package businesslogic.financebl.ProfitModel;

import java.util.ArrayList;

import po.documentsPO.PaymentPO;
import vo.documentsVO.PaymentVO;
import dataservice.financedataservice.GetAllPayDataSer;


public class MockGetPayBills{

	
	ArrayList<PaymentVO> paymentList = new ArrayList();
	public ArrayList<PaymentVO> getPay(String selling, String date) {
		// TODO 自动生成的方法存根
		PaymentVO p1 = new  PaymentVO("0000001","付款单","2015/05/12", 256314.3, "奥巴马", "账号一", "司机地撒呵呵", "的");
		PaymentVO p2 = new  PaymentVO("0000002","付款单","2015/06/12", 256314.3, "萨达姆", "账号二", "司机地撒呵", "的方式");
		PaymentVO p3 = new  PaymentVO("0000003","付款单","2015/07/12", 256314.3, "卡扎菲", "账号三", "司机地撒", "的方式对了");
		PaymentVO p4 = new  PaymentVO("0000004","付款单","2015/08/12", 256314.3, "斯大林", "账号四", "司机地", "的方式对了师傅");
		PaymentVO p5 = new  PaymentVO("0000005","付款单","2015/09/12", 256314.3, "江泽民", "账号五", "司机", "的方式对了师傅客户");
		PaymentVO p6 = new  PaymentVO("0000006","付款单","2015/10/12", 256314.3, "卡梅伦", "账号六", "司", "的方式对了师傅客户老客");
		paymentList.add(p1);
		paymentList.add(p2);
		paymentList.add(p3);
		paymentList.add(p4);
		paymentList.add(p5);
		paymentList.add(p6);
		return paymentList;
	}

	public ArrayList<PaymentVO> getAllPay(String selling, String start,
			String end) {
		// TODO 自动生成的方法存根
		PaymentVO p1 = new  PaymentVO("0000001","付款单","2015/05/12", 256314.3, "奥巴马", "账号一", "司机地撒呵呵", "的");
		PaymentVO p2 = new  PaymentVO("0000002","付款单","2015/06/12", 256314.3, "萨达姆", "账号二", "司机地撒呵", "的方式");
		PaymentVO p3 = new  PaymentVO("0000003","付款单","2015/07/12", 256314.3, "卡扎菲", "账号三", "司机地撒", "的方式对了");
		PaymentVO p4 = new  PaymentVO("0000004","付款单","2015/08/12", 256314.3, "斯大林", "账号四", "司机地", "的方式对了师傅");
		PaymentVO p5 = new  PaymentVO("0000005","付款单","2015/09/12", 256314.3, "江泽民", "账号五", "司机", "的方式对了师傅客户");
		PaymentVO p6 = new  PaymentVO("0000006","付款单","2015/10/12", 256314.3, "卡梅伦", "账号六", "司", "的方式对了师傅客户老客");
		paymentList.add(p1);
		paymentList.add(p2);
		paymentList.add(p3);
		paymentList.add(p4);
		paymentList.add(p5);
		paymentList.add(p6);
		return paymentList;
	}
	
}
