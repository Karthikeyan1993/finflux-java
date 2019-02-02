package com.finflux.challenge.payload;

public class ApiResponse {
	private Object data;
	private boolean flag;
	private String messgage;

	public ApiResponse() {
		super();
	}

	public ApiResponse(Object data, boolean flag, String messgage) {
		super();
		this.data = data;
		this.flag = flag;
		this.messgage = messgage;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getMessgage() {
		return messgage;
	}

	public void setMessgage(String messgage) {
		this.messgage = messgage;
	}

}
