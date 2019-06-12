package com.example.mybatis;

import com.example.mybatis.common.zookeeper.ZkClient;
import com.example.mybatis.view.entity.ArchitectureStaticData;
import com.example.mybatis.view.service.IArchitectureStaticDataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ActiveProfiles("andev")
@SpringBootTest
public class MybatisApplicationTests {
    @Autowired
    private ZkClient zkClient;
    @Test
    public void contextLoads() {
//        zkClient.register();
    }

}
