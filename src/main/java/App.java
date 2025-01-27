import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW1 =
                (HelloWorld) applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld beanHW2 =
                (HelloWorld) applicationContext.getBean("helloworld", HelloWorld.class);

        Cat beanCat1 = (Cat) applicationContext.getBean("cat", Cat.class);
        Cat beanCat2 = (Cat) applicationContext.getBean("cat", Cat.class);

        System.out.print("Результат сравнения HelloWorld: ");
        System.out.println(beanHW1 == beanHW2);
        System.out.print("Результат сравнения Cat: ");
        System.out.println(beanCat1 == beanCat2);
    }
}