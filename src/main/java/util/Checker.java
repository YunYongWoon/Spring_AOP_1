package util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class Checker {
    @Around("execution(* service.*Service.*(..))")
    public void timeChecker(ProceedingJoinPoint joinPoint) throws Throwable{
        StopWatch stopwatch = new StopWatch("MeasureTime");
        stopwatch.start();
        joinPoint.proceed();
        stopwatch.stop();

        // 수행된 메소드의 이름을 가져오는 메소드
        String methodName =joinPoint.getSignature().getName();
        System.out.println(stopwatch.prettyPrint());
    }
}