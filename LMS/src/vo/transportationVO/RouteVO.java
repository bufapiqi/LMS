package vo.transportationVO;
/**
 * ������ʾ���볣���޸�ʱ��·��
 * ������·�;���
 * @author YangHua'an
 *
 */
public class RouteVO {
	
	private String line;//����������·����ʽ��������-�յ����
	private double distance;//�����������
	public RouteVO(String line, double distance) {
		super();
		this.line = line;
		this.distance = distance;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	

	
	
	
}
