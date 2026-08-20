package com.metacoding.blog.board;

import java.sql.Timestamp;

public record BoardResponse(Integer id, String title, String content, String writer, Timestamp createdAt) {

    // 변환의 자리 ② — 엔티티를 응답 DTO로 감싼다
    public static BoardResponse from(Board board) {
        return new BoardResponse(board.getId(), board.getTitle(), board.getContent(), board.getUser().getUsername(),
                board.getCreatedAt());
    }
}
