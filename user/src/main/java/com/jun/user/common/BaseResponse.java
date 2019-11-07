package com.jun.user.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseResponse<T> {
    private String msg;
    private int status;
    private T data;
}
