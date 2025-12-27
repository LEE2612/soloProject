package kr.or.hi.member.mapper;

import java.util.List;

import kr.or.hi.dto.MemberDTO;

public interface MemberMapper {
	
	// 1명 조회
	MemberDTO selectMember(String username);
	
	// 회원 목록 조회
	List<MemberDTO> selectMemberList();
	
	// 회원 생성
	int insertMember(MemberDTO member);
	
	// 회원 수정
	int updateMember(MemberDTO member);
	
	// 회원 삭제
	int deleteMember(String username);
}
