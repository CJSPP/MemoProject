package com.sparta.memoproject.repository;

import com.sparta.memoproject.domain.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {


//    @Query(value = "select m.title as title, m.name as name, m.comment as comment, m.creationdate as creationdate from Memo m ")
//    List<Memo> findByTitleAndNameAndCommentAAndCreationdateOOrderByCreationdateCreationdateDesc();

//    @Query(value = "select m.title as title," +
//            " m.name as name," +
//            " m.comment as comment," +
//            " m.creationdate as creationdate" +
//            " from Memo m where m.id = ?")
//    List<Memo> findSelectColumById(Long id);
}
