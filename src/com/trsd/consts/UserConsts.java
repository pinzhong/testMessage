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
	public static final String REDIS_USER_TOKEN = "toke:user:phone" ; //用户登录令牌，key 为 登录名，值为 token
	public static final String REDIS_DYNAMIC_LOGIN_KEY = "dyn:code:login" ; //动态登录验证码
	public static final String REDIS_DYNAMIC_PAY_PWD_KEY = "dyn:code:pay:pwd" ; //修改支付密码所用手机动态验证码
	public static final String REDIS_DYNAMIC_REGISTER_KEY = "dyn:code:register" ; //动态注册验证码
	
}
