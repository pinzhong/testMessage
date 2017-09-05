/**
 * @Author: zy
 * @Company: 
 * @Create Time: 2016�?8�?13�? 下午3:13:19
 */
package com.trsd.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.message.BasicNameValuePair;

/**
 * @Project: trust-common
 * @Author zy
 * @Company:
 * @Create
 */
public class MDUtil {

	public static String SHA1(String decript) {
		String ret = "";
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
			digest.update(decript.getBytes("UTF-8"));
			byte messageDigest[] = digest.digest();
			ret = StringUtils.bytesToHexString(messageDigest);

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return ret;
	}

	/**
	 * 签名转化
	 *
	 * @param reqParam
	 * @return
	 */
	public static String getSign(List<BasicNameValuePair> reqParam, String apiSecret) {

		StringBuffer sbb = new StringBuffer();
		int index = 1;
		for (BasicNameValuePair nameValuePair : reqParam) {
			sbb.append(nameValuePair.getName() + "=" + nameValuePair.getValue());
			if (reqParam.size() != index) {
				sbb.append("&");
			}
			index++;
		}
		String sign = sbb.toString();

		Map<String, String> paramMap = new HashMap<String, String>();
		String ret = "";
		if (!StringUtils.isEmpty(sign)) {
			String[] arr = sign.split("&");
			for (int i = 0; i < arr.length; i++) {
				String tmp = arr[i];
				if (-1 != tmp.indexOf("=")) {
					paramMap.put(tmp.substring(0, tmp.indexOf("=")), tmp.substring(tmp.indexOf("=") + 1, tmp.length()));
				}

			}
		}
		// List<Map.Entry<String, String>> list = new
		// ArrayList<>(paramMap.entrySet());
		List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(paramMap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
			public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
				int ret = 0;
				ret = o1.getKey().compareTo(o2.getKey());
				if (ret > 0) {
					ret = 1;
				} else {
					ret = -1;
				}
				return ret;
			}
		});

		StringBuilder sbTmp = new StringBuilder();
		for (Map.Entry<String, String> mapping : list) {
			if (!"sign".equals(mapping.getKey())) {
				sbTmp.append(mapping.getKey()).append("=").append(mapping.getValue()).append("&");
			}
		}
		sbTmp.setLength(sbTmp.lastIndexOf("&"));
		sbTmp.append(apiSecret);
		ret = MDUtil.SHA1(sbTmp.toString());

		// System.out.println(sb.toString());
		return ret;
	}

}