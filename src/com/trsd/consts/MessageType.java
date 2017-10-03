package com.trsd.consts;

/**
 * 消息类型的枚举
 * @author ThinkPad
 *
 */
public enum MessageType {
	SMSCODE_REGISTER(1,"smsCode"),//注册短信验证码
	SMSCODE_LOAN(2,"smsCode"),//借款验证码
	SMSCODE_CHANGE_TRADE_PWD(3,"smsCode"),//修改交易密码验证码
	SMSCODE_CHANGE_LOGIN_PWD(4,"smsCode"),//修改登录密码验证码
	SMSCODE_CHANGE_PHONE(5,"smsCode"),//修改电话号码验证码
	SMS_TODAY_PAYBACK(1,"sms"),//当前还款提醒短信
	WEIXIN_BEFORE_PAYBACK(1,"weixin"),//还款三天前微信提醒
	WEIXIN_TODAY_PAYBACK(2,"weixin"),//还款当天微信提醒
	WEIXIN_BREAK_ONEDAY(3,"weixin"),//逾期第一天微信提醒
	PUSH_BEFORE_PAYBACK(1,"push"),//还款三天前推送提醒
	PUSH_TODAY_PAYBACK(2,"push"),//还款当天推送提醒
	PUSH_BREAK_ONEDAY(3,"push"),//逾期第一天推送提醒
	PUSH_LEND(4,"push");//收到投资发推送提醒
	
	private int type ;
	private String code ;

	private MessageType(int type,String code) { 
		this.type = type;
		this.code = code ;
	}
	
	public int type(){
		return this.type;
	}
	
	public String code(){
		return this.code ;
	}
	
}
