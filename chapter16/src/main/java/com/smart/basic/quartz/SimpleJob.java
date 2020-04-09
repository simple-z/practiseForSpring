package com.smart.basic.quartz;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class SimpleJob implements Job {
	public void execute(JobExecutionContext jobCtx)
			throws JobExecutionException {
		System.out.println(jobCtx.getTrigger().getName()
				+ " triggered. time is:" + (new Date()));
	}
}
