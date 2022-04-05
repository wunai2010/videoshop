package com.wunai.result;

/**
 * @author
 */
public enum ErrorCode {
	EC0001("-100", "登录超时"),
	EC200("0", "success");

	private String code;
	private String describe;

	ErrorCode(String code, String describe) {
		this.code = code;
		this.describe = describe;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}
}