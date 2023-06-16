package com.sparta.memoproject.service;

import com.sparta.memoproject.domain.Memo;
import com.sparta.memoproject.dto.MemoRequestDto;
import com.sparta.memoproject.repository.MemoRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
//서비스 계층으로 동작하게 해주는 Annotation
@Service
public class MemoService {
    private final MemoRepository memoRepository;

    @Transactional
    public Long update(Long id, MemoRequestDto requestDto) {
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 없습니다.")
        );
        memo.update(requestDto);
        return id;
    }
}
