package com.yanhuan.service;

import com.yanhuan.domain.beans.Salary;

public interface SalaryService {

    Integer insert(Salary salary);

    Salary get(Long id);
}
