package com.webapi.webapi;

import com.nimbusds.jose.shaded.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("user")
    public JSONObject getUserPrincipal() {
        JSONObject jo = new JSONObject();
        jo.put("data", "THIS IS MY DATA");
        return jo;
    }
}
