package com.jun.user.service;

import com.jun.user.domain.dto.ScoreDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("server-integ")
public interface ScoreService {
    @GetMapping("/score/list/{uid}")
    List<ScoreDto> getScoreByUid(@PathVariable int uid);
}
