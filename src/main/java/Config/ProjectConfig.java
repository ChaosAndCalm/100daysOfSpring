package Config;

import beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.management.MXBean;

@Configuration
public class ProjectConfig {

    @Bean
    public MyBean myBean(){
        MyBean b1 = new MyBean();
        b1.setText("Hello");
        return b1;
    }

    @Bean
    public MyBean myBean2(){
        MyBean b2 = new MyBean();
        b2.setText("World");
        return b2;
    }
}
