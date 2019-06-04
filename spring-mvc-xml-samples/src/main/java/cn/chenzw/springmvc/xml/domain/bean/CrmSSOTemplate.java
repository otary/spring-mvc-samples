package cn.chenzw.springmvc.xml.domain.bean;

import cn.chenzw.springmvc.xml.support.SSO;


/**
 * 自定义单点类
 *
 * @author chenzw
 */
@SSO(source = {"fz_crm", "fz_oa"})
public class CrmSSOTemplate  {


    public void test(){
        System.out.println("-----------------");
    }

}
