package com.hzl.web.quartz;

import java.util.Date;

public class Job2 {

    public void execute() {
        System.out.println(new Date() + " -> Hello, 我是任务 2");
    }
}