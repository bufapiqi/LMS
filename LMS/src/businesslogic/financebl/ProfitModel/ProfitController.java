package businesslogic.financebl.ProfitModel;

import vo.financeVO.ProfitVO;

public class ProfitController {
	
	private CostStatisticsBL cost;
	
	//����ProfitVO�߼���
	private ProfitBL profit;
	
	
	public ProfitController(CostStatisticsBL cost, ProfitBL profit) {
		super();
		this.cost = cost;
		this.profit = profit;
	}

	//��̫��Ҫ
//	public double earn(String [] selling){
//		return 0;
//	}
	
	//��̫��Ҫ
//	public double pay(String [] selling){
//		return 0;
//	}
	
	public ProfitVO returnPro(String[] selling){
//		double earn = cost.allEarn(null);
//		double pay = cost.allPay(null);
//		ProfitVO pro = new ProfitVO(earn,pay,null);
		//ʱ����߼���ûд������������������1
		return null;
	}
}
