package com.ics.cat1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "catclient", url = "10.51.15.93:1000", configuration = FeignConfig.class)
public interface FeignRestClient {

}
