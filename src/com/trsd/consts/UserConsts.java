package com.trsd.consts;

/**
 * 用户常量
 * 
 * @author ThinkPad
 *
 */
public class UserConsts {

	/**
	 * 用户状态标记常量
	 */
	public static final int USER_FLAG_FORBID_ALL = -1;// 禁止所有操作
	public static final int USER_FLAG_FORBID_LOAN = -2;// 禁止借款
	public static final int USER_FLAG_FORBID_LEND = -3;// 禁止投资
	public static final int USER_FLAG_FORBID_WITHDRAW = -4;// 禁止提现
	public static final int USER_FLAG_FORBID_LOGIN = -5;// 禁止登陆
	
	public static final int USER_FLAG_STATUS_AVAILABLE = 1;//已被标记
	public static final int USER_FLAG_STATUS_CANCEL = -1;//取消标记
	
	/**
	 * redis存储数据分类
	 */
	public static final String REDIS_USER_KEY = "token:user:key"; // 用户登录信息，key为token，值为信息
	public static final String REDIS_USER_TOKEN = "token:user:phone"; // 用户登录令牌，key
																		// 为
																		// 登录名，值为
																		// token
	public static final String REDIS_DYNAMIC_LOGIN_KEY = "dyn:code:login"; // 动态登录验证码
	public static final String REDIS_DYNAMIC_PAY_PWD_KEY = "dyn:code:pay:pwd"; // 修改支付密码所用手机动态验证码
	public static final String REDIS_DYNAMIC_REGISTER_KEY = "dyn:code:register"; // 动态注册验证码
	public static final String REDIS_DYNAMIC_PHONE_CHANGE_KEY = "dyn:code:phone:change"; // 动态注册验证码
	public static final String REDIS_DYNAMIC_LOAN_CODE_KEY = "dyn:code:loan"; // 借款
	public static final String REDIS_LOAN_HOME_LIST = "loan:h:a";// 所有借款列表，首页使用，存放ID
	public static final String REDIS_LOAN_SHORT_HOME_LIST = "loan:h:s";// 短贷借款列表，首页使用，存放ID
	public static final String REDIS_LOAN_LONG_HOME_LIST = "loan:h:l";// 长贷借款列表，首页使用，存放ID
	public static final String REDIS_LOAN_HOME_INFO = "loan:h:i";// 借款列表，首页使用，存放信息
	public static final String REDIS_CONSTS_USE_KEY = "consts:loanUse";// 借款用途列表
	public static final String REDIS_CONSTS_AUTO_LEND_TYPE = "consts:autoLend"; // 自动投资配置参数 
	public static final String REDIS_CONSTS_DIAN_SHANG_TYPE = "consts:dianShang"; // 电商
	public static final String REDIS_CONSTS_LEND_RISK_TYPE = "consts:lendRisk"; // 投资风险

	/**
	 * 用户类型
	 */
	public static final int USER_TYPE_PERSONAL = 1; // 个人用户
	public static final int USER_TYPE_MASTER = 2; // 企业用户

	/**
	 * 信用分数增减基本类型
	 */
	public static final int USER_CREDIT_TYPE_USER = 1;// 自助提额
	public static final int USER_CREDIT_TYPE_XYD = 2;// 平台授予

	/**
	 * 用户信用分数类型
	 */
	public static final int USER_CREDIT_VALUE_TYPE_SEX = 1;// 性别加分
	public static final int USER_CREDIT_VALUE_TYPE_AGE = 2;// 年龄加分
	public static final int USER_CREDIT_VALUE_TYPE_CONTACTS = 3;// 联系人加分
	public static final int USER_CREDIT_VALUE_TYPE_NEGTIME = 4;// 运营商网龄加分

	/**
	 * 用户验证码短信类型
	 */
	public static final int USER_SMS_TYPE_REGISTER = 1;// 注册发送验证码
	public static final int USER_SMS_TYPE_LOAN = 2;// 借款发送验证码
	public static final int USER_SMS_TYPE_CHANGE_TRADE_PASSWORD = 3;// 修改交易密码发送验证码
	public static final int USER_SMS_TYPE_CHANGE_LOGIN_PASSWORD = 4;// 修改登录密码发送验证码
	public static final int USER_SMS_TYPE_CHANGE_MOBILE = 5;// 修改手机号发送验证码
	
	/**
	 * 用户提醒短信类型
	 */
	public static final int USER_SMS_TYPE_REMIND = 1;// 当天还款的提醒短信
	
	/**
	 * 用户推送消息类型
	 */
	public static final int USER_PUSH_TYPE_REMIND_THREE = 1;// 还款三天前提醒
	public static final int USER_PUSH_TYPE_REMIND_TODAY = 2;// 还款当天提醒
	public static final int USER_PUSH_TYPE_REMIND_BREAK = 3;// 还款逾期第一天提醒
	
	public static final int USER_PUSH_TYPE_REMIND_LEND = 4;//借到钱时的提醒
	
}
