package businesslogic.transportationbl;

public class CostAndRouteController {
	
	TransportationBL tBL = new TransportationBL();
	
	public double getCost(int type) {
		// TODO �Զ����ɵķ������
		return tBL.getCost(type);
	}
	
	public double getDistance(String line) {
		// TODO �Զ����ɵķ������
		return tBL.getDistance(line);
	}
}
