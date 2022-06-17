package utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author by pepsi-wyl
 * @date 2022-06-15 9:51
 */

public class ApplicationContextUtils {

    /**
     * xml方式获取Spring配置文件
     */
    //默认
    public static ApplicationContext getApplicationContext() {
        return new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    //自定义
    public static ApplicationContext getApplicationContext(String xmlName) {
        return new ClassPathXmlApplicationContext(xmlName + ".xml");
    }

}