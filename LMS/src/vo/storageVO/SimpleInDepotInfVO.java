package vo.storageVO;



/**
 * ������ʾ����ݱ�š������Ϣ�ʹ洢λ��
 * ���ڿ���ѯ
 * @author YangGuan
 *
 */
public class SimpleInDepotInfVO {
	
	
	private String InDepotNum; //����ݱ��
	private double Sums; //�����Ϣ
	private String AreaNum; //����
	private String RowNum; //�ź�
	private String ShelvesNum;  //�ܺ�
	private String SositionNum; //λ��
	public SimpleInDepotInfVO(String inDepotNum, double sums, String areaNum,
			String rowNum, String shelvesNum, String sositionNum) {
		super();
		InDepotNum = inDepotNum;
		Sums = sums;
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
	public double getSums() {
		return Sums;
	}
	public void setSums(double sums) {
		Sums = sums;
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
