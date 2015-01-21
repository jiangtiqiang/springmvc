package aop;

public class BuyBookImpl implements BuyBook{  
    public void buyBook(String customer,String book) {        
        System.out.println(customer+"你好！你成功购了一本"+book+"!");  
    }  
} 