package com.ba.boost.service;

import com.ba.boost.repository.IMemberRepository;
import com.ba.boost.repository.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final IMemberRepository repository;

    public void registerMember(Member member) {
        repository.save(member);
    }

    public List<Member> getAllData() {
        return repository.findAll();
    }
}
