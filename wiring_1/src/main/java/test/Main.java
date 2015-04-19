package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		MrBean myBean = (MrBean)ctx.getBean("yoBean");
		System.out.println(myBean.getName());

	}

}


class MrBean
{
	private String m_name;
	public MrBean(String name)
	{
		m_name = name;
	}
	
	public String getName()
	{
		return m_name;
	}
}
