package com.trsd.consts;

/**
 * 用户常量
 * @author ThinkPad
 *
 */
public class UserConsts {
	
	/**
	 * 用户状态标记常量
	 */
	public static final int USER_FLAG_FORBID_ALL = -1 ;//禁止所有操作
	public static final int USER_FLAG_FORBID_LOAN = 1 ;//禁止借款
	public static final int USER_FLAG_FORBID_LEND = 2 ;//禁止投资
	public static final int USER_FLAG_FORBID_WITHDRAW = 3 ;//禁止提现
	public static final int USER_FLAG_FORBID_LOGIN = 4 ;//禁止登陆
}
