
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main { public static void main(String[] args)
    {
        System.out.println( "Hello World!" );
       ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
       Student stud=(Student) ctx.getBean("student1");
        System.out.println(stud);

//
    }
}
