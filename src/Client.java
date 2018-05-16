

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;
import com.dao.EmpDao;

public class Client {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account No : ");
		int acc=sc.nextInt();
		ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");
		EmpDao dao = (EmpDao) context.getBean("empDaoBean");
		Employee e=dao.selectEmployee(acc);
		System.out.println(e.getAmount());
	}
}