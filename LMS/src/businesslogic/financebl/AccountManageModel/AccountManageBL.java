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
	
    //账户信息
	public void CheckManage(){
		
		accountInf = check.getAccount();
		
	}
	
	//需增加账户
	public void AddManage(String name,double money){
		
	}
	//需删除用户
	public void DeleteManage(int index){
		
	}
	//需初始化账户
	public void IntalizaManage(String name,double money,int index){
		
	}
	
}
