
import com.springcore.collections.Test;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger logger = LogManager.getLogger(Test.class);

    public static void main(String[] args)
    {
        System.out.println( "Hello World!" );
        logger.info("hey");
       ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
       Student stud=(Student) ctx.getBean("student1");
        System.out.println(stud);

//
    }
}
