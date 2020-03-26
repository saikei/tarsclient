package com.huya.taftest.prx;

import com.huya.taf.protocol.annotation.Servant;

/**
 * @author saikei
 * @email lishiji@huya.com
 */
@Servant
public interface HelloPrx {
    String hello();

    String sorry();
}
