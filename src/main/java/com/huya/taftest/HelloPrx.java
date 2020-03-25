package com.huya.taftest;

import com.huya.taf.protocol.annotation.Servant;

/**
 * @author saikei
 * @email lishiji@huya.com
 */
@Servant
public interface HelloPrx {
    String hello();
}
