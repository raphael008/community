package com.github.raphael008.controller;

import com.github.raphael008.common.ApiParam;
import com.github.raphael008.common.ApiResult;
import com.github.raphael008.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user", produces = "application/json")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("findUserById")
    public ApiResult findUserById(@RequestBody ApiParam<Long> param) {
        Long data = param.getData();
        // fake commits
        return ApiResult.failure("error!");
    }
}
