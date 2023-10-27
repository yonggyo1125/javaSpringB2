package exam02.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Order(2)
@Aspect
public class ProxyCalculator {


    //@Around("publicTarget()")
    //@Around("execution(* exam02.aopex..*(..))")
    @Around("CommonPointcut.publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        long stime = System.nanoTime();

        try {
            Object result = joinPoint.proceed(); // factorial(..) - 핵심 기능(대신 수행)

            return result;
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린시간 : %d%n", etime - stime);
        }
    }
}
