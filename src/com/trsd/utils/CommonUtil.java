package com.trsd.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.lang3.StringUtils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class CommonUtil {
	// 生成防伪标签的数量
	public static int GeneFWCnt = 1;
	private static SimpleDateFormat sdfymd = new SimpleDateFormat("yyyy-MM-dd");

	/**
	 * 生成掩盖后的手机号码
	 * 
	 * @param phone
	 * @return
	 */
	public static String maskPhone(String phone) {
		return phone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
	}

	/**
	 * 生成掩盖后的身份证号
	 * 
	 * @param idCard
	 * @return
	 */
	public static String maskIdCard(String idCard) {
		return idCard.replaceAll("(\\d{4})\\d{10}(\\d{4})", "$1****$2");
	}

	/**
	 * 生成掩盖后的姓名
	 * 
	 * @param userName
	 * @return
	 */
	public static String maskName(String userName) {
		if (StringUtils.isBlank(userName)) {
			return "";
		}
		String name = StringUtils.left(userName, 1);
		return StringUtils.rightPad(name, StringUtils.length(userName), "*");
	}

	/**
	 * 将存放在sourceFilePath目录下的源文件,打包成fileName名称的ZIP文件,并存放到zipFilePath。
	 * 
	 * @param sourceFilePath
	 *            待压缩的文件路径
	 * @param zipFilePath
	 *            压缩后存放路径
	 * @param fileName
	 *            压缩后文件的名称
	 * @return flag
	 */
	public static boolean fileToZip(String sourceFilePath, String zipFilePath, String fileName) throws Exception {
		boolean flag = false;
		File sourceFile = new File(sourceFilePath);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		ZipOutputStream zos = null;

		if (sourceFile.exists() == false) {
			System.out.println(">>>>>> 待压缩的文件目录：" + sourceFilePath + " 不存在. <<<<<<");
		} else {
			File zipFile = new File(zipFilePath + File.separator + fileName + ".zip");
			if (zipFile.exists()) {
				System.out.println(">>>>>> " + zipFilePath + " 目录下存在名字为：" + fileName + ".zip" + " 打包文件. <<<<<<");
				zipFile.delete();
			}

			File[] sourceFiles = sourceFile.listFiles();
			if (null == sourceFiles || sourceFiles.length < 1) {
				System.out.println(">>>>>> 待压缩的文件目录：" + sourceFilePath + " 里面不存在文件,无需压缩. <<<<<<");
			} else {
				fos = new FileOutputStream(zipFile);
				zos = new ZipOutputStream(new BufferedOutputStream(fos));
				byte[] bufs = new byte[1024 * 10];
				for (int i = 0; i < sourceFiles.length; i++) {
					// 创建ZIP实体,并添加进压缩包
					ZipEntry zipEntry = new ZipEntry(sourceFiles[i].getName());
					zos.putNextEntry(zipEntry);
					// 读取待压缩的文件并写进压缩包里
					fis = new FileInputStream(sourceFiles[i]);
					bis = new BufferedInputStream(fis, 1024 * 10);
					int read = 0;
					while ((read = bis.read(bufs, 0, 1024 * 10)) != -1) {
						zos.write(bufs, 0, read);
					}
				}
				flag = true;
			}
			System.out.println(">>>>>> 待压缩的文件目录： 已经压缩成功. <<<<<<");

			// 关闭流
			if (null != bis)
				bis.close();
			if (null != zos)
				zos.close();
		}
		return flag;
	}

	/**
	 * 编码 UTF-8编码格式
	 * 
	 * @param strUrl
	 * @return 返回""：出现异常
	 */
	public static String urlEnCode(String strUrl) {
		try {
			return URLEncoder.encode(strUrl, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}

	/**
	 * 解码 UTF-8编码格式
	 * 
	 * @param strUrl
	 * @return 返回""：出现异常
	 */
	public static String urlDeCode(String strUrl) {
		try {
			return URLDecoder.decode(strUrl, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}

	/**
	 * 防止sql注入 过滤参数使用
	 * 
	 * @param strPara
	 *            需过滤的参数
	 * @return 过滤后的参数
	 */
	public static String filterPara(Object str) {
		if (str == null || str.equals(""))
			return "";
		else {
			String temp = str.toString();
			String filter = "and,exec,insert,select,delete,update,count,%,chr,mid,master,truncate,declare,;,*,or,--,";
			String[] StrFilter = filter.split(",");
			for (int i = 0; i < StrFilter.length; i++) {
				temp = temp.replace(StrFilter[i], "");
			}
			return temp;
		}
	}

	/**
	 * 获取当前时间 格式：yyyy-MM-dd HH:mm:ss
	 * 
	 * @return 当前时间字符串
	 */
	public static String getTime() {
		SimpleDateFormat tempFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return tempFormat.format(new Date());
	}

	/**
	 * 格式化sql语句中的like 将%加入字段值中
	 * 
	 * @param type
	 *            格式化类型 1：两边都加% 2：左边加% 3：右边加%
	 * @param str
	 *            需格式化的字段
	 * @return null：格式化失败
	 */
	public static String getSqlLike(int type, String str) {
		if (str != null && !str.equals("")) {
			switch (type) {
				case 1:
					str = "%" + str + "%";
					break;
				case 2:
					str = "%" + str;
					break;
				case 3:
					str = str + "%";
					break;
			}
		}
		return str;
	}

	/**
	 * 获取当前日期延后或提前天数的日期
	 * 
	 * @param amount
	 *            延后的数量 负数表示提前的数量
	 * @param partter
	 *            时间模式,默认:yyyy-MM-dd HH:mm:ss
	 * @param type
	 *            1:天数 、2:小时、 3:分钟 、4:秒
	 * @return "-1":出错 未出错返回格式化的日期
	 */
	@SuppressWarnings("static-access")
	public static String getDateAfterPara(int amount, String partter, int type) {
		if (partter == null || partter.trim().equals(""))
			partter = "yyyy-MM-dd HH:mm:ss";
		if (type < 1 || type > 4)
			type = 1;

		String retDate = "-1";
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		if (type == 1) {
			calendar.add(calendar.DATE, amount);
		} else if (type == 2) {
			calendar.add(calendar.HOUR, amount);
		} else if (type == 3) {
			calendar.add(calendar.MINUTE, amount);
		} else if (type == 4) {
			calendar.add(calendar.SECOND, amount);
		}
		SimpleDateFormat format = new SimpleDateFormat(partter);
		retDate = format.format(calendar.getTime());
		return retDate;
	}

	/**
	 * 判断两个时间的间隔
	 * 
	 * @param d1
	 * @param d2
	 * @param type
	 *            1：间隔日 2：间隔时 3：间隔分 4：间隔秒
	 * @return
	 */
	public static Long dateDifferent(Date d1, Date d2, int type) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(d1);
		c2.setTime(d2);
		Long result = 0L;
		long diff = c1.getTimeInMillis() - c2.getTimeInMillis();
		switch (type) {
			case 1:
				result = diff / (24 * 60 * 60 * 1000);
				break;
			case 2:
				result = diff / (60 * 60 * 1000);
				break;
			case 3:
				result = diff / (60 * 1000);
				break;
			case 4:
				result = diff / 1000;
				break;
			default:
				break;
		}
		return result;
	}
	
	/**
	 * 判断两个日期的间隔
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 * @throws ParseException 
	 */
	public static Long dateDifferentDays(Date d1, Date d2) throws ParseException {
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(getFormatDate(d1, "yyyy-MM-dd"));
		c2.setTime(getFormatDate(d2, "yyyy-MM-dd"));
		Long result = 0L;
		long diff = c2.getTimeInMillis() - c1.getTimeInMillis();
		long aa = c2.getTimeInMillis();
		long bb =  c1.getTimeInMillis();
		result = diff / (24 * 60 * 60 * 1000);
		return result;
	}

	/**
	 * 获取传入日期延后或提前天数的日期
	 * 
	 * @param date
	 *            传入日期
	 * @param amount
	 *            延后数量 负数表示提前的数量
	 * @param partter
	 *            时间展示模式
	 * @param type
	 *            1:天数 、2:小时、 3:分钟 、4:秒
	 * @return "-1":出错 未出错返回格式化的日期
	 */
	@SuppressWarnings("static-access")
	public static String getDateAfterPara(Date date, int amount, String partter, int type) throws ParseException {
		if (partter == null || partter.trim().equals(""))
			partter = "yyyy-MM-dd";

		SimpleDateFormat sdf = new SimpleDateFormat(partter);
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date);
		if (type == 1) {
			calendar.add(calendar.DATE, amount);
		} else if (type == 2) {
			calendar.add(calendar.HOUR, amount);
		} else if (type == 3) {
			calendar.add(calendar.MINUTE, amount);
		} else if (type == 4) {
			calendar.add(calendar.SECOND, amount);
		}

		return sdf.format(calendar.getTime());
	}

	/**
	 * 获取传入日期延后或提前天数的日期
	 * 
	 * @param date
	 *            传入日期
	 * @param partter
	 *            时间展示模式
	 * @return 返回格式化的日期
	 */
	public static String getPartterDate(Date date, String partter) {
		if (partter == null || partter.trim().equals(""))
			partter = "yyyy-MM-dd";

		SimpleDateFormat sdf = new SimpleDateFormat(partter);
		return sdf.format(date);
	}
	
	/**
	 * 将传入的日期转换为格式要求的日期
	 * @param date
	 * @param partter
	 * @return
	 * @throws ParseException
	 */
	public static Date getFormatDate(Date date, String partter) throws ParseException{
		if (partter == null || partter.trim().equals(""))
			partter = "yyyy-MM-dd";
		
		SimpleDateFormat sdf = new SimpleDateFormat(partter);
		String s = sdf.format(date);
		date =  sdf.parse(s);
		return date;
	}

	/**
	 * 是否是数字
	 * 
	 * @param str
	 *            传入字符串
	 * @return true：数字 false：非数字
	 */
	public static boolean isNumeric(String str) {
		if (str != null && str.length() > 0) {
			Pattern pattern = Pattern.compile("[0-9]*");
			return pattern.matcher(str).matches();
		} else
			return false;
	}

	/**
	 * 判断字符串是否为字母
	 * 
	 * @param str
	 *            字符串
	 * @return true：字母 false：不全为字母
	 */
	public static boolean isCharacter(String str) {
		if (str != null && str.length() > 0)
			return str.matches("^[a-zA-Z]*");
		else
			return false;
	}

	/**
	 * 返回传入字符串拼音码
	 * 
	 * @param src
	 *            传入参数
	 * @return 传入参数拼音码
	 */
	public static String getPingYin(String str) {
		char[] t1 = null;
		t1 = str.toCharArray();
		String[] t2 = new String[t1.length];
		HanyuPinyinOutputFormat t3 = new HanyuPinyinOutputFormat();
		t3.setCaseType(HanyuPinyinCaseType.LOWERCASE);
		t3.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
		t3.setVCharType(HanyuPinyinVCharType.WITH_V);
		String t4 = "";
		int t0 = t1.length;
		try {
			for (int i = 0; i < t0; i++) {
				// 判断是否为汉字字符
				if (java.lang.Character.toString(t1[i]).matches("[\\u4E00-\\u9FA5]+")) {
					t2 = PinyinHelper.toHanyuPinyinStringArray(t1[i], t3);
					t4 += t2[0];
				} else
					t4 += java.lang.Character.toString(t1[i]);
			}
			return t4;
		} catch (BadHanyuPinyinOutputFormatCombination e1) {
			e1.printStackTrace();
		}
		return t4;
	}

	/**
	 * 返回传入字符串首字拼音码
	 * 
	 * @param src
	 *            传入参数
	 * @return 传入参数首字拼音码
	 */
	public static String getPinYinHeadChar(String str) {
		String convert = "";
		for (int j = 0; j < str.length(); j++) {
			char word = str.charAt(j);
			String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);
			if (pinyinArray != null) {
				convert += pinyinArray[0].charAt(0);
			} else {
				convert += word;
			}
		}
		return convert;
	}

	/**
	 * 根据文件名称获取文件类型
	 * 
	 * @return 文件类型
	 */
	public static String getFileType(String filename) {
		if (filename != null && filename.trim().length() > 0) {
			filename = filename.trim();
			int index = filename.lastIndexOf('.');
			if (index == -1)
				return "-1";
			else
				return filename.substring(index).toLowerCase();
		} else
			return "-1";
	}

	/**
	 * 半角转全角
	 * 
	 * @param input
	 *            String.
	 * @return 全角字符串.
	 */
	public static String toSBC(String input) {
		String returnString = "";
		if (input != null && !input.equals("")) {
			char c[] = input.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if (c[i] == ' ') {
					c[i] = '\u3000';
				} else if (c[i] < '\177') {
					c[i] = (char) (c[i] + 65248);

				}
			}
			returnString = new String(c);
		}

		return returnString;
	}

	/**
	 * 全角转半角
	 * 
	 * @param input
	 *            String.
	 * @return 半角字符串
	 */
	public static String toDBC(String input) {
		String returnString = "";
		if (input != null && !input.equals("")) {
			char c[] = input.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '\u3000') {
					c[i] = ' ';
				} else if (c[i] > '\uFF00' && c[i] < '\uFF5F') {
					c[i] = (char) (c[i] - 65248);
				}
			}
			returnString = new String(c);
		}

		return returnString;
	}

	/**
	 * 判断对象是否为空
	 * 
	 * @param obj
	 * @return true：为空 false：不为空
	 */
	public static boolean isNotEmpty(Object obj) {
		if (obj != null && !obj.toString().trim().equals(""))
			return true;
		else
			return false;
	}

	/**
	 * 清楚字符串空格
	 * 
	 * @param obj
	 * @return
	 */
	public static String trim(Object obj) {
		if (isNotEmpty(obj))
			return obj.toString().replaceAll(" ", "");
		else
			return "";
	}

	/**
	 * 过滤emoji图标
	 * 
	 * @param source
	 * @return
	 */
	public static String filterEmoji(String source) {
		if (isNotEmpty(source)) {
			return source.replaceAll("[\\ud800\\udc00-\\udbff\\udfff\\ud800-\\udfff]", "");
		} else {
			return source;
		}
	}

	/**
	 * 将listMap中的key转成小写
	 * 
	 * @param list
	 * @return
	 */
	public static List<Map<String, Object>> listMap2LowerCase(List<Map<String, Object>> list) {
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		Map<String, Object> temp = null;
		if (list != null && list.size() > 0) {
			for (Map<String, Object> map : list) {
				temp = new HashMap<String, Object>();
				for (String key : map.keySet()) {
					temp.put(key.toLowerCase(), map.get(key));
				}
				result.add(temp);
			}
		}
		return result;
	}

	/**
	 * 获取异常详细信息
	 * 
	 * @param e
	 * @return
	 */
	public static String getExceptionDetailMsg(Exception e) {
		if (e == null)
			return "";
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		e.printStackTrace(new PrintStream(outStream));
		String exceptionMsg = outStream.toString();
		if (exceptionMsg.length() > 1024) {
			exceptionMsg = exceptionMsg.substring(0, 1024) + "......";
		}
		return exceptionMsg;
	}

	/**
	 * 获取异常详细信息
	 * 
	 * @param t
	 * @return
	 */
	public static String getExceptionDetailMsg(Throwable t) {
		if (t == null)
			return "";
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		t.printStackTrace(new PrintStream(outStream));
		String exceptionMsg = outStream.toString();
		if (exceptionMsg.length() > 1024) {
			exceptionMsg = exceptionMsg.substring(0, 1024) + "......";
		}
		return exceptionMsg;
	}

	/**
	 * 验证是否为有效token 1、不为空 2、位数为44位 3、可使用key解密
	 * 
	 * @return
	 */
	public static boolean validToken(String token) {
		boolean result = false;
		if (isNotEmpty(token)) {
			if (token.length() == 64) {
				token = token.replaceAll(" ", "+");
				try {
					AESCipher.aesEncryptString(token);
					result = true;
				} catch (Exception e) {

				}
			}
		}
		return result;
	}

	public static String defaultString(Object str) {
		if (str == null) {
			return "";
		}
		if (str.toString().trim().toLowerCase().equals("null")) {
			return "";
		}
		return str.toString().trim();
	}

	public static String combineString(String str) {
		if (str == null) {
			return null;
		}
		return "'" + str.trim() + "'";
	}

	public static int combineInt(String str) {
		int scount = 0;
		if (str == null) {
			str = "0";
		}
		try {
			scount = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			scount = 0;
		}
		return scount;
	}

	public static int combineInt(Object tstr) {
		String str = defaultString(tstr);
		return str.equals("") ? 0 : combineInt(str);
	}

	public static String combineDate(Date date) {
		if (date == null) {
			return null;
		}
		return "'" + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date)) + "'";
	}

	public static Date combineDate(String date, String format) {
		if (date == null) {
			return null;
		}
		try {
			return new SimpleDateFormat(format).parse(date);
		} catch (ParseException e) {
		}
		return null;
	}

	public static String convertDateToString(Date date) {
		if (date == null)
			return null;
		return sdfymd.format(date);
	}

	/**
	 * JSON格式，针对Easyui前台的返回值
	 * 
	 * @param result
	 * @param resMsg
	 * @param objs
	 * @return
	 */
	public static Map<String, Object> getResult(int result, String resMsg, Object objs) {
		if (objs == null)
			objs = "[]";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("errCode", result);
		map.put("resMsg", resMsg);
		map.put("objs", objs);
		return map;
	}

	public static Map<String, Object> getResult(int result, String resMsg) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("errCode", result);
		map.put("resMsg", resMsg);
		return map;
	}

	/**
	 * JSON格式，针对EasyUI
	 * 
	 * @param result
	 * @param resMsg
	 * @param total
	 * @param objs
	 * @return
	 */
	public static Map<String, Object> getListResult(int result, String resMsg, int total, Object objs) {
		if (objs == null)
			objs = "[]";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("errCode", result);
		map.put("resMsg", resMsg);
		map.put("total", total);
		map.put("rows", objs);
		return map;
	}

	/**
	 * JSON格式，针对EasyUI Combobox
	 * 
	 * @param result
	 * @param resMsg
	 * @param total
	 * @param objs
	 * @return
	 */
	public static Object getResult(Object objs) {
		if (objs == null) {
			objs = "[]";
		}
		if (objs instanceof List) {
			return ((List) objs).toArray();
		}
		return "[]";
	}

	/**
	 * 对字符串md5加密
	 *
	 * @param str
	 * @return
	 */
	public static String getMD5(String str) {
		// 生成一个MD5加密计算摘要
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			// 计算md5函数
			md.update(str.getBytes());
			// digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
			// BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
			return new BigInteger(1, md.digest()).toString(16);
		} catch (NoSuchAlgorithmException e) {
			return null;
		}
	}
	
	/**
	 * 判断对象是否为空，不为空返回true
	 * @param obj
	 * @return
	 */
	public static boolean validObjectEmpty(Object obj){
		if(obj != null && !"".equals(obj)){
			return true;
		}else{
			return false;
		}
	}
}