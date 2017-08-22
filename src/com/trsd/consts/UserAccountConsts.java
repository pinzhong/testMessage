package com.trsd.consts;

public class UserAccountConsts {
	/**
	 * 用户账户变动类型
	 */
	public static final int USER_ACCOUNT_TYPE_RECHARGE = 101 ; //充值
	public static final int USER_ACCOUNT_TYPE_WITHDRAW = 102 ; //提现
	
	/**
	 * 投资借款账户变动类型
	 */
	public static final int USER_ACCOUNT_TYPE_LOAN_SHORT = 201 ; //短贷借款
	public static final int USER_ACCOUNT_TYPE_LEND_SHORT = 202 ; //短贷投资
	public static final int USER_ACCOUNT_TYPE_LOAN_LONG = 203 ; //长贷借款
	public static final int USER_ACCOUNT_TYPE_LEND_LONG = 204 ; //长贷投资
	
	/**
	 * 收益账户变动类型
	 */
	public static final int USER_ACCOUNT_TYPE_INVEST_ONE = 301 ; //收取一级投资收益
	public static final int USER_ACCOUNT_TYPE_INVEST_TWO = 302 ; //收取二级投资收益
	public static final int USER_ACCOUNT_TYPE_INVEST_XYD = 303 ; //支付投资收益
	public static final int USER_ACCOUNT_TYPE_PAYBACK_ONE = 304 ; //收取一级还款收益
	public static final int USER_ACCOUNT_TYPE_PAYBACK_TWO = 305 ; //收取二级还款收益
	public static final int USER_ACCOUNT_TYPE_PAYBACK_XYD = 306 ; //支付还款收益
	
	/**
	 * 还款账户变动类型
	 */
	public static final int USER_ACCOUNT_TYPE_PAYBACK_SHORT_PRINPICAL = 401;//收取短贷本金
	public static final int USER_ACCOUNT_TYPE_PAYBACK_SHORT_INTEREST = 402;//收取短贷利息
	public static final int USER_ACCOUNT_TYPE_PAYBACK_SHORT_PENALTY = 403;//收取短贷违约金
	public static final int USER_ACCOUNT_TYPE_PAYBACK_LONG_PRINPICAL = 404;//收取长贷本金
	public static final int USER_ACCOUNT_TYPE_PAYBACK_LONG_INTEREST = 405;//收取长贷利息
	public static final int USER_ACCOUNT_TYPE_PAYBACK_LONG_PENALTY = 406;//收取长贷违约金
	
	/**
	 * 冻结解冻账户变动类型
	 */
	public static final int USER_ACCOUNT_TYPE_FREEZE = 501;//资金冻结
	public static final int USER_ACCOUNT_TYPE_THAW = 502;//资金解冻
	
	/**
	 * 平台账户变动类型
	 */
	public static final int XYD_ACCOUNT_TYPE_INVEST = 1001;//收取投资收益
	public static final int XYD_ACCOUNT_TYPE_PAYBACK = 1002;//收取还款收益
	
}
