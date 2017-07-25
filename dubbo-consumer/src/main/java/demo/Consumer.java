package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by liuzhilei on 2017/7/25.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        System.out.println("consumer start...");
        DemoService demoService = (DemoService) context.getBean("consumer-service");
        List<String> userList = demoService.getUserList(1l);
        System.out.println(userList);

        System.out.println("end...");
    }
}
