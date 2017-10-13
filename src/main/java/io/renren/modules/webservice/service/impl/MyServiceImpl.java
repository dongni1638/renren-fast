package io.renren.modules.webservice.service.impl;

/**
 * Created by Icebery on 2017/10/10.
 */
import io.renren.modules.webservice.service.MyService;

import javax.jws.WebService;
/**
 * 实现类
 * @author Administrator
 *对外开放的接口实现类，同样需要@WebService注解,如果该类同时实现了其他接口
 *则必须加上endpointInterface参数指定接口
 *targetNamespace指定targetNamespace 待会儿在调用的时候会使用
 */
@WebService//(endpointInterface = "io.renren.modules.webservice.service.MyService",targetNamespace="www.baidu.com")
public class MyServiceImpl implements MyService {
    @Override
    public int add(int x, int y) {
        System.out.println(x + "+" + y + "=" + (x + y));
        return x + y;
    }
    @Override
    public int dec(int x, int y) {
        System.out.println(x + "-" + y + "=" + (x - y));
        return x - y;
    }
}