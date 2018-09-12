package com.learn.firstmodule.spi.impl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.firstmodule.spi.service.MyService;
import com.learn.secondmodule.spi.service.TheirService;

@Service
public class MyServiceImpl implements MyService {

  @Autowired
  private TheirService theirService;

  public Integer getNumber() {
    return theirService.getSecondNumber();
  }
}
