package com.example.mybatis.view.service;

import com.example.mybatis.view.entity.ArchitectureStaticData;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dupeng
 * @since 2019-04-04
 */
public interface IArchitectureStaticDataService extends IService<ArchitectureStaticData> {

    public List<ArchitectureStaticData> findAll();

    public List<ArchitectureStaticData> findByType(String type);

    public List<ArchitectureStaticData> findByValue(String type);
}
