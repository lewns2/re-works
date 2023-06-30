package com.lewns2.worksserver.base.base_response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class BaseResponse {

    private String status;  // 00: 성공, 99: 실패
    private String message;

    protected BaseResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public static BaseResponse success() {
        return new BaseResponse("00", "OK");
    }

    public static BaseResponse fail(String errorMessage) {
        return new BaseResponse("99", errorMessage);
    }
}
