package businesslogic.transportationbl;

public class CityController {
	TransportationBL tBL = new TransportationBL();
	public boolean addCity(String city) {
		// TODO �Զ����ɵķ������
		return tBL.addCity(city);
	}

	
	public boolean removeCity(String city) {
		// TODO �Զ����ɵķ������
		return tBL.removeCity(city);
	}

}
