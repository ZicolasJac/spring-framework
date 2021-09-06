package ds.zjc.service.impl;

import ds.zjc.entity.Brand;
import ds.zjc.service.BrandService;
import org.springframework.stereotype.Service;

/**
 * desc
 *
 * @author zjc
 * @since 2021/9/2 19:46
 */
@Service
public class BrandServiceImpl implements BrandService {

	@Override
	public Brand findOne() {
		Brand brand = new Brand();
		brand.setBrandName("吉利汽车");
		brand.setBrandCode("jl-car");
		return brand;
	}
}
