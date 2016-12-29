package io.swagger.api;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-12-29T11:48:52.770-05:00")
public class ApiException extends Exception{
	private int code;
	public ApiException (int code, String msg) {
		super(msg);
		this.code = code;
	}
}
