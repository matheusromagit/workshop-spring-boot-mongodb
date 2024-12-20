package com.matheusromagit.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long timestamp;
	private Integer status;
	private String eror;
	private String message;
	private String path;

	public StandardError() {
		super();
	}

	public StandardError(Long timestamp, Integer status, String eror, String message, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.eror = eror;
		this.message = message;
		this.path = path;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getEror() {
		return eror;
	}

	public void setEror(String eror) {
		this.eror = eror;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
