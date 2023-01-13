package com.rokibrucse.cleanarchitecture.presentation.adapters.config.returnresponse;

import java.util.List;

import lombok.Builder;

@Builder
public class ReturnReponse<T> {
    private String message;
    private boolean succeeded;
    private List<T> values;
    private T value;
}
