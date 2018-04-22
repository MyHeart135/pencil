package com.yanhuan.business;

import com.yanhuan.domain.beans.Salary;

public interface SalaryBusiness {

    Integer insert(Salary salary);

    Salary get(Long id);
}
