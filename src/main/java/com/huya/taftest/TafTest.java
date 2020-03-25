package com.huya.taftest;

import com.huya.taf.client.Communicator;
import com.huya.taf.client.CommunicatorConfig;
import com.huya.taf.client.CommunicatorFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author saikei
 * @email lishiji@huya.com
 */
@Controller
public class TafTest {

    private String objName = "TestApp.HelloServer.HelloObj@";
    // 从本地启动的配置
    private CommunicatorConfig cfg = new CommunicatorConfig();
    // 从本地启动的Communcator
    private Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);

    @RequestMapping("invoke")
    @ResponseBody
    public String invoke(String ip, String port) throws InterruptedException {
        String connectInfo = "tcp -h " + ip + " -p " + port + " -t 3000";
        objName = objName + connectInfo;
        System.out.println(objName);
        //warn 若是部署在tars平台启动的， 只能使用下面的构造器获取communcator
        //Communicator communicator = CommunicatorFactory.getInstance().getCommunicator();
        HelloPrx proxy = communicator.stringToProxy(HelloPrx.class, objName);

        //同步调用
        return proxy.hello();


    }
}
