package com.fyp.web.controllers;

import com.fyp.entity.result.JsonResult;

import com.fyp.service.impl.DefaultLayIMService;
import com.fyp.service.intf.LayIMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/layim")
public class LayIMController extends BaseController{

    @Autowired
    private  LayIMService layIMService;

    @GetMapping("init")
    public JsonResult InitData(HttpServletRequest request){
        return layIMService.GetInitResult(getUserId(request));
    }
}
