package com.lcx.vo;



public class ArticleVO {
	
	private String d1;
	private String d2;
	private String a1;
	private String a2;
	public ArticleVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArticleVO(String d1, String d2, String a1, String a2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
		this.a1 = a1;
		this.a2 = a2;
	}
	@Override
	public String toString() {
		return "ArticleVO [d1=" + d1 + ", d2=" + d2 + ", a1=" + a1 + ", a2=" + a2 + "]";
	}
	public String getD1() {
		return d1;
	}
	public void setD1(String d1) {
		this.d1 = d1;
	}
	public String getD2() {
		return d2;
	}
	public void setD2(String d2) {
		this.d2 = d2;
	}
	public String getA1() {
		return a1;
	}
	public void setA1(String a1) {
		this.a1 = a1;
	}
	public String getA2() {
		return a2;
	}
	public void setA2(String a2) {
		this.a2 = a2;
	}
	
	


}