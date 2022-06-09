package demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//在注解里面value属性值可以省略不写
//默认值是类名称，首字母小写
//Demo3  --  demo3
@Component
public class Demo3 {
    public void add(){
        System.out.println("demo3");
        System.out.println("使用注解方式创建对象");
    }

}

