package ds.zjc;

import ds.zjc.conf.BeanConfig;
import ds.zjc.entity.Brand;
import ds.zjc.service.BrandService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解配置类应用
 *
 * @author zjc
 * @since 2021/9/15 16:19
 */
public class ZjcAnnotationConfigApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("bean数量:" + context.getBeanDefinitionCount());
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println("bean名称:" + beanName);
		}

		Brand brand = (Brand) context.getBean("zjc-brand");
		if (brand != null) {
			System.out.println(brand.getBrandName());
			BrandService brandService = context.getBean(BrandService.class);
			// 第一步
			Brand one = brandService.findOne();
			System.out.println(one.toString());
			brandService.printProcess();

			// 第二步
			brandService.addSomeSite();
			int siteNum = brandService.getSiteNum();
			System.out.println("站点数量:" + siteNum);
		}
	}
}
