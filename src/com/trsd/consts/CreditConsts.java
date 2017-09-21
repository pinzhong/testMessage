package com.trsd.consts;

/**
 * 高级认证相关常量定义
 * @author chenhy
 *
 */
public class CreditConsts {
	//高级认证类型
	/**
	 * 高级认证项目（银行卡三要素认证）
	 */
	public static final int CREDIT_TYPE_BANKCARD = 1;
	/**
	 * 高级认证项目（身份认证）
	 */	
	public static final int CREDIT_TYPE_REALNAME = 2;
	/**
	 * 高级认证项目（运营商认证）
	 */	
	public static final int CREDIT_TYPE_MOBILE = 3;
	/**
	 * 高级认证项目（央行征信）
	 */	
	public static final int CREDIT_TYPE_CENTRALBANK = 4;
	/**
	 * 高级认证项目（淘宝）
	 */	
	public static final int CREDIT_TYPE_TAOBAO = 5;
	/**
	 * 高级认证项目（京东）
	 */	
	public static final int CREDIT_TYPE_JINDONG = 6;
	/**
	 * 高级认证项目（芝麻信用分）
	 */	
	public static final int CREDIT_TYPE_ZHIMASCORE = 7;
	
	//实名认证步骤
	/**
	 * 实名认证步骤1（实名绑卡）
	 */
	public static final int CREDIT_AUTHSTEP_BANKCARD = -1;
	/**
	 * 实名认证步骤2（设置交易密码）
	 */
	public static final int CREDIT_AUTHSTEP_TRADEPASSWORD = -2;
	/**
	 * 实名认证步骤3（提交身份证照片）
	 */
	public static final int CREDIT_AUTHSTEP_IDCARD = -3;
	/**
	 * 实名认证步骤4（人脸识别）
	 */
	public static final int CREDIT_AUTHSTEP_FACE = -4;
	/**
	 * 实名认证步骤5（运营商认证）
	 */
	public static final int CREDIT_AUTHSTEP_ISP = -5;
	/**
	 * 实名认证完成
	 */
	public static final int CREDIT_AUTHSTEP_FINISH = 1;
	
	//高级认证服务商
	/**
	 * 高级认证服务商（寻程）
	 */
	public static final String CREDIT_PROVIDER_APISTORE = "apistore";
	/**
	 * 高级认证服务商（立木）
	 */
	public static final String CREDIT_PROVIDER_LIMU = "limu"; 
	/**
	 * 高级认证服务商（芝麻）
	 */
	public static final String CREDIT_PROVIDER_ZHIMA = "zhima"; 	
	
	
}
