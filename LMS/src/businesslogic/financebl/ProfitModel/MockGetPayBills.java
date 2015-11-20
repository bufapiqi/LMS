package businesslogic.financebl.ProfitModel;

import java.util.ArrayList;

import po.documentsPO.PaymentPO;
import vo.documentsVO.PaymentVO;
import dataservice.financedataservice.GetAllPayDataSer;


public class MockGetPayBills{

	
	ArrayList<PaymentVO> paymentList = new ArrayList();
	public ArrayList<PaymentVO> getPay(String selling, String date) {
		// TODO �Զ����ɵķ������
		PaymentVO p1 = new  PaymentVO("0000001","���","2015/05/12", 256314.3, "�°���", "�˺�һ", "˾�������Ǻ�", "��");
		PaymentVO p2 = new  PaymentVO("0000002","���","2015/06/12", 256314.3, "����ķ", "�˺Ŷ�", "˾��������", "�ķ�ʽ");
		PaymentVO p3 = new  PaymentVO("0000003","���","2015/07/12", 256314.3, "������", "�˺���", "˾������", "�ķ�ʽ����");
		PaymentVO p4 = new  PaymentVO("0000004","���","2015/08/12", 256314.3, "˹����", "�˺���", "˾����", "�ķ�ʽ����ʦ��");
		PaymentVO p5 = new  PaymentVO("0000005","���","2015/09/12", 256314.3, "������", "�˺���", "˾��", "�ķ�ʽ����ʦ���ͻ�");
		PaymentVO p6 = new  PaymentVO("0000006","���","2015/10/12", 256314.3, "��÷��", "�˺���", "˾", "�ķ�ʽ����ʦ���ͻ��Ͽ�");
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
		// TODO �Զ����ɵķ������
		PaymentVO p1 = new  PaymentVO("0000001","���","2015/05/12", 256314.3, "�°���", "�˺�һ", "˾�������Ǻ�", "��");
		PaymentVO p2 = new  PaymentVO("0000002","���","2015/06/12", 256314.3, "����ķ", "�˺Ŷ�", "˾��������", "�ķ�ʽ");
		PaymentVO p3 = new  PaymentVO("0000003","���","2015/07/12", 256314.3, "������", "�˺���", "˾������", "�ķ�ʽ����");
		PaymentVO p4 = new  PaymentVO("0000004","���","2015/08/12", 256314.3, "˹����", "�˺���", "˾����", "�ķ�ʽ����ʦ��");
		PaymentVO p5 = new  PaymentVO("0000005","���","2015/09/12", 256314.3, "������", "�˺���", "˾��", "�ķ�ʽ����ʦ���ͻ�");
		PaymentVO p6 = new  PaymentVO("0000006","���","2015/10/12", 256314.3, "��÷��", "�˺���", "˾", "�ķ�ʽ����ʦ���ͻ��Ͽ�");
		paymentList.add(p1);
		paymentList.add(p2);
		paymentList.add(p3);
		paymentList.add(p4);
		paymentList.add(p5);
		paymentList.add(p6);
		return paymentList;
	}
	
}
