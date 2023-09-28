package com.ba.boost.controller;

import com.ba.boost.rabbitmq.model.MemberModel;
import com.ba.boost.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/register")
    public ResponseEntity<MemberModel> register(@RequestBody MemberModel member) {
        return ResponseEntity.ok(memberService.register(member));
    }
}
