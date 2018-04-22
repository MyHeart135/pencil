package com.yanhuan.manager;

import com.yanhuan.domain.beans.Salary;

public interface SalaryManager {

    Integer insert(Salary salary);

    Salary get(Long id);
}
