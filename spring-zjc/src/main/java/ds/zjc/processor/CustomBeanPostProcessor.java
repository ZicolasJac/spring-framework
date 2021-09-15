package ds.zjc.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 自定义的bean后置处理器
 *
 * @author zjc
 * @since 2021/9/15 14:02
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CustomBeanPostProcessor implements BeanPostProcessor,Ordered {

	private static int BEFORE_COUNT = 0;
	private static int AFTER_COUNT = 0;

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("即将初始化,第" + ++BEFORE_COUNT + "个bean:" + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("初始化完毕,第" + ++AFTER_COUNT + "个bean:" + beanName);
		return bean;
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
