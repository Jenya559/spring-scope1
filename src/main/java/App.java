import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld tree = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(tree.getMessage());
        HelloWorld leaf = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Переменные ссылаются на один и тот же объект?" + (tree == leaf));
        System.out.println(tree);
        System.out.println(leaf);
        Cat one = (Cat) applicationContext.getBean("cat");
        Cat two = (Cat) applicationContext.getBean("cat");
        System.out.println("Переменные ссылаются на один и тот же объект?" + (one == two));
        System.out.println(one);
        System.out.println(two);

    }
}