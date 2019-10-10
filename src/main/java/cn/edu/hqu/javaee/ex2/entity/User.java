package cn.edu.hqu.javaee.ex2.entity;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.springframework.lang.NonNull;

import lombok.Getter;
import lombok.Setter;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1908164516863052459L;
	private Integer id;
	@NotNull
	private String username;
	@NotNull
	 @Length(min = 5, max = 10, message = "The length of the password must be between 5 and 10 bits")
	private String password;
	  @Range(min = 0, max = 100, message = "Age must be between 0 and 100 years old")
	private Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	
}