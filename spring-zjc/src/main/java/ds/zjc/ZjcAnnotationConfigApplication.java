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
		System.out.println("根路径:" + ZjcAnnotationConfigApplication.class.getClassLoader().getResource("").getPath());
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("bean数量:" + context.getBeanDefinitionCount());
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println("bean名称:" + beanName);
		}

		// 第一步
		Brand brand1 = (Brand) context.getBean("brand-hongQi");
		System.out.println(brand1.toString());

		// 第二步
		BrandService brandService = context.getBean(BrandService.class);
		Brand brand2 = brandService.findOne();
		System.out.println(brand2.toString());

		// 第三步
		brandService.printProcess();

		// 第四步
		brandService.addSomeSite();

		// 第五步
		int siteNum = brandService.getSiteNum();
		System.out.println("站点数量:" + siteNum);
	}
}
