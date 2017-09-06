package com.trsd.consts;

/**
 * 生成动态验证码的枚举
 * 
 * @author ThinkPad
 *
 */
public enum CodeType {
	LOGIN(1), // 登录验证码
	REGISTER(2), // 注册验证码
	PAYPWD(3), // 修改支付密码验证码
	PHONE(4), // 修改注册手机号验证码
	LOANCODE(5); // 借款

	private int value = 0;

	private CodeType(int value) { // 必须是private的，否则编译错误
		this.value = value;
	}

	public static CodeType valueOf(int value) { // 手写的从int到enum的转换函数
		switch (value) {
		case 1:
			return LOGIN;
		case 2:
			return REGISTER;
		case 3:
			return PAYPWD;
		case 4:
			return PHONE;
		case 5:
			return LOANCODE;
		default:
			return null;
		}
	}

	public int value() {
		return this.value;
	}
}
