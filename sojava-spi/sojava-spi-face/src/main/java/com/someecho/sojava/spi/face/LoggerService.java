package com.someecho.sojava.spi.face;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-09
 */
public class LoggerService {

    private static final LoggerService SERVICE = new LoggerService();

    private final MyLogger logger;

    private final List<MyLogger> loggerList;

    private LoggerService() {
        ServiceLoader<MyLogger> loader = ServiceLoader.load(MyLogger.class);
        List<MyLogger> list = new ArrayList<>();
        for (MyLogger log : loader) {
            list.add(log);
        }
        // LoggerList 是所有 ServiceProvider
        loggerList = list;
        if (!list.isEmpty()) {
            // MyLogger 只取一个
            logger = list.get(0);
        } else {
            logger = null;
        }
    }

    public static LoggerService getService() {
        return SERVICE;
    }

    public void info(String msg) {
        if (logger == null) {
            System.out.println("info 中没有发现 MyLogger 服务提供者");
        } else {
            logger.info(msg);
        }
    }

    public void debug(String msg) {
        if (loggerList.isEmpty()) {
            System.out.println("debug 中没有发现 MyLogger 服务提供者");
        }
        loggerList.forEach(log -> log.debug(msg));
    }
}
