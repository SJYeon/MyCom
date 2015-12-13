package com.mycom.basis;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

/**
 * md5加密程序
 * @author Fu
 */
public class MD5 {
	
		public static String md5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
			MessageDigest md = MessageDigest.getInstance("MD5");
			BASE64Encoder ba64en = new BASE64Encoder();
			String newstr = ba64en.encode(md.digest(str.getBytes("utf-8")));
			return newstr;
		}
}
