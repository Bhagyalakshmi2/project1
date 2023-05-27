package basics1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;



public class Testcar
{
	public static void main(String[] args) 
	{
	
	//creating the object by using BeanFactory
//ClassPathResource resource=new ClassPathResource("ioc2.xml");
//BeanFactory beanFactory=new XmlBeanFactory(resource);
//car c=(car) beanFactory.getBean("mycar");
//c.disp();
	
	
	//creating the object by using Application context interface
	ApplicationContext context=new  ClassPathXmlApplicationContext("ioc2.xml");
	car c1= (car) context.getBean("mycar");
	c1.disp();

}

}
