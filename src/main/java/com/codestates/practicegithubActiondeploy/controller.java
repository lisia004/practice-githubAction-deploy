package com.codestates.practicegithubActiondeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping
    public String hello (){
        return "배포 자동화 실습 마무리 그리고 마지막 페어 프로그램 실습 종료!";
    }
}
