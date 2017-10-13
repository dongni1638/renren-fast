package io.renren.modules.jiank.service;

import io.renren.modules.webservice.service.Function;

/**
 * Created by Icebery on 2017/10/11.
 */
public class YdjyJiankong {
    public void ydjyjy(){
        System.out.println("异地就医模拟交易监控：");
        Function fu;
        fu = new Function();
        String str = fu.transWords("wangbo");
        System.out.println(str);
        if(str.equals("1")){
            System.out.println("异地就医服务正常！！！");
        }else{
            System.out.println("异地就医服务异常！！！");
        }
    }
}
