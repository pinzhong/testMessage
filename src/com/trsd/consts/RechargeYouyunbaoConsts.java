package com.trsd.consts;

public class RechargeYouyunbaoConsts {
	public static final int RECHARGE_INITIAL=0;//订单初始创建状态
	public static final int RECHARGE_BIND=1;//已绑定用户
	public static final int RECHARGE_SUCCESS=2;//成功充值到账务系统
	
	public static final int RECHARGE_EXCEPTION_INITIAL=0;//异常订单初始状态
	public static final int RECHARGE_EXCEDPTION_PROCESSED=1;//异常订单已处理
	
	public static final int BUSINESS_TYPE_NORMAL=0;//业务类型普通
	public static final int BUSINESS_TYPE_FIX=1;//修复型订单
	
	public static final String REDIS_RECHAREGE_DAY_COUNTS_KEY="recharge:day:counts:key";//每日次数存储
	public static final String REDIS_RECHARGE_MINUTE_COUNTS_KEY="recharge:minute:counts:key";//每分钟次数存储
	
	public static final int RECHARGE_PAY_TYPE_ALIPAY=1;//支付宝充值
	public static final int RECHARGE_PAY_TYPE_QQ=2;//qq充值
	public static final int RECHARGE_PAY_TYPE_WECHART=3;//微信充值
	
	
}
