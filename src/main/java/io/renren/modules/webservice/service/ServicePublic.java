package io.renren.modules.webservice.service;

/**
 * Created by Icebery on 2017/10/10.
 */
import io.renren.modules.webservice.service.impl.MyServiceImpl;

import javax.xml.ws.Endpoint;
/**
 * 发布接口
 * @author LM
 */
public class ServicePublic {
    public static void main(String[] args)  throws Exception
    {
        System.out.println("Test 123");
//这里有一个前提 是8083端口没有被占用着  如果8083在占 就换一个
        Endpoint.publish("http://localhost:9002/wcms/MyService", new MyServiceImpl());
    }
}
