package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserForm {
	
	@NotBlank(message = "値を入力してください")
	private String name;
	
	@NotNull(message = "値を入力してください")
	private Integer age;
	
	@NotBlank(message = "値を入力してください")
	private String comment;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "UserForm [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}
	
	
}
