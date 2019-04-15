package com.library.action;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import com.woniuxy.bean.User;

//负责处理前端消息的类

public class testAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private User user;
	private File file;
	private String fileContentType;
	private String fileFileName;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String register() throws IOException {
		System.out.println("hhhhhhhhh");
		System.out.println(user);
//		System.out.println(fileFileName);
		
	
		 
/*		String path = ServletActionContext.getServletContext().getRealPath("/images");
				System.out.println(path+"-----");
				File file = new File(path);
				//检查文件夹是否存在，不存在则创建
				if (file.exists()){
			
				file.mkdirs();
				}
				//保存文件
				File newFile = new File(file, this.fileFileName);
				System.out.println(newFile);
				FileUtils.copyFile(this.file, newFile);*/
				return "success";
	}

}
