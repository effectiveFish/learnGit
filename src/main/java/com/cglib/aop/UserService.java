package com.cglib.aop;

import lombok.extern.slf4j.Slf4j;

/**
 * @author chenshun00@gmail.com
 * @since 2018/9/13
 */
@Slf4j
public class UserService {
    public void addUser(){
        log.debug("add user");
    }
}
