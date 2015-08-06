package com.imooc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class FirstListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent servletcontextevent) {
//		获取web.xml中初始化参数
		String initParam = servletcontextevent.getServletContext().getInitParameter("initParam");
//		全局变量
		servletcontextevent.getServletContext().setAttribute("noHospital", 1);
		System.out.println("contextInitialized : initParam = "+initParam);
	}

	public void contextDestroyed(ServletContextEvent servletcontextevent) {
//		销毁方法里，可以关闭数据库资源等动作
		System.out.println("contextDestroyed");
	}

}
