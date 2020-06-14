package com.young.mall.portal.service.impl;

import com.young.mall.portal.mbg.model.PmsBrand;
import com.young.mall.portal.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsBrandServiceImpl implements PmsBrandService {

    //@Autowired
    //private PmsBrandMapper brandMapper;

    @Override
    public List<PmsBrand> list() {
        return null;
    }

    @Override
    public List<PmsBrand> list(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return 0;
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        return 0;
    }

    @Override
    public int deleteBrand(Long id) {
        return 0;
    }

    @Override
    public PmsBrand get(Long id) {
        return null;
    }
}
