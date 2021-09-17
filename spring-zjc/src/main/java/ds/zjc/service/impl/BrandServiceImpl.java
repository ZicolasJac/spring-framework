package ds.zjc.service.impl;

import ds.zjc.entity.Brand;
import ds.zjc.entity.Site;
import ds.zjc.service.BrandService;
import ds.zjc.service.SiteService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;


/**
 * desc
 *
 * @author zjc
 * @since 2021/9/2 19:46
 */
@Service
public class BrandServiceImpl implements BrandService, ApplicationContextAware {

	@Value("${brand.service.operator:default}")
	private String operator;

	@Value("${brand.service.sign:default}")
	private String sign;

	private SiteService siteService;

	@Autowired
	public void setSiteService(SiteService siteService) {
		this.siteService = siteService;
	}

	@Override
	public void printProcess() {
		System.out.println("操作人:" + operator);
		System.out.println("标志:" + sign);
		System.out.println("brand实例, 步骤:postConstruct");
	}

	@Override
	public Brand findOne() {
		Brand brand = new Brand();
		brand.setBrandName("吉利汽车");
		brand.setBrandCode("jl-car");
		return brand;
	}

	@Override
	public void addSomeSite() {
		Site site1 = new Site();
		site1.setSiteName("法国站");
		site1.setSiteAbbr("fr");
		Site site2 = new Site();
		site2.setSiteName("德国站");
		site2.setSiteAbbr("ge");
		Site site3 = new Site();
		site3.setSiteName("墨西哥站");
		Site site4 = new Site();
		site4.setSiteName("美国站");
		siteService.saveSite(site1);
		siteService.saveSite(site2);
		siteService.saveSite(site3);
		siteService.saveSite(site4);
	}

	@Override
	public int getSiteNum() {
		return siteService.getSiteNum();
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("应用名:" + applicationContext.getApplicationName());
	}
}
