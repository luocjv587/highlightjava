package com.luocj.demo.ch3.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Service;

@Service
public class WindowCondition implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata){
        return context.getEnvironment().getProperty("os.name").contains("Windows");
    }
}
