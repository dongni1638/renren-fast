package io.renren.modules.webservice.service;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Icebery on 2017/10/11.
 */
@WebService
public class Function {
    //该方法就是要暴露给其他应用程序调用的方法

    public String transWords(String words){
        String res="wangbo";
        if (words.equals(res)){
            res="1";
        }else{
            res="-1";
        }
/*        res=words.toUpperCase();
        for(char ch : words.toCharArray()){
            res+="\t"+ch+"\t";
        }*/
        return res;
    }

    //这里我们使用main方法来发布我们的service
    public static void  main(String[] args){
        Endpoint.publish("http://localhost:9001/Service/Function",new Function());
        System.out.println("Publish Success~");
    }
}
