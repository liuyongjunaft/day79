package com.jun.integ.service;

import com.jun.integ.domain.entity.Score;

import java.util.List;

public interface IntegService {
    List<Score> getScoreByUid(int uid);
}
