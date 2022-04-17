package com.wunai.front.controller;


import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.UUID;


@Slf4j
@RestController
public class MemberController {

    @RequestMapping(value = "/member/geetestInit",method = RequestMethod.GET)
    @ApiOperation(value = "极验初始化")
    public String geetesrInit(HttpServletRequest request){
        return null;
    }

}
