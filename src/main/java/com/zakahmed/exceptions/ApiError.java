package com.zakahmed.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by zahmed on 9/23/17.
 */
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class ApiError {

    private int status;
    private String message;
    private String userMessage;
}
