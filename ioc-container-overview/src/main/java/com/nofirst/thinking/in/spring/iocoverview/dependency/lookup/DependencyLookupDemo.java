package com.nofirst.thinking.in.spring.iocoverview.dependency.lookup;

import com.nofirst.thinking.in.spring.iocoverview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖查找示例
 */
public class DependencyLookupDemo {

    public static void main(String[] args) {
        // 配置 xml 文件
        // 启动 spring 上下文
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup-context.xml");
        User user = (User) beanFactory.getBean("user");
        System.out.println(user);
    }
}
