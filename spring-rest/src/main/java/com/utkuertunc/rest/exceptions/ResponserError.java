package com.utkuertunc.rest.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponserError {

    private String errorMessage;
    private int statusCode;
}
