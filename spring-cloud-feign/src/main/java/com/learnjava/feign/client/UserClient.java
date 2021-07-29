package com.learnjava.feign.client;

import com.learnjava.feign.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url="${users.url}", name="${users.name}")
public interface UserClient {

    @GetMapping("/users")
    public List<UserResponse> getUsers();
}
