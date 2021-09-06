package ds.zjc.conf;

import ds.zjc.conf.select.BeanImportSelector;
import ds.zjc.entity.Brand;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = BeanImportSelector.class)
public class BeanConfig {

	@Bean("zjc-brand")
	public Brand getBrand() {
		Brand brand = new Brand();
		brand.setBrandName("svsdv哈哈哈哈");
		return brand;
	}
}
