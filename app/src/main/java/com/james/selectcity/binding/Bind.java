package com.james.selectcity.binding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * Created by    https://github.com/james-gan
 * Date : 2019/5/16
 *

 * To do :自定义注解
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Bind {
    int value();
}
