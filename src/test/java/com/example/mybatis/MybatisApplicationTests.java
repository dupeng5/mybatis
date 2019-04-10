package com.example.mybatis;

import com.example.mybatis.view.entity.ArchitectureStaticData;
import com.example.mybatis.view.service.IArchitectureStaticDataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {
    @Autowired
    private IArchitectureStaticDataService iArchitectureStaticDataService;
    @Test
    public void contextLoads() {
        ArchitectureStaticData data = new ArchitectureStaticData();
        List<ArchitectureStaticData> a = iArchitectureStaticDataService.selectList(null);
        System.out.println(a.size());
        return;
    }

}
