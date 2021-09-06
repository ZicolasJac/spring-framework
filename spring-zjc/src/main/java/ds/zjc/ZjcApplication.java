package ds.zjc;

import ds.zjc.entity.Brand;
import ds.zjc.service.BrandService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = ZjcApplication.class)
public class ZjcApplication implements BeanFactoryAware {

	private static BeanFactory beanFactory1;

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ZjcApplication.class);

		System.out.println("bean数量:" + context.getBeanDefinitionCount());
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println("bean名称:" + beanName);
		}

		Brand brand = (Brand) beanFactory1.getBean("zjc-brand");
		System.out.println(brand.getBrandName());

		BrandService brandService = context.getBean(BrandService.class);
		Brand one = brandService.findOne();
		System.out.println(one.toString());
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		beanFactory1 = beanFactory;
	}
}
