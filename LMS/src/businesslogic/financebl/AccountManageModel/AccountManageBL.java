package businesslogic.financebl.AccountManageModel;

import java.util.ArrayList;

import stub.financebl_stub.GetAccount_Stub;
import vo.financeVO.AccountVO;

public class AccountManageBL {
	
	
	GetAccount_Stub check;
	ArrayList<AccountVO> accountInf;
	
	public AccountManageBL(){
		super();
		check = new GetAccount_Stub();
	}
	
    //�˻���Ϣ
	public void CheckManage(){
		
		accountInf = check.getAccount();
		
	}
	
	//�������˻�
	public void AddManage(String name,double money){
		
	}
	//��ɾ���û�
	public void DeleteManage(int index){
		
	}
	//���ʼ���˻�
	public void IntalizaManage(String name,double money,int index){
		
	}
	
}
