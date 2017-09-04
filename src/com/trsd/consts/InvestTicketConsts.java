package com.trsd.consts;

/**
 * 投资券类型
 * 
 * @author ThinkPad
 *
 */
public class InvestTicketConsts {

	public static final int INVEST_TICKET_TYPE_INVEST = 1;// 投资券
	public static final int INVEST_TICKET_TYPE_FREE = 2;// 免息券

	/**
	 * 投资券状态
	 */
	public static final int INVEST_TICKET_STATUS_NOT_USED = 0 ;//未使用
	public static final int INVEST_TICKET_STATUS_USED = 1 ;//已使用
	public static final int INVEST_TICKET_STATUS_INVALID = -1 ;//已失效
}
