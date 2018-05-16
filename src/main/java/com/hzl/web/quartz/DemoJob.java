package com.hzl.web.quartz;

import com.hzl.web.service.impl.DemoService;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;

@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class DemoJob implements Job {

    private String jobArg;

    @Autowired
    DemoService demoService;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        demoService.hello(jobArg);
    }

    public void setJobArg(String jobArg) {
        this.jobArg = jobArg;
    }
}

