package cn.chenzw.springmvc.xml.support.handler;

import cn.chenzw.springmvc.xml.support.parser.SSOTemplateScanBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class SSONamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("template-scan", new SSOTemplateScanBeanDefinitionParser());
    }
}
