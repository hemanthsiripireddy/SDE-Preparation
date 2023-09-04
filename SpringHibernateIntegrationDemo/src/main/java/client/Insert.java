package client;

import org.springframework.context.ApplicationContext;

import context.ContextProvider;
import dao.StudentDao;
import entity.Student;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= ContextProvider.provideContext();
		StudentDao studentDao= ctx.getBean("stDao",StudentDao.class);
		Student s=new Student(2,"suresh");
		studentDao.insert(s);

	}

}
