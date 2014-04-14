package org.csystem.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CalculatorLoggingAspect {
	//private Log log = LogFactory.getLog(this.getClass());

	@Before("execution(* ArithmeticCalculator.sub(..))")
	public void logBefore() {
		//log.info("The method add() begins");
           System.out.println("cikarmadan cagrildi");
	}
	@After("execution(* ArithmeticCalculator.div(..))")
	public void logAfter() {
		//log.info("The method add() begins");
           System.out.println("bolmeden sonra cagrildi..");
	}
}

