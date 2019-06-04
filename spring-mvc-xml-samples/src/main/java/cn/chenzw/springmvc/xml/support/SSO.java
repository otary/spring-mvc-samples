package cn.chenzw.springmvc.xml.support;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于自定义扩展单点处理
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SSO {

    /**
     * 来源系统
     * @return
     */
    String[] source();
}
