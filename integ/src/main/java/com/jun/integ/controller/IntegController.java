package com.jun.integ.controller;

import com.jun.integ.domain.entity.Score;
import com.jun.integ.service.IntegService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/score")
public class IntegController {
    @Resource
    IntegService integService;
    @GetMapping("/list/{uid}")
    public List<Score> getScoreByUid(@PathVariable int uid){
      return integService.getScoreByUid(uid);
    }
}
