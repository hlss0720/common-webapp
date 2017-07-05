package com.unionpay.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LogAspect {

	@Around("execution(* com.unionpay.service.*.*(..))")
	public Object logAround(ProceedingJoinPoint jp) {
		Object result = null;
		try {
			Logger log = LoggerFactory.getLogger(jp.getTarget().getClass());
			Object[] args = jp.getArgs();
			log.info("请求报文{} ", args);
			result = jp.proceed(args);
			log.info("响应报文 {} ", result);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return result;
	}
}
