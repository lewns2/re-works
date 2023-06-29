package com.lewns2.worksserver.base.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

    NOT_FOUND("404");

    private final String value;

    ErrorCode(final String value) {
        this.value = value;
    }

}
