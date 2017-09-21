package com.trsd.consts;

/**
 * 投资券类型
 * 
 * @author ThinkPad
 *
 */
public class InvestTicketConsts {

	/**
	 * 投资券使用场景
	 */
	public static final int TICKET_GIVE_TYPE_FIRST_LEND = 1;// 首次投资
	public static final int TICKET_GIVE_TYPE_FIRST_LOAN = 2; // 首次借款完成

	/**
	 * 投资券类型
	 */
	public static final int INVEST_TICKET_TYPE_INVEST = 1;// 投资券
	public static final int INVEST_TICKET_TYPE_FREE = 2;// 免息券

	/**
	 * 投资券状态
	 */
	public static final int INVEST_TICKET_STATUS_NOT_USED = 1;// 未使用
	public static final int INVEST_TICKET_STATUS_USED = 2;// 已使用
	public static final int INVEST_TICKET_STATUS_INVALID = -1;// 已失效

}
