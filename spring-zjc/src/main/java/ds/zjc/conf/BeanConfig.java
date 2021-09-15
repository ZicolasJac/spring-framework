package ds.zjc.conf;

import ds.zjc.ZjcAnnotationConfigApplication;
import ds.zjc.ZjcXmlConfigApplication;
import ds.zjc.conf.selector.BeanImportSelector;
import ds.zjc.entity.Brand;
import org.springframework.context.annotation.*;

@Configuration
@Import(value = BeanImportSelector.class)
@ComponentScan(basePackageClasses = {ZjcXmlConfigApplication.class, ZjcAnnotationConfigApplication.class})
public class BeanConfig {

	@Bean("zjc-brand")
	public Brand getBrand() {
		Brand brand = new Brand();
		brand.setBrandName("svsdv哈哈哈哈");
		return brand;
	}
}
