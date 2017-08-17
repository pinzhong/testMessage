package com.trsd.consts;

/**
 * 业务常量
 * @author ThinkPad
 *
 */
public class BusinessConsts {
	
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
	public static final int PAYBACK_STATUS_PREPAYMENT = 1 ;//提前还款
	public static final int PAYBACK_STATUS_NORMAL = 2 ;//正常还款
	public static final int PAYBACK_STATUS_BREAK = 3 ;//逾期还款
	
	/**
	 * 还款类型
	 */
	public static final int PAYBACK_TYPE_PRINCIPAL = 1 ; //还本金
	public static final int PAYBACK_TYPE_INTEREST = 2 ; //还利息
	public static final int PAYBACK_TYPE_PENALTY = 3 ; //还违约金
	/**
	 * 投资券状态
	 */
	public static final int INVEST_TICKET_NOT_USED = 0 ;//未使用
	public static final int INVEST_TICKET_USED = 1 ;//已使用
	public static final int INVEST_TICKET_INVALID = -1 ;//已失效
		
	/**
	 * 邀请等级
	 */
	public static final int USER_INVEST_LEVEL_ONE = 1 ;//邀请一级
	public static final int USER_INVEST_LEVEL_TWO = 2 ;//邀请二级
	
	
	/**
	 * 邀请收益类型
	 */
	public static final int INVITE_TYPE_LEND_ONE = 1 ; //一级借款收益
	public static final int INVITE_TYPE_LEND_TWO = 2 ; //二级借款收益
	public static final int INVITE_TYPE_PAYBACK_ONE = 3 ; //一级还款收益
	public static final int INVITE_TYPE_PAYBACK_TWO = 4 ; //二级还款收益
	
}
