package businesslogic.financebl.ProfitModel;

import businesslogicservice.financeblservice.EarnOrPayBlSer;

public class CostStatisticsBL implements EarnOrPayBlSer{
	//�õ�������
	public double CalculateGet(String selling){
		return 0;
		
	}
	//�õ���֧��
	public double CalculatePay(String selling){
		return 0;
	}
	//�õ��ɱ�����
	public double CalculateCost(){
		return 0;
		
	}
	//����CalculateGet
	@Override
	public double allEarn(String[] selling) {
		// TODO �Զ����ɵķ������
		return 0;
	}
	//����CalculatePay
	@Override
	public double allPay(String[] selling) {
		// TODO �Զ����ɵķ������
		return 0;
	}
}
