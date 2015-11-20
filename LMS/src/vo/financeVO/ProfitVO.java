package vo.financeVO;


/**
 * ������ʾ�ɱ������¼(�����롢��֧������������)
 * @author YangGuan
 *
 */
public class ProfitVO {
	
	private double TotalRevenue; // ������
	private double TotalPay;  // ��֧��
	private String GenerationDate;  //��������
	
	
	public ProfitVO(double totalRevenue, double totalPay, String generationDate) {
		super();
		TotalRevenue = totalRevenue;
		TotalPay = totalPay;
		GenerationDate = generationDate;
	}
	public double getTotalRevenue() {
		return TotalRevenue;
	}
	public void setTotalRevenue(double totalRevenue) {
		TotalRevenue = totalRevenue;
	}
	public double getTotalPay() {
		return TotalPay;
	}
	public void setTotalPay(double totalPay) {
		TotalPay = totalPay;
	}
	public String getGenerationDate() {
		return GenerationDate;
	}
	public void setGenerationDate(String generationDate) {
		GenerationDate = generationDate;
	}
	
	
	
}
