package com.trsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 寻程银行卡三要素认证数据实体类
 * @author chenhy
 *
 */
public class BankcardApistore implements Serializable{
	private static final long serialVersionUID = 1L;
	private long userid;
	private long authid;
	private Date authdate;
	private int error_code;
	private Result result;
	
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getAuthid() {
		return authid;
	}
	public void setAuthid(long authid) {
		this.authid = authid;
	}
	public int getError_code() {
		return error_code;
	}
	public void setError_code(int error_code) {
		this.error_code = error_code;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Date getAuthdate() {
		return authdate;
	}
	public void setAuthdate(Date authdate) {
		this.authdate = authdate;
	}
	
	 
}
class Result {
	private String realName;
	private String bankcard;
	private String cardNo;
	private Information information;
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getBankcard() {
		return bankcard;
	}
	public void setBankcard(String bankcard) {
		this.bankcard = bankcard;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public Information getInformation() {
		return information;
	}
	public void setInformation(Information information) {
		this.information = information;
	}
}
class Information {
	private String abbreviation;
    private String bankimage;
    private String bankname;
    private String banknum;
    private String bankurl;
    private String cardlength;
    private String cardname;
    private String cardprefixlength;
    private String cardprefixnum;
    private String cardtype;
    private String enbankname;
    private boolean isLuhn;
    private String servicephone;
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getBankimage() {
		return bankimage;
	}
	public void setBankimage(String bankimage) {
		this.bankimage = bankimage;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBanknum() {
		return banknum;
	}
	public void setBanknum(String banknum) {
		this.banknum = banknum;
	}
	public String getBankurl() {
		return bankurl;
	}
	public void setBankurl(String bankurl) {
		this.bankurl = bankurl;
	}
	public String getCardlength() {
		return cardlength;
	}
	public void setCardlength(String cardlength) {
		this.cardlength = cardlength;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	public String getCardprefixlength() {
		return cardprefixlength;
	}
	public void setCardprefixlength(String cardprefixlength) {
		this.cardprefixlength = cardprefixlength;
	}
	public String getCardprefixnum() {
		return cardprefixnum;
	}
	public void setCardprefixnum(String cardprefixnum) {
		this.cardprefixnum = cardprefixnum;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public String getEnbankname() {
		return enbankname;
	}
	public void setEnbankname(String enbankname) {
		this.enbankname = enbankname;
	}
	public boolean isLuhn() {
		return isLuhn;
	}
	public void setLuhn(boolean isLuhn) {
		this.isLuhn = isLuhn;
	}
	public String getServicephone() {
		return servicephone;
	}
	public void setServicephone(String servicephone) {
		this.servicephone = servicephone;
	}
    
}