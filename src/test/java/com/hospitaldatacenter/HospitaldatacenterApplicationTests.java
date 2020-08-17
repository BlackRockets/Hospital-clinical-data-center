package com.hospitaldatacenter;

import com.hospitaldatacenter.dao.FollowUpRulesDao;
import com.hospitaldatacenter.entity.FollowUpRules;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class HospitaldatacenterApplicationTests {

    @Resource
    FollowUpRulesDao followUpRulesDao;
    @Test
    void contextLoads() {
        FollowUpRules followUpRules = new FollowUpRules();
        followUpRules.setFollowupgorupid(2);
        List<FollowUpRules> followUpRules1 = followUpRulesDao.queryByFollowUpGroupId(followUpRules);
        System.out.println(followUpRules1);
    }

}
