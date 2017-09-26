package com.trsd.consts;

public class ResultConsts {
	
	public static final int RESAULT_SUCCESS = 1 ; //成功
	public static final int RESAULT_FAIL = 0; // 失败
	
	public static final String MSG_SUCCESS = "操作成功";
	public static final String MSG_FAIL = "操作失败";
	public static final String MSG_SYS_FAIL = "发生未知的系统错误，请与管理员联系。";
	public static final String MSG_AUTH_FAIL = "你未登录，无权进行此步操作。";
	public static final String MSG_TCODE_FAIL = "验证码不正确，无权进行此步操作。";
	public static final String MSG_UNQUALIFIED_LOAN = "您暂无借款资格";
	public static final String MSG_UNQUALIFIED_LEND = "您暂无投资资格";
	public static final String MSG_BALANCE_NOT_ENOUGH = "余额不足，不能投资";
	public static final String MSG_REAL_NAME_NOT_PASS = "您的实名未通过，不能进行当前操作";
	public static final String MSG_AVALIABLE_SCORE_NOT_ENOUGH = "您的可用身价不足，不能进行当前操作";
	public static final String MSG_LOAN_SUCCESS = "恭喜您，您的借款申请已提交成功";
	public static final String MSG_LOAN_FAIL = "抱歉，您的借款申请提交失败，请您稍后重试";
	public static final String MSG_SMS_FAIL = "抱歉，您的短信码次数今日已满，请明日再试";
	public static final String MSG_TRADE_PASSWORD_FAIL = "抱歉，您的交易密码错误，请重试";
	public static final String MSG_TRADE_PASSWORD_NO_SET = "抱歉，您的交易密码错误，请重试";
	
	public static final String MSG_BUSINESS_UNQUALIFIED_LOAN = "您暂无借款资格";
	public static final String MSG_BUSINESS_UNQUALIFIED_LEND = "您暂无投资资格";
	public static final String MSG_BUSINESS_BALANCE_NOT_ENOUGH = "余额不足，不能投资";
	public static final String MSG_BUSINESS_PAYBACK_NOT_ENOUGH = "余额不足，不能还款";
	public static final String MSG_BUSINESS_REAL_NAME_NOT_PASS = "您的实名未通过，不能进行当前操作";
	public static final String MSG_BUSINESS_AVALIABLE_SCORE_NOT_ENOUGH = "您的可用身价不足，不能进行当前操作";
	public static final String MSG_BUSINESS_LOAN_SUCCESS = "恭喜您，您的借款申请已提交成功";
	public static final String MSG_BUSINESS_LOAN_FAIL = "抱歉，您的借款申请提交失败，请您稍后重试";
	public static final String MSG_BUSINESS_LEND_FAIL = "抱歉，您的投资提交失败，请稍后再试";
	public static final String MSG_BUSINESS_SAME_USER = "抱歉，您不能给自己的借款进行投资，请重新选择借款再试!";
	public static final String MSG_BUSINESS_INVEST_FAIL = "抱歉，您选择的投资券有误，请重新选择";
	public static final String MSG_BUSINESS_PAYBACK_LOANSTATUS_FAIL = "抱歉，您的借款暂未结束，请结束借款后再进行还款";
	public static final String MSG_BUSINESS_PAYBACK_STATUS_FAIL = "抱歉，您已进行过还款，请重新还款";
	
	public static final String MSG_ACCOUNT_ALREADY_FREE = "当前已有同类型冻结数据，请解冻后再试";
	public static final String MSG_ACCOUNT_ALREADY_THAW = "此数据已被解冻";

}
