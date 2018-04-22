package com.yanhuan.manager.impl;

import com.yanhuan.domain.beans.Salary;
import com.yanhuan.dao.SalaryDao;
import com.yanhuan.domain.condition.SalaryCondition;
import com.yanhuan.manager.SalaryManager;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class SalaryManagerImpl implements SalaryManager {

    @Resource
    private SalaryDao salaryDao;

    @Override
    public Integer insert(Salary salary) {
        return salaryDao.insert(salary);
    }

    @Override
    public Salary get(Long id) {
        SalaryCondition salaryCondition = new SalaryCondition();
        salaryCondition.setId(id);
        return salaryDao.getSalaryByCondition(salaryCondition);
    }
}
