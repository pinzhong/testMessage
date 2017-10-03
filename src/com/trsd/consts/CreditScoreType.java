package com.trsd.consts;

public enum CreditScoreType {
	
	ZHIMA(101,"芝麻信用",2), // 增加芝麻分
	TAOBAO(102,"淘宝认证",2), // 增加淘宝分
	JINGDONG(103,"京东认证",2), // 增加京东分数
	PAYBACKSHORT_NORMAL(104,"短贷正常还款",2), // 短还正常还款加分
	PAYBACKLONG_NORMAL(105,"长贷还款",2), // 长贷正常还款加分
	ZHENGXIN(106,"央行征信认证",2),//央行征信
	SEX(107,"基础额度",1),//性别加分
	AGE(108,"基础额度",1),//年龄加分
	CONTACTS(109,"基础额度",1),//匹配联系人加分
	NEGTIME(110,"基础额度",1),//运营商时长加分
	INVITE(111,"绑定邀请码",2),//被绑定邀请码实名加分
	INVITELIMIT(112,"被绑定邀请码",2),//邀请下家，下家实名时加分；注：不提供接口调用
	XYD(113,"每月平台授额",3),//平台授额
	PAYBACKSHORT_ADVANCE(114,"短贷提前还款",2),//短贷提前还款
	PAYBACKLONG_ADVANCE(115,"长贷提前还款",2);//长贷提前还款
	

	private int value = 0;
	
	private String memo = null;
	
	/**
	 * 1为基础额度，2为自助提额，3为平台授予
	 */
	private int type = 0;
		
	private CreditScoreType(int value,String memo,int type) { 
		this.value = value;
		this.memo = memo ;
		this.type = type;
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
			return PAYBACKSHORT_NORMAL;
		case 105:
			return PAYBACKLONG_NORMAL;
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
		case 112:
			return INVITELIMIT;
		case 113:
			return XYD;
		case 114:
			return PAYBACKSHORT_ADVANCE;
		case 115:
			return PAYBACKLONG_ADVANCE;
		default:
			return null;
		}
	}

	public int value() {
		return this.value;
	}
	
	public String memo(){
		return this.memo;
	}
	
	public int type(){
		return this.type;
	}
	
}
