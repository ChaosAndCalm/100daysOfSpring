import Config.ProjectConfig;
import beans.MyBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

    /*
        Xml
        Annotations
     */
    public static void main(String[] args){
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){

            MyBean b1 = context.getBean(MyBean.class);
            System.out.println(b1.getText());
        }
    }
}
