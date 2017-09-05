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
	public static final int USER_FLAG_FORBID_LOAN = -2 ;//禁止借款
	public static final int USER_FLAG_FORBID_LEND = -3 ;//禁止投资
	public static final int USER_FLAG_FORBID_WITHDRAW = -4 ;//禁止提现
	public static final int USER_FLAG_FORBID_LOGIN = -5 ;//禁止登陆
	
	/**
	 * redis存储数据分类
	 */
	public static final String REDIS_USER_KEY = "token:user:key" ; //用户登录信息，key为token，值为信息
	public static final String REDIS_USER_TOKEN = "token:user:phone" ; //用户登录令牌，key 为 登录名，值为 token
	public static final String REDIS_DYNAMIC_LOGIN_KEY = "dyn:code:login" ; //动态登录验证码
	public static final String REDIS_DYNAMIC_PAY_PWD_KEY = "dyn:code:pay:pwd" ; //修改支付密码所用手机动态验证码
	public static final String REDIS_DYNAMIC_REGISTER_KEY = "dyn:code:register" ; //动态注册验证码
	public static final String REDIS_DYNAMIC_PHONE_CHANGE_KEY = "dyn:code:phone:change" ; //动态注册验证码
	public static final String REDIS_DYNAMIC_SHORT_LOAN_CODE_KEY = "dyn:code:short:loan" ; //长贷投资验证码
	public static final String REDIS_DYNAMIC_LONG_LOAN_CODE_KEY = "dyn:code:long:loan" ; //短贷投资验证码
	public static final String REDIS_LOAN_USE_KEY = "loan:use:list";//借款用途列表
	public static final String REDIS_LOAN_HOME_LIST = "loan:home:list";//借款列表，首页使用，存放ID
	public static final String REDIS_LOAN_HOME_INFO = "loan:home:info";//借款列表，首页使用，存放信息
	
	/**
	 * 用户类型
	 */
	public static final int USER_TYPE_PERSONAL = 1 ; //个人用户
	public static final int USER_TYPE_MASTER = 2 ; //企业用户
	
}
