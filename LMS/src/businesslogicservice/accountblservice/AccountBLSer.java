package businesslogicservice.accountblservice;

import vo.accountVO.AccountNumberVO;


public interface AccountBLSer {
	

	/**
	 * 提供登录验证信息-所在城市-所属机构名称
	 * @param ID 账号
	 * @param passwrd 密码
	 * @return String 账号目前的状态信息
	 * 0代表空闲
	 * 1代表快递员
	 * 2代表营业厅业务员
	 * 3代表中转中心业务员
	 * 4代表中转中心仓库管理员
	 * 5代表财务人员
	 * 6代表总经理
	 * 7代表系统管理员
	 */
	public String login(long ID,String password);
	
	/**
	 * 增加一个账号
	 * @param ID 账号
	 * @param vo 账号详细信息
	 * @return boolean 操作是否成功的信息
	 * 
	 */
	public boolean addAccount(long ID,AccountNumberVO vo);
	
	/**
	 * 修改账号信息
	 * @param ID 账号
	 * @param vo 账号详细信息
	 * @return  返回操作是否成功的信息
	 * 
	 */
	public boolean changeInfo(long ID,AccountNumberVO vo);
	
	/**
	 * 删除一个账号信息
	 * @param ID 账号
	 * @return 操作是否成功的信息
	 * 
	 */
	public boolean deleteAccount(long ID);
	
	/**
	 * 获得与输入ID相同的账号的ID+name
	 * @param ID 账号
	 * @return String ID+name
	 */
	public String[] getAccount(long ID);
	/**
	 * 获得与输入相同姓名的编号+姓名列表
	 * @param name 账号姓名
	 * @return String[],ID+name
	 * 
	 */
	public String[] getAccountList(String name);
	
	/**
	 * 获得账号详细详细
	 * @param ID 账号
	 * @return 账号详细信息
	 */
	public AccountNumberVO getInfo(long ID);
	
	/**
	 * 获得现在空闲的账号员工账号和姓名列表
	 * @return ID+name列表
	 * 
	 */
	public String[] getAccountList();
}
