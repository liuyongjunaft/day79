package com.jun.integ.mapper;

import com.jun.integ.domain.entity.Score;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScoreMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
    List<Score> getScoreByUid(@Param("uid") int uid);
}