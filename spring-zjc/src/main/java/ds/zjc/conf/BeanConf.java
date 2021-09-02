package ds.zjc.conf;

import ds.zjc.entity.Brand;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConf {

	@Bean("zjc-brand")
	public Brand getBrand() {
		return new Brand();
	}
}
