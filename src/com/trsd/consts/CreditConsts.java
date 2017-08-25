package com.trsd.consts;

/**
 * 高级认证相关常量定义
 * @author chenhy
 *
 */
public class CreditConsts {
	public static final int CREDIT_TYPE_BANKCARD = 1;//银行卡三要素认证
	public static final int CREDIT_TYPE_REALNAME = 2;//身份认证
	public static final int CREDIT_TYPE_MOBILE = 3;//运营商认证
	public static final int CREDIT_TYPE_CENTRALBANK = 4;//央行征信
	public static final int CREDIT_TYPE_TAOBAO = 5;//淘宝
	public static final int CREDIT_TYPE_JINDONG = 6;//京东	
	
	/**
	 * 高级认证服务商
	 */
	public static final String CREDIT_PROVIDER_APISTORE = "apistore"; //寻程
	public static final String CREDIT_PROVIDER_LIMU = "limu"; 		  //立木
}
