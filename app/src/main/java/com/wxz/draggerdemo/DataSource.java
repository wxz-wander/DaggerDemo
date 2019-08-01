package com.wxz.draggerdemo;

public interface DataSource {
    /**
     * 创建service
     * @param service 对应的api interface
     * */
    <T> T createService(Class<T> service);
}
