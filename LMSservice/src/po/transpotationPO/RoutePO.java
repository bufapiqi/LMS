package po.transpotationPO;
/**
 * ������ʾ·�߳־û�����
 * 
 * @author YangHua'an
 *
 */
import java.io.Serializable;

public class RoutePO implements Serializable {

	/**
	 * 
	 * ���кŰ汾��
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String line;//����������·����ʽ��������-�յ����
	private double distance;//�����������
	
	public RoutePO(String line, double distance) {
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
