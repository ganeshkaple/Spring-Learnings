package com.example.schedulingtasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {
	private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTasks.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		LOGGER.info(String.format("The current time is %s", dateFormat.format(new Date())));
	}

}
