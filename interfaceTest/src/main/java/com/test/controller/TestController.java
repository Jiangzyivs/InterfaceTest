package com.test.controller;

import com.test.api.client.Testapi;
import com.test.repository.mapper.TestMapper;
import com.test.util.ApiResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController implements Testapi {

    @Resource
    private TestMapper testMapper;

    @Override
    @GetMapping({"/getTest"})
    public ApiResult<Integer> getTest() {
        return ApiResult.success(testMapper.getUserCount());
    }
}
