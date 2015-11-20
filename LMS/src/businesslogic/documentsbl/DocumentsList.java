package businesslogic.documentsbl;
import businesslogic.documentsbl.DocumentsLineItem;
public class DocumentsList {
	String departure=null;
	String arrival=null;
	String trans=null;
	double weight=0;
	public DocumentsList(String departure, String arrival, String trans,double weight) {
		super();
		this.departure = departure;
		this.arrival = arrival;
		this.trans = trans;
		this.weight=weight;
	}
	public double getCost(){
		String line=departure+arrival;
		int type=0;
		double cost=0;
		if(trans.equals("�ؿ�ר��"))
			type=3;
		else if(trans.equals("��ͨ���"))
			type=2;
		else
			type=1;
		DocumentsLineItem item=new DocumentsLineItem(line,type,weight);
		cost=item.getTotal();
		return cost;
	}
}
