package com.sparta.memoproject.controller;

import com.sparta.memoproject.domain.Memo;
import com.sparta.memoproject.dto.MemoRequestDto;
import com.sparta.memoproject.repository.MemoRepository;
import com.sparta.memoproject.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemoController {
    private final MemoRepository memoRepository;
    private final MemoService memoService;

    //게시글 작성
    @PostMapping("/api/memos")
    public Memo creatememo(@RequestBody MemoRequestDto requestDto) {
        Memo memo = new Memo(requestDto);

        return memoRepository.save(memo);
    }

    //게시글 전체조회
    @GetMapping("/api/memos")
    public List<Memo> search_memo() {

        return memoRepository.findAll();
    }

    //선택한 게시글 조회
    @GetMapping("/api/memo/{id}")
    public Long select_memo(@PathVariable Long id) {
        memoRepository.findById(id);
        return id;
    }

    //선택한 게시글 수정
    @PutMapping("/api/selectmemo/{id}")
    public Long updatememo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto) {
        Memo memo = new Memo();
        String password = requestDto.getPassword();
        if (password == memo.getPassword()) {
            memoService.update(id, requestDto);
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
        }
        return id;
    }

    @DeleteMapping("/api/selectmemo/{id}")
    public Long deletememo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto) {
        Memo memo = new Memo();
        String password = requestDto.getPassword();
        if (password == memo.getPassword()) {
            memoRepository.deleteById(id);
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
        }
        return id;
    }
}
