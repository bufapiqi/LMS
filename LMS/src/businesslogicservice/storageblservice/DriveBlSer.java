package businesslogicservice.storageblservice;

import businesslogic.state.ResultMessage;


public interface DriveBlSer {
	
	
	/**
	 * ϵͳ���������ȥ��������Ӧ�ռ䣬�ж��Ƿ񳬽磬
	 * �������򷵻�ʧ����Ϣ��
	 * ��δ���磬����¿����Ϣ�����سɹ���Ϣ
	 * @author YangGuan
	 *
	 */
	public ResultMessage drive(int shipping,int trains,int motor);
}
