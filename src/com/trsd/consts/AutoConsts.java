package com.trsd.consts;

/**
 * 自动投资常量
 * @author ThinkPad
 *
 */
public class AutoConsts {
	
	/**
	 * 自动投资配置参数类型
	 */

	public static final int AUTO_LOAN_CONFIG_TYPE_DAY_LIMIT = 101;//当日限额
	public static final int AUTO_LOAN_CONFIG_TYPE_INVEST_MONEY = 102;//单笔投资金额
	
	public static final int AUTO_LOAN_CONFIG_TYPE_CREDIT_SCORE = 201 ; //额度
	public static final int AUTO_LOAN_CONFIG_TYPE_RATE = 202 ; // 利率
	public static final int AUTO_LOAN_CONFIG_TYPE_LEVEL = 203 ; // 等级
	public static final int AUTO_LOAN_CONFIG_TYPE_FANS_COUNT = 204 ; //粉丝数
	public static final int AUTO_LOAN_CONFIG_TYPE_REGISTER_DAYS = 205 ; //注册天数
	public static final int AUTO_LOAN_CONFIG_TYPE_ZHIMA_SCORE = 206 ; //芝麻分
	public static final int AUTO_LOAN_CONFIG_TYPE_MNO_MONTH = 207 ;//运营时长
	public static final int AUTO_LOAN_CONFIG_TYPE_JINGDONG	= 208 ; //京东认证
	public static final int AUTO_LOAN_CONFIG_TYPE_TAOBAO	= 209 ; //支付宝
	public static final int AUTO_LOAN_CONFIG_TYPE_CREDIT	= 210 ; //征信
	public static final int AUTO_LOAN_CONFIG_TYPE_INVEST_COUNT	= 211 ; //邀请码绑定人数
	public static final int AUTO_LOAN_CONFIG_TYPE_PERIOD	= 212; // 分期数
	public static final int AUTO_LOAN_CONFIG_TYPE_AGE	= 213; // 年龄
	public static final int AUTO_LOAN_CONFIG_TYPE_BREAK_DAYS = 214; // 最长逾期天数
	public static final int AUTO_LOAN_CONFIG_TYPE_MATCH_NUM = 215; // 有效联系人
	
	/**
	 * 投资计划类型
	 */
	public static final int AUTO_LEND_SCHEME_TYPE_PERSONAL = 1;//个人投资计划
	public static final int AUTO_LEND_SCHEME_TYPE_MASTER = 2;//企业投资计划
	
	/**
	 * 投资计划投资类型
	 */
	public static final int AUTO_LEND_SCHEME_LEND_TYPE_SHORT = 1;//短贷投资计划
	public static final int AUTO_LEND_SCHEME_LEND_TYPE_LONG = 2 ;//长贷投资计划
	
	/**
	 * 投资计划状态
	 */
	public static final int AUTO_LEND_SCHEME_STATUS_START = 1;//使用中	
	public static final int AUTO_LEND_SCHEME_STATUS_PAUSE = 0;//暂停使用
	public static final int AUTO_LEND_SCHEME_STATUS_STOP = -1;//停用
	
	/**
	 * 投资条件类型
	 */
	public static final int AUTO_LEND_CONFIG_FLAG_NECESSARY = 1;//必须条件	
	public static final int AUTO_LEND_CONFIG_FLAG_UNNECESSARY = 0;//非必须条件
	
}
