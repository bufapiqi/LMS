package businesslogic.transportationbl;

import businesslogicservice.transportationblservice.TransportationBLSer;
import vo.transportationVO.RouteVO;

public class TransportationBL implements TransportationBLSer {

	@Override
	public boolean changeDistance(RouteVO route) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean changeCost(int type, double cost) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public double getCost(int type) {
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public boolean addRoute(RouteVO route) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public double getDistance(String line) {
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public String[] getCityList(String city) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean addCity(String city) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeCity(String city) {
		// TODO �Զ����ɵķ������
		return false;
	}

}
