package com.bvr;

public class SecondSampleBean {

	public SecondSampleBean() {
		// TODO Auto-generated constructor stub
	}
	
	public SecondSampleBean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
	
	private String message;
	
public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Second sample bean" +message;
}

}
