package com.board.com.board.Domain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.board.com.board.Domain.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{

}
