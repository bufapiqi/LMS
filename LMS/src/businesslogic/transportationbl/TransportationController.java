package businesslogic.transportationbl;

import vo.transportationVO.RouteVO;

public class TransportationController {
	TransportationBL tBL = new TransportationBL();
	public boolean changeDistance(RouteVO route) {
		// TODO �Զ����ɵķ������
		return tBL.changeDistance(route);
	}


	public boolean changeCost(int type, int cost) {
		// TODO �Զ����ɵķ������
		return tBL.changeCost(type, cost);
	}


	public double getCost(int type) {
		// TODO �Զ����ɵķ������
		return tBL.getCost(type);
	}


	public boolean addRoute(RouteVO route) {
		// TODO �Զ����ɵķ������
		return tBL.addRoute(route);
	}


	public double getDistance(String line) {
		// TODO �Զ����ɵķ������
		return tBL.getDistance(line);
	}


	public String[] getCityList(String city) {
		// TODO �Զ����ɵķ������
		return tBL.getCityList(city);
	}


}
