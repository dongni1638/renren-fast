package io.renren.modules.job.task;

/**
 * Created by Icebery on 2017/10/10.
 */
import java.text.SimpleDateFormat;

import java.util.Date;

import io.renren.modules.jiank.service.YdjyJiankong;
import io.renren.modules.webservice.service.Function;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

@Component("test1")
public class Test1 {
    public void execute(String params) throws JobExecutionException {
       //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        //System.out.println("我是带参数的test方法，正在被执行，参数为：" + params);
        System.out.println("这是测试webservice服务：开始测试！！！");
        YdjyJiankong yy;
        yy=new YdjyJiankong();
        yy.ydjyjy();
        System.out.println("定时发送了异地就医模拟交易！！！");



/*        Function fu;
        fu=new Function();
        String str=fu.transWords("wangbo");
        System.out.println(str);*/
    }

}
