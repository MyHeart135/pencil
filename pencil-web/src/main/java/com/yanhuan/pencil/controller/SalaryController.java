package com.yanhuan.pencil.controller;

import com.google.common.base.Preconditions;
import com.yanhuan.domain.beans.Salary;
import com.yanhuan.service.SalaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class SalaryController {

    @Resource
    private SalaryService salaryService;

    @RequestMapping("/salary")
    public String gotoSalaryPage(Model model) {
        model.addAttribute("salary", 2);
        return "salary";
    }

    @RequestMapping("/salary/{id}")
    @ResponseBody
    public Salary getSalaryByCondition(@PathVariable("id") Long id) {
        Preconditions.checkNotNull(id);
        return salaryService.get(id);
    }

}
