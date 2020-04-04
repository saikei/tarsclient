package com.huya.taftest.prx;


import com.qq.tars.protocol.annotation.Servant;

/**
 * @author saikei
 * @email lishiji@huya.com
 */
@Servant
public interface HelloPrx {
    String hello();

    String sorry();
}
