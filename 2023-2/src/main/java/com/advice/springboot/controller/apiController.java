package com.advice.springboot.controller;


import com.advice.springboot.data.dto.BoardDto;
import com.advice.springboot.data.dto.MemberJoinDto;
import com.advice.springboot.service.BoardService;
import com.advice.springboot.service.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController {


      private BoardService boardService;

      private MemberService memberService;


      public apiController(BoardService boardService, MemberService memberService) {
            this.boardService = boardService;
            this.memberService = memberService;
      }


//      @PostMapping("/board/new")
//      public void 글쓰기(@RequestBody BoardDto boardDto) {
//            boardService.글쓰기(boardDto);
//      }


//      @PostMapping("/member/new")
//      public void 멤버추가(@RequestBody MemberJoinDto memberJoinDTO){
//            memberService.멤버추가(memberJoinDTO);
//      }
}
