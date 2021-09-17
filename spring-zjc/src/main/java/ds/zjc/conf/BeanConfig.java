package ds.zjc.conf;

import ds.zjc.ZjcAnnotationConfigApplication;
import ds.zjc.ZjcXmlConfigApplication;
import ds.zjc.conf.selector.BeanImportSelector;
import ds.zjc.entity.Brand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@Import(value = BeanImportSelector.class)
@ComponentScan(basePackageClasses = {ZjcXmlConfigApplication.class, ZjcAnnotationConfigApplication.class})
@PropertySource(encoding = "utf-8", value = {"classpath:/application.properties", "classpath:/application.yml"})
public class BeanConfig {

	@Value("${hongQi.name:default}")
	private String hongQiName;

	@Value("${hongQi.code:default}")
	private String hongQiCode;

	@Bean("brand-hongQi")
	public Brand getBrand() {
		Brand brand = new Brand();
		brand.setBrandName(hongQiName);
		brand.setBrandCode(hongQiCode);
		return brand;
	}
}
