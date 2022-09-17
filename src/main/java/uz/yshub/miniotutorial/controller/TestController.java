package uz.yshub.miniotutorial.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class TestController {


    @GetMapping(value = "/getHello")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("hello world");
    }

}
