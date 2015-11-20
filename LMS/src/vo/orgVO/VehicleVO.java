package vo.orgVO;
/**
 * ������ʾ������Ϣ
 * @author YangHua'an
 *
 */

public class VehicleVO {

	private String codeVehicle;//�������ţ����б��+Ӫҵ�����+���
	private String codeCity;//���б�ţ�3λ���֣��Ͼ�025����000
	private String codeBussinessHall;//Ӫҵ����ţ�3λ������000
	private String codeID;//��ţ�3λ������000
	
	private String plateNumber;//���ƺţ�����A00000
	
	private String date;//����ʱ�䣬��2015-05-09

	public VehicleVO(String codeCity, String codeBussinessHall, String codeID, String plateNumber,String date) {
		super();
		this.codeVehicle = codeCity+codeBussinessHall+codeID;
		this.codeCity = codeCity;
		this.codeBussinessHall = codeBussinessHall;
		this.codeID = codeID;
		this.plateNumber = plateNumber;
		this.date = date;
	}

	public String getCodeVehicle() {
		return codeVehicle;
	}

	public void setCodeVehicle(String codeCity, String codeBussinessHall, String codeID) {
		this.codeVehicle = codeCity+codeBussinessHall+codeID;
	}

	public String getCodeCity() {
		return codeCity;
	}

	public void setCodeCity(String codeCity) {
		this.codeCity = codeCity;
	}

	public String getCodeBussinessHall() {
		return codeBussinessHall;
	}

	public void setCodeBussinessHall(String codeBussinessHall) {
		this.codeBussinessHall = codeBussinessHall;
	}

	public String getCodeID() {
		return codeID;
	}

	public void setCodeID(String codeID) {
		this.codeID = codeID;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
}
