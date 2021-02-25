import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication(scanBasePackages={"com.swhy"})
@MapperScan(value = {"com.swhy.infrastructure"})
public class Application {
    private static  ApplicationContext ac;

    public static void main(String[] args) {
        ConfigurableApplicationContext ca = SpringApplication.run(Application.class, args);

        ac =ca;
        List<String> beanNames = Arrays.asList(ca.getBeanFactory().getBeanDefinitionNames());
        for(String names:beanNames){

        }
    }

    public  static ApplicationContext getContext(){
        return ac;
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//        };
//    }

}
