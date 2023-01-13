import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld tree = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(tree.getMessage());
        HelloWorld leaf = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Переменные ссылаются на один и тот же объект?"+(tree==leaf));
        System.out.println(tree);
        System.out.println(leaf);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Cat one = context.getBean("myCat", Cat.class);
        Cat two = context.getBean("myCat", Cat.class);
        System.out.println("Переменные ссылаются на один и тот же объект?" + (one == two));
        System.out.println(one);
        System.out.println(two);

    }
}