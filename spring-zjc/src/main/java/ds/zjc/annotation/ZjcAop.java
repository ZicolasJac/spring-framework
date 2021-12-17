package ds.zjc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * desc
 *
 * @author zjc
 * @since 2021/12/17 11:29
 */
@Retention(RUNTIME)
@Documented
@Target({METHOD})
public @interface ZjcAop {
}
