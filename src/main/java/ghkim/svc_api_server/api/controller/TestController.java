package ghkim.svc_api_server.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "TEST", description = "TEST API")
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Operation(summary = "테스트 API", description = "request TEST ")
    @GetMapping("")
    public String getMethodName() {
        return new String("TESTSET");
    }

}
