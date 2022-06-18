package com.codetech.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.codetech.bean.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
        FileSystemResource res=new FileSystemResource("src/com/codetech/cfg/applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(res);
        Object obj=factory.getBean("wmg");
        WishMessageGenerator generator=(WishMessageGenerator)obj;
        String result=generator.generateWishMessage("Nitin");
        System.out.println(result);
    }

}
