package com.xiaohei.model;

import org.springframework.web.servlet.ModelAndView;

public class RegisterCode {
    String result;
    ModelAndView ret;
	public ModelAndView getRet() {
		return ret;
	}

	public void setRet(ModelAndView ret) {
		this.ret = ret;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
