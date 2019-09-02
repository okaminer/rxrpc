package com.slimgears.rxrpc.sample;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface SampleBaseData {
    int value();
    int ignoredMethod();
}
