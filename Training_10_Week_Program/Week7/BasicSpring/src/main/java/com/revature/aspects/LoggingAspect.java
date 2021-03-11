package com.revature.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component(value = "loggingAspect")
public class LoggingAspect {

	private static final Logger LOG = LogManager.getLogger(LoggingAspect.class);
	
	@Pointcut("within(com.revature.controller.FlightController)")
	public void controllerLog() {
		
	}
	
	@Before(value = "controllerLog()")
	public void hitEndpointLogs(JoinPoint jp) {
		LOG.error("The " + jp.getSignature().getName() + " was called.");
	}
}
