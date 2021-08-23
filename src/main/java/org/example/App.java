package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml"); // new XmlBeanFactory()
        Component component = (Component) factory.getBean("component");
       component.print();
    }
}
