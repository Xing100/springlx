package demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Demo2 {
    //定义Demo3类型属性
    //不需要添加set方法
    //添加注入属性注解
    @Autowired
    private Demo3 demo3;
    public void add(){
        System.out.println("demo2");
        demo3.add();
    }
}
