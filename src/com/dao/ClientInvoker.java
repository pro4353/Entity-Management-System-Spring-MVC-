package com.dao;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;
import com.dao.EmpDao;
public class ClientInvoker {
	public static Employee selectEmployee(int acc_no)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");
		EmpDao empdao = (EmpDao)context.getBean("empDaoBean");
		return empdao.selectEmployee(acc_no);
		
	}
	public static int updateEmployee(int amount,int acc_no)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");
		EmpDao empdao = (EmpDao)context.getBean("empDaoBean");
		return empdao.updateEmployee(amount,acc_no);
	}
}
