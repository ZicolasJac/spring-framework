package ds.zjc.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 品牌-商品图标关系表
 *
 * @author zhuchengduo
 * @date 2021/07/05
 */
@Data
public class BrandImage implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 品牌code
     */
    private String brandCode;

    /**
     * 图标类型(1:商品图标-左,2:商品图标-右)
     */
    private Byte imgType;

    /**
     * 商品图标url
     */
    private String imgUrl;

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