package io.renren.modules.webservice.service;

/**
 * Created by Icebery on 2017/10/11.
 */
public class TestWs {
    public static void main(String[] args){
        Function fu;
        fu=new Function();
        String str=fu.transWords("I Love Lee!");
        System.out.println(str);
    }
}
