package com.example.mybatis.view.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.mybatis.view.entity.ArchitectureStaticData;
import com.example.mybatis.view.mapper.ArchitectureStaticDataMapper;
import com.example.mybatis.view.service.IArchitectureStaticDataService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dupeng
 * @since 2019-04-04
 */
@Service
public class ArchitectureStaticDataServiceImpl extends ServiceImpl<ArchitectureStaticDataMapper, ArchitectureStaticData> implements IArchitectureStaticDataService {
    @Cacheable(value="staticAllData")
    @Override
    public List<ArchitectureStaticData> findAll() {
        return selectList(null);
    }
    @Cacheable(value="staticTypeData")
    @Override
    public List<ArchitectureStaticData> findByType(String type) {
        EntityWrapper<ArchitectureStaticData> entityWrapper = new EntityWrapper();
        entityWrapper.eq("CODE_TYPE",type);
        return this.selectList(entityWrapper);
    }
    @Cacheable(value="staticValueData")
    @Override
    public List<ArchitectureStaticData> findByValue(String type) {
        EntityWrapper<ArchitectureStaticData> entityWrapper = new EntityWrapper();
        entityWrapper.eq("CODE_VALUE",type);
        return this.selectList(entityWrapper);
    }
}
