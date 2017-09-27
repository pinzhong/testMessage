package com.trsd.consts;

public enum CreditScoreType {
	ZHIMA(101), // 增加芝麻分
	TAOBAO(102), // 增加淘宝分
	JINGDONG(103), // 增加京东分数
	PAYBACKSHORT(104), // 短还还款加分
	PAYBACKLONG(105); // 长贷还款加分

	private int value = 0;

	private CreditScoreType(int value) { 
		this.value = value;
	}

	public static CreditScoreType valueOf(int value) { 
		switch (value) {
		case 1:
			return ZHIMA;
		case 2:
			return TAOBAO;
		case 3:
			return JINGDONG;
		case 4:
			return PAYBACKSHORT;
		case 5:
			return PAYBACKLONG;
		default:
			return null;
		}
	}

	public int value() {
		return this.value;
	}
}
