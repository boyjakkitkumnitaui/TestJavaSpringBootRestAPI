package com.testjavaspringbootgradle.testjavaspringbootgradle;

public class Getdata {
    private final long id;
    private final String content;

	public Getdata(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
