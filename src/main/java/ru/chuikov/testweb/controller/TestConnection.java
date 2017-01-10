package ru.chuikov.testweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestConnection {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String tessConnection(Model model)
    {
        return "OK - Connection checked";
    }
}
