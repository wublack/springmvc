package com.black.wl520.controller;

import com.black.wl520.bean.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/userLogin", method = RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public JSONResult userLogin() {
        JSONResult result = new JSONResult();
        result.setError_code("0");
        result.setError_message("操作成功");
        return result;
    }

}
