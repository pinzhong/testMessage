package com.trsd.consts;

public enum CreditScoreType {
	ZHIMA(101), // 增加芝麻分
	TAOBAO(102), // 增加淘宝分
	JINGDONG(103), // 增加京东分数
	PAYBACKSHORT(104), // 短还还款加分
	PAYBACKLONG(105), // 长贷还款加分
	ZHENGXIN(106),//央行征信
	SEX(107),//性别加分
	AGE(108),//年龄加分
	CONTACTS(109),//匹配联系人加分
	NEGTIME(110),//运营商时长加分
	INVITE(111);//绑定邀请码实名加分

	private int value = 0;

	private CreditScoreType(int value) { 
		this.value = value;
	}

	public static CreditScoreType valueOf(int value) { 
		switch (value) {
		case 101:
			return ZHIMA;
		case 102:
			return TAOBAO;
		case 103:
			return JINGDONG;
		case 104:
			return PAYBACKSHORT;
		case 105:
			return PAYBACKLONG;
		case 106:
			return ZHENGXIN;
		case 107:
			return SEX;
		case 108:
			return AGE;
		case 109:
			return CONTACTS;
		case 110:
			return NEGTIME;
		case 111:
			return INVITE;
		default:
			return null;
		}
	}

	public int value() {
		return this.value;
	}
}
