package com.trsd.pojo;

import java.io.Serializable;
import java.util.Date;

public class ReapalNotifyMonModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String orderNo;
	private String reqEncyptInfo;
	private String reqInfo;
	private String resEncyptInfo;
	private String resInfo;
	private String createTimeStr;
	private Date createTime;
}
