package com.learn.secondmodule.spi.impl.service;

import org.springframework.stereotype.Service;

import com.learn.secondmodule.spi.service.TheirService;

@Service
public class TheirServiceImpl implements TheirService {

  public Integer getSecondNumber() {
    return 5;
  }
}
