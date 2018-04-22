package com.yanhuan.service.test;

import com.yanhuan.domain.beans.Salary;
import com.yanhuan.service.BaseTest;
import com.yanhuan.service.SalaryService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import javax.annotation.Resource;
import java.math.BigDecimal;

public class SalaryServiceTest extends BaseTest {

    private static Logger logger = LogManager.getLogger(SalaryServiceTest.class);

    @Resource
    protected SalaryService salaryService;

    @Test
    public void testInsert(){
        Salary salary = new Salary();
        salary.setName("蔡安");
        salary.setAge(22);
        salary.setSex((byte)1);
        salary.setSalary(new BigDecimal(20000));
        salary.setCompany("京东物流亚一");
        salary.setCreateUser("yanhuan");
        Integer insert = salaryService.insert(salary);
    }
}
