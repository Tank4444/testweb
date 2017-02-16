package ru.chuikov.testweb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.chuikov.testweb.entity.TestClass;
import ru.chuikov.testweb.repository.TestClassRepository;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/obj")
public class TestApiController {

    @Autowired
    private TestClassRepository testClassRepository;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public List<TestClass> getTestObject()
    {
        List<TestClass> list=testClassRepository.findAll();
        return list;
    }

    private TestClass getEmptyRemind() {
        TestClass tc=new TestClass();
        tc.setId(3);
        tc.setTitle("hello");
        tc.setText("loren ipsum)");
        tc.setDate(new Date());
        return tc;
    }
}
