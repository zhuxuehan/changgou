package com.changgou.goods.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_category_brand")
public class CategoryBrand {

    //分类id
    @Id
    private Long categoryId;

    //品牌id
    @Id
    private Integer brandId;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
}
