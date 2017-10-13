package io.renren.modules.webservice.service;

import javax.jws.WebService;
/**
 * 接口
 * @author LM
 */
@WebService
public interface MyService {
    public int add(int x, int y);
    public int dec(int x, int y);
}