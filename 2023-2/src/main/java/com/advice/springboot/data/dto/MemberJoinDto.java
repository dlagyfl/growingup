package com.advice.springboot.data.dto;

import com.advice.springboot.data.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberJoinDto {

        private String membername;
        private String memberNumber;
        private String password;

        public Member toEntity() {
                Member member = new Member();
                member.setMemberNumber(this.memberNumber);
                member.setPassword(this.password);
                member.setMembername(this.getMembername());

                return member;
        }
}
