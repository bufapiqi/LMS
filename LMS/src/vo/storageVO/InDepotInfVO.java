package vo.storageVO;



/**
 * ������ʾ����ݱ�š�������ڡ�Ŀ�ĵغʹ洢λ��
 * ���ڿ���̵�
 * @author YangGuan
 *
 */
public class InDepotInfVO {
	
	
	private String InDepotNum; //����ݱ��
	private String InDepotDate; //�������
	private String Destination; // Ŀ�ĵ�
	private String AreaNum; //����
	private String RowNum; //�ź�
	private String ShelvesNum;  //�ܺ�
	private String SositionNum; //λ��
	
	
	public InDepotInfVO(String inDepotNum, String inDepotDate,
			String destination, String areaNum, String rowNum,
			String shelvesNum, String sositionNum) {
		super();
		InDepotNum = inDepotNum;
		InDepotDate = inDepotDate;
		Destination = destination;
		AreaNum = areaNum;
		RowNum = rowNum;
		ShelvesNum = shelvesNum;
		SositionNum = sositionNum;
	}


	public String getInDepotNum() {
		return InDepotNum;
	}


	public void setInDepotNum(String inDepotNum) {
		InDepotNum = inDepotNum;
	}


	public String getInDepotDate() {
		return InDepotDate;
	}


	public void setInDepotDate(String inDepotDate) {
		InDepotDate = inDepotDate;
	}


	public String getDestination() {
		return Destination;
	}


	public void setDestination(String destination) {
		Destination = destination;
	}


	public String getAreaNum() {
		return AreaNum;
	}


	public void setAreaNum(String areaNum) {
		AreaNum = areaNum;
	}


	public String getRowNum() {
		return RowNum;
	}


	public void setRowNum(String rowNum) {
		RowNum = rowNum;
	}


	public String getShelvesNum() {
		return ShelvesNum;
	}


	public void setShelvesNum(String shelvesNum) {
		ShelvesNum = shelvesNum;
	}


	public String getSositionNum() {
		return SositionNum;
	}


	public void setSositionNum(String sositionNum) {
		SositionNum = sositionNum;
	}
	
	
	
}
