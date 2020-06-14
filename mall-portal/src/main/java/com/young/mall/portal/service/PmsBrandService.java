package com.young.mall.portal.service;

import com.young.mall.portal.mbg.model.PmsBrand;

import java.util.List;

/**
 * Brand 服务接口
 *
 * @author jonesleborn
 * @since topic v1.0
 */
public interface PmsBrandService {

    List<PmsBrand> list();

    List<PmsBrand> list(int pageNum, int pageSize);

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    PmsBrand get(Long id);

}
