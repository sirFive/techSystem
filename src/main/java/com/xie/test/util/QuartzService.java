package com.xie.test.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class QuartzService {

	public void showTime() {
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd HH:mm:SS");
		System.out.println("定时任务："+sdf.format(new Date()));
	}
}
