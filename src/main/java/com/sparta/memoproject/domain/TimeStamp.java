package com.sparta.memoproject.domain;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass //Entity가 자동으로 컬럼으로 인식 -> 어노테이션 3개 다 있어야함!
@EntityListeners(AuditingEntityListener.class) // 생성일자가 생성될 때를 감지, 감시한다.
public abstract class TimeStamp {

    //생성일자
    @CreatedDate
    private LocalDateTime creationdate;
}
