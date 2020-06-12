package com.young.mall.portal.mbg.mapper;

import com.young.mall.portal.mbg.model.PmsBrand;

public interface PmsBrandMapper {
    int insert(PmsBrand record);

    int insertSelective(PmsBrand record);
}