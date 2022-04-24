package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//어노테이션 추가
@Configuration
@ConfigurationProperties(prefix = "database")
public class Database {
	

	// 변수 추가
	private String ip;
	private String port;
	private String username;
	private String password;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
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
	
	@Override
	public String toString() {
		return "Database [ip=" + ip + ", port=" + port + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	// 마우스 우클릭 > [Source] > Generate Getters and Setters > [Select All] > [Generate]
	// 마우스 우클릭 > [Source] > Generate toString()... > [Generate]

	// Ctrl + Shift + o 로 Library Import 
}
