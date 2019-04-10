package com.example.mybatis.view.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.example.mybatis.view.entity.ArchitectureStaticData;
import com.example.mybatis.view.service.IArchitectureStaticDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dupeng
 * @since 2019-04-04
 */
@RestController
public class ArchitectureStaticDataController {
    @Autowired
    private IArchitectureStaticDataService iArchitectureStaticDataService;
    @RequestMapping("/findAll")
    public List<ArchitectureStaticData> find(){
        EntityWrapper<ArchitectureStaticData> queryWrapper = new EntityWrapper<>();
//        queryWrapper.setSqlSelect("","")
//        iArchitectureStaticDataService.selectList()
        return null;
    }
}

