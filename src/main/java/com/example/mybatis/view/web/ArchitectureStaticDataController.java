package com.example.mybatis.view.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.example.mybatis.view.entity.ArchitectureStaticData;
import com.example.mybatis.view.service.IArchitectureStaticDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    @GetMapping("/findAll")
    public List<ArchitectureStaticData> find(){
        return iArchitectureStaticDataService.findAll();
    }
    @GetMapping("/findByType")
    public List<ArchitectureStaticData> findByType(String type){
        return iArchitectureStaticDataService.findByType(type);
    }
    @GetMapping("/findByValue")
    public List<ArchitectureStaticData> findByValue(String value){
        return iArchitectureStaticDataService.findByValue(value);
    }
    @PostMapping("/insertValue")
    public Boolean insertValue(Long id,String name,String type, String value){
        return iArchitectureStaticDataService.insertValue(id,name,type,value);
    }
}

