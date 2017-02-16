package ru.chuikov.testweb.controller;

import jdk.nashorn.internal.ir.debug.JSONWriter;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestConnection {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String tessConnection(ModelMap model)
    {
        JSONObject rsp=new JSONObject();
        rsp.put("result",true);
        return  rsp.toJSONString().toString();
    }
}
