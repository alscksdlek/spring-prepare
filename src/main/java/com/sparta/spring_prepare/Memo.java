package com.sparta.spring_prepare;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Memo {
    private final String username;
    private String contents;
}

class Main{
    public static void main(String[] args) {
        Memo memo = new Memo("Robbie");
        System.out.println(memo.getUsername());
    }
}