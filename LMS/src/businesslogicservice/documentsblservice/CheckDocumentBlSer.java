package businesslogicservice.documentsblservice;

public interface CheckDocumentBlSer {
	/**
	 * ����Ӫҵ���������
	 * ϵͳ����һ��Boolean
	 * ������ʾӪҵ���Ƿ����
	 * @author XiongKaiQi
	 *
	 */
	public boolean checkHall(String codeNumber);
	/**
	 * ������ת���Ļ������
	 * ϵͳ����һ��boolean
	 * ������ʾ��ת�����Ƿ����
	 * @author XiongKaiQi
	 *
	 */
	public boolean checkCenter(String codeNumber);
	/**
	 * ���뵽������ڳ���
	 * ϵͳ����һ��boolean
	 * ������ʾ������Ƿ����
	 * @author XiongKaiQi
	 *
	 */
	public boolean checkPlace(String city);
}
