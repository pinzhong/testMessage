package com.trsd.consts;

/**
 * 业务常量
 * @author ThinkPad
 *
 */
public class BusinessConsts {
	public static final int LOAN_TYPE_SHORT = 1 ;//短贷
	public static final int LOAN_TYPE_LONG = 2 ;//长贷
	
	/**
	 * 借款申请状态
	 */
	public static final int LOAN_STATUS_APPLY = 0 ;//申请中
	public static final int LOAN_STATUS_AVAILABLE = 1 ;//借款中
	public static final int LOAN_STATUS_FINISH = 2 ;//已完成
	public static final int LOAN_STATUS_FAIL = -1 ;//借款失败
	
	/**
	 * 还款状态
	 */
	public static final int PAYBACK_STATUS_REPAYMENT = 0 ;//待还款
	public static final int PAYBACK_STATUS_PREPAYMENT = 1 ;//提前还款(短贷及 分期)
	public static final int PAYBACK_STATUS_NORMAL = 2 ;//正常还款
	public static final int PAYBACK_STATUS_BREAK = 3 ;//逾期还款
	public static final int PAYBACK_STATUS_ADVANCE = 4 ;//超过当期提前
	
	/**
	 * 还款类型
	 */
	public static final int PAYBACK_TYPE_PRINCIPAL = 1 ; //还本金
	public static final int PAYBACK_TYPE_INTEREST = 2 ; //还利息
	public static final int PAYBACK_TYPE_PENALTY = 3 ; //还违约金
	public static final int PAYBACK_TYPE_PENALTY_ADVANCE = 4 ; //还提前还款违约金
		
	/**
	 * 邀请等级
	 */
	public static final int USER_INVEST_LEVEL_ONE = 1 ;//邀请一级
	public static final int USER_INVEST_LEVEL_TWO = 2 ;//邀请二级
	
	
	/**
	 * 邀请收益类型
	 */
	public static final int INVITE_TYPE_LEND_ONE = 1 ; //一级投资人上家收益
	public static final int INVITE_TYPE_LEND_TWO = 2 ; //二级投资人上家收益
	public static final int INVITE_TYPE_LOAN_ONE = 3 ; //一级借款人上家收益
	public static final int INVITE_TYPE_LOAN_TWO = 4 ; //二级借款人上家收益
	
	/** 违约公示发布类型 个人发布 */
	public static final int NOTICE_TYPE_PERSON = 1;
	/** 违约公示发布类型 企业发布 */
	public static final int NITOCE_TYPE_COMPANY = 2;
	
	/** 常量表常量类型 借款用途 */
	public static final String CONSTANT_TYPE_LOAN_USER = "loanUse";
	/** 常量表常量类型 账务类型 */
	public static final String CONSTANT_TYPE_ACCOUNT_TYPE = "accountType";
	/** 常量表常量类型 自动投资配置参数 */
	public static final String CONSTANT_TYPE_AUTO_LEND_TYPE = "autoLendType";
	/** 常量表常量类型 电商 */
	public static final String CONSTANT_TYPE_DIAN_SHANG_TYPE = "dianShangType";
	/** 常量表常量类型 投资风险 */
	public static final String CONSTANT_TYPE_LEND_RISK_TYPE = "lendRiskType";
}
