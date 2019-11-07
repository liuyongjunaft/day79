package com.jun.user.domain.vo;

import com.jun.user.domain.dto.ScoreDto;
import lombok.Data;

import java.util.List;

@Data
public class UserVo {
    private List<ScoreDto> list;
    private Integer uId;

    private String username;

    private String password;

    private Integer fans;

    private Integer isDelete;

    private Integer level;
}
