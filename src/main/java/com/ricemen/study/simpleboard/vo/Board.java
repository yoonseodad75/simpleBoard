package com.ricemen.study.simpleboard.vo;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Board {

    private int bno;

    private String btitle;

    private String bwriter;

    private String bcontents;

    private LocalDateTime regdated_at;


//    @Builder
//    public Board(String btitle, String bwriter, String bcontents) {
//        this.btitle = btitle;
//        this.bwriter = bwriter;
//        this.bcontents = bcontents;
//    }


    @Builder
    public Board(int bno, String btitle, String bwriter, String bcontents, LocalDateTime regdated_at) {
        this.bno = bno;
        this.btitle = btitle;
        this.bwriter = bwriter;
        this.bcontents = bcontents;
        this.regdated_at = regdated_at;
    }
}
