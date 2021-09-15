package ds.zjc.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author 品牌表
 */
@Data
public class Brand {

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 品牌名称
	 */
	private String brandName;

	/**
	 * 品牌code,总长5位【自有品牌首位为1,srm推过来的第三方品牌首位为2,后四位支持数字和字母混编】
	 */
	private String brandCode;

	/**
	 * 品牌注册名
	 */
	private String nameRegistered;

	/**
	 * 品牌logo
	 */
	private String logoUrl;

	/**
	 * 品牌类型(1:自有品牌,2:第三方品牌)
	 */
	private Byte brandType;

	/**
	 * 品牌数据来源(1:pim,2：srm)
	 */
	private Byte brandSource;

	/**
	 * 是否展示(0:不展示,1:展示)
	 */
	private Byte isShow;

	/**
	 * 是否启用(0:未启用,1:启用)
	 */
	private Byte isEnabled;

	/**
	 * 操作人
	 */
	private String operator;

	/**
	 * 记录插入时间
	 */
	private Date insertTime;

	/**
	 * 记录更新时间
	 */
	private Date lastUpdateTime;

	/**
	 * 是否删除(0：未删除,1：删除)
	 */
	private Byte isDel;

	/**
	 * 是否用于商品名称(0:否,1:是)
	 */
	private Byte isForName;

	private static final long serialVersionUID = 1L;

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandName() {
		return brandName;
	}

	public String getBrandCode() {
		return brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	@Override
	public String toString() {
		return "Brand{" +
				"brandName='" + brandName + '\'' +
				", brandCode='" + brandCode + '\'' +
				'}';
	}
}