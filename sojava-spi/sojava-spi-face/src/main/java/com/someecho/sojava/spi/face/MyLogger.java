package com.someecho.sojava.spi.face;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-09
 * 这个就是 SPI ， 服务提供者接口，后面的服务提供者就要针对这个接口进行实现
 */
public interface MyLogger {
    void info(String msg);
    void debug(String msg);
}
