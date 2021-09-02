package ds.zjc;

import ds.zjc.entity.Brand;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = ZjcApplication.class)
public class ZjcApplication implements BeanFactoryAware {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ZjcApplication.class);

		System.out.println("bean数量:" + context.getBeanDefinitionCount());
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println("bean名称:" + beanName);
		}
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		Brand a = beanFactory.getBean(Brand.class);
		System.out.println("bdfvdfv:" + a == null);
	}
}
