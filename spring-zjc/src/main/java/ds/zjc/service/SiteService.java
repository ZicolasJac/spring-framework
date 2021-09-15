package ds.zjc.service;

import ds.zjc.entity.Site;

/**
 * desc
 *
 * @author zjc
 * @since 2021/9/14 20:07
 */
public interface SiteService {

	Boolean saveSite(Site site);

	int getSiteNum();
}
