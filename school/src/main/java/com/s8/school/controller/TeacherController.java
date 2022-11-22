package com.s8.school.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Brooke Li
 * @E-mail: Halloworld1992@outlook.com
 * @Date: Created in $[TIME] $[DATE]
 * @Description:
 * @Modified by:
 */
@RestController
@RequestMapping("/teacher")
@Slf4j
public class TeacherController {


    /**
     * 老师权限
     */
    @GetMapping("/math/grade")
    @PreAuthorize("hasAuthority('teacher')")
    public Object rs() {
        log.info("/n/n------------------/n/n");
        List<Map<String, Object>> maps = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("张三" + i, 100);
            maps.add(map);
        }
        return maps;
    }


}
