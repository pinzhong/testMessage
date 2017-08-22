package com.trsd.consts;

public class ResultConsts {
	
	public static final int RESAULT_SUCCESS = 1 ; //成功
	public static final int RESAULT_FAIL = 0;
	
	public static final String MSG_SUCCESS = "操作成功";
	public static final String MSG_FAIL = "操作失败";
	
	public static final String MSG_BUSINESS_UNQUALIFIED_LOAN = "您暂无借款资格";
	public static final String MSG_BUSINESS_UNQUALIFIED_LEND = "您暂无投资资格";
	public static final String MSG_BUSINESS_BALANCE_NOT_ENOUGH = "余额不足，不能投资";
	public static final String MSG_BUSINESS_REAL_NAME_NOT_PASS = "您的实名未通过，不能进行当前操作";
	public static final String MSG_BUSINESS_AVALIABLE_SCORE_NOT_ENOUGH = "您的可用身价不足，不能进行当前操作";
	public static final String MSG_BUSINESS_LOAN_SUCCESS = "恭喜您，您的借款申请已提交成功";
	public static final String MSG_BUSINESS_LOAN_FAIL = "抱歉，您的借款申请提交失败，请您稍后重试";
	
	public static final String MSG_ACCOUNT_ALREADY_FREE = "当前已有同类型冻结数据，请解冻后再试";
	public static final String MSG_ACCOUNT_ALREADY_THAW = "此数据已被解冻";

}
