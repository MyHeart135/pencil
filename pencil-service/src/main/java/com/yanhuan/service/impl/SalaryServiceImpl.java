package com.yanhuan.service.impl;

import com.yanhuan.business.SalaryBusiness;
import com.yanhuan.domain.beans.Salary;
import com.yanhuan.service.SalaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Resource
    private SalaryBusiness salaryBusiness;

    @Override
    public Integer insert(Salary salary) {
        return salaryBusiness.insert(salary);
    }

    @Override
    public Salary get(Long id) {
        return salaryBusiness.get(id);
    }
}
