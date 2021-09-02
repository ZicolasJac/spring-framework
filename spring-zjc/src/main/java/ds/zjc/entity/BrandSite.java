package ds.zjc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 张金闯
 * 品牌展示站点关系表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BrandSite implements Serializable {
	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 品牌code
	 */
	private String brandCode;

	/**
	 * 站点缩写
	 */
	private String siteAbbr;

	/**
	 * 记录插入时间
	 */
	private Date insertTime;

	/**
	 * 记录更新时间
	 */
	private Date lastUpdateTime;

	/**
	 * 删除标记(0:未删除,1:删除)
	 */
	private Byte isDel;

	private static final long serialVersionUID = 1L;
}