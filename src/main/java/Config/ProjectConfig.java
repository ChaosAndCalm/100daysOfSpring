package Config;

import beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public MyBean myBean(){
        MyBean b1 = new MyBean();
        b1.setText("Hello");
        return b1;
    }
}
