package com.s8.school.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Brooke Li
 * @E-mail: Halloworld1992@outlook.com
 * @Date: Created in $[TIME] $[DATE]
 * @Description:
 * @Modified by:
 */
@RestController
@RequestMapping("/student")
public class StudentController {


    /**
     * 老师权限或学生权限
     */
    @GetMapping("/grade")
    @PreAuthorize("hasAnyAuthority('teacher','student')")
    public Object rs(HttpServletRequest request){
        Map<String,Object> map=new HashMap<>();
        map.put("张三",100);
        return map;
    }


}
