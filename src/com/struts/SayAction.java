package com.struts;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class SayAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("Hello world!");
		return "hello";
	}
}
