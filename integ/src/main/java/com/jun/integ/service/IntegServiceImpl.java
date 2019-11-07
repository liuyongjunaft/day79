package com.jun.integ.service;

import com.jun.integ.domain.entity.Score;
import com.jun.integ.mapper.ScoreMapper;
import com.jun.integ.service.IntegService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IntegServiceImpl implements IntegService {
    @Resource
    ScoreMapper scoreMapper;
    @Override
    public List<Score> getScoreByUid(int uid) {
        return scoreMapper.getScoreByUid(uid);
    }
}
