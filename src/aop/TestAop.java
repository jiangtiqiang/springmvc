package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAop {  
    public static void main(String args[]){          
        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:/git/springmvc/src/aop/aop.xml");
         BuyBook b = (BuyBook)ctx.getBean("newBuyBook");  
         b.buyBook("小东", "《楚留香》");
         b.buyBook("小东", "《楚留香2》");  
         System.out.println("baidu");
    }  
}  