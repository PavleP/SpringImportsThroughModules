package com.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learn.firstmodule.spi.service.MyService;

@Controller
public class HomeController {

  @Autowired
  private MyService myService;

  @RequestMapping(value = "/")
  public String home() {
    Integer number = myService.getNumber();
    if (number > 3) {
      return "testGt3";
    }
    return "testLt3";
  }

}
