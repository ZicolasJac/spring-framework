package ds.zjc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 品牌说明文表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BrandIntroduction implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 品牌code
     */
    private String brandCode;

    /**
     * 语言缩写/简称
     */
    private String languageAbbr;

    /**
     * 品牌描述
     */
    private String brandDescription;

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
     * 删除标记(0:未删除,1:删除)
     */
    private Byte isDel;

    private static final long serialVersionUID = 1L;
}