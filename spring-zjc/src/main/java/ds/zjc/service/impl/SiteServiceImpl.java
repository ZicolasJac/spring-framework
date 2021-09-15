package ds.zjc.service.impl;

import ds.zjc.entity.Site;
import ds.zjc.service.SiteService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * desc
 *
 * @author zjc
 * @since 2021/9/15 14:21
 */
@Service
public class SiteServiceImpl implements SiteService {

	private static Map<String, Site> siteMap = new HashMap<>();

	@Override
	public Boolean saveSite(Site site) {
		System.out.println("新增了一个站点:" + site.getSiteName());
		siteMap.put(site.getSiteName(), site);
		return true;
	}

	@Override
	public int getSiteNum() {
		return siteMap.size();
	}
}
