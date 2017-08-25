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

	public static final int AUTO_LOAN_CONFIG_TYPE_ZHIMA = 1 ; //是否关注借款人
	public static final int AUTO_LOAN_CONFIG_TYPE_CREDIT_SCORE = 2 ; //额度
	public static final int AUTO_LOAN_CONFIG_TYPE_RATE = 3 ; // 利率
	public static final int AUTO_LOAN_CONFIG_TYPE_LEVEL = 4 ; // 等级
	public static final int AUTO_LOAN_CONFIG_TYPE_FANS_COUNT = 5 ; //粉丝数
	public static final int AUTO_LOAN_CONFIG_TYPE_REGISTER_DAYS = 6 ; //注册天数
	public static final int AUTO_LOAN_CONFIG_TYPE_ZHIMA_SCORE = 7 ; //芝麻分
	public static final int AUTO_LOAN_CONFIG_TYPE_MNO_MONTH = 8 ;//运营时长
	public static final int AUTO_LOAN_CONFIG_TYPE_JINGDONG	= 9 ; //京东认证
	public static final int AUTO_LOAN_CONFIG_TYPE_ZHIFUBAO	= 10 ; //支付宝
	public static final int AUTO_LOAN_CONFIG_TYPE_CREDIT	= 11 ; //征信
	public static final int AUTO_LOAN_CONFIG_TYPE_INVEST_COUNT	= 12 ; //邀请码绑定人数
	public static final int AUTO_LOAN_CONFIG_TYPE_PERIOD	= 13; // 分期数
	public static final int AUTO_LOAN_CONFIG_TYPE_AGE	= 14; // 年龄
	public static final int AUTO_LOAN_CONFIG_TYPE_BREAK_DAYS = 15; // 最长逾期天数
	
	/**
	 * 投资计划类型
	 */
	public static final int AUTO_LEND_SCHEME_TYPE_PERSONAL = 1;//个人投资计划
	public static final int AUTO_LEND_SCHEME_TYPE_MASTER = 2;//企业投资计划
	
	/**
	 * 投资计划状态
	 */
	public static final int AUTO_LEND_SCHEME_STATUS_START = 1;//使用中	
	public static final int AUTO_LEND_SCHEME_STATUS_PAUSE = 0;//暂停使用
	public static final int AUTO_LEND_SCHEME_STATUS_STOP = -1;//停用
	
}
