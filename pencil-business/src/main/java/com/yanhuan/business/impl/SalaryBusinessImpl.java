package com.yanhuan.business.impl;

import com.yanhuan.business.SalaryBusiness;
import com.yanhuan.domain.beans.Salary;
import com.yanhuan.manager.SalaryManager;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class SalaryBusinessImpl implements SalaryBusiness {

    @Resource
    private SalaryManager salaryManager;

    @Override
    public Integer insert(Salary salary) {
        return salaryManager.insert(salary);
    }

    @Override
    public Salary get(Long id) {
        return salaryManager.get(id);
    }
}
