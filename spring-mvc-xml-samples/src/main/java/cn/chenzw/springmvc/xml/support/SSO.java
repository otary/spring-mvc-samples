package cn.chenzw.springmvc.xml.support;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * �����Զ�����չ���㴦��
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SSO {

    /**
     * ��Դϵͳ
     * @return
     */
    String[] source();
}
