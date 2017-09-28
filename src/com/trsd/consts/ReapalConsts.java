package com.trsd.consts;

public class ReapalConsts {

	public static final Short BANKCARD_CARDTYPE_DEBIT = 0;// 储蓄卡
	public static final Short BANKCARD_CARDTYPE_CREDIT = 1;// 信用卡

	public static final Short BANKCARD_TYPE_BIND = 1;// 普通签约充值绑定
	public static final Short BANKCARD_TYPE_WHITE = 2;// 代扣白名单
	public static final Short BANKCARD_TYPE_REALNAME_BIND = 3;// 提现实名绑卡

	public static final Short BANKCARD_STATUS_REALNAME_BIND_INI = 10;// 提现实名绑卡初始
	public static final Short BANKCARD_STATUS_REALNAME_BIND_SUCCESS = 11;// 提现实名绑卡成功
	
	public static final Short BANKCARD_STATUS_BIND_INIT = 20;// 普通签约绑定初始
	public static final Short BANKCARD_STATUS_BIND_SUCCESS = 21;// 普通签约绑定成功

	public static final Short WITHDRAW_STATUS_INIT = 0;// 提现初始
	public static final Short WITHDRAW_STATUS_ACCEPT_FAIL = 1;// 提现受理成功
	public static final Short WITHDRAW_STATUS_ACCEPT_SUCCESS = 2;// 提现受理失败
	public static final Short WITHDRAW_STATUS_SUCCESS = 3;// 提现成功
	public static final Short WITHDRAW_STATUS_FAIL = 4;// 提现失败
	public static final Short WITHDRAW_STATUS_EXCEPTION = -1;// 提现异常订单

	public static final Short BANKCARD_CARDPWD_INIT = 0;// 卡密验证初始
	public static final Short BANKCARD_CARDPWD_SUCCESS = 1;// 卡密验证成功

	public static final Short RECHARGE_INI = 0;// 充值初始
	public static final Short RECHARGE_SUCCESS = 1;// 充值成功
	public static final Short RECHARGE_FAIL = 2;// 充值失败
	public static final Short RECHARGE_EXCEPTION = -1;// 充值异常
}
