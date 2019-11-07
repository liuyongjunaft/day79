package com.jun.user.service.Impl;

import com.jun.user.domain.dto.ScoreDto;
import com.jun.user.domain.entity.User;
import com.jun.user.domain.vo.UserVo;
import com.jun.user.mapper.UserMapper;
import com.jun.user.service.ScoreService;
import com.jun.user.service.UserService;


import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Resource
    ScoreService scoreService;

    @Override
    public UserVo getUservoByUid(int uid) throws Exception{
        UserVo userVo = new UserVo();
        List<ScoreDto> list=scoreService.getScoreByUid(uid);
        userVo.setList(list);
        return userVo;
    }


}
