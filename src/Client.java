import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.People;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        String[] names = ac.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }
//        People people = People.getInstance();
//        People people1 = People.getInstance();
//
//        System.out.println(people==people1);
    }
}
