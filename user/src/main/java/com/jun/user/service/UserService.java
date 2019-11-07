package com.jun.user.service;

import com.jun.user.domain.vo.UserVo;

public interface UserService {
    UserVo getUservoByUid(int uid) throws Exception;
}
