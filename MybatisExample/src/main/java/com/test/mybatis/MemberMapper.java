package com.test.mybatis;

import java.util.ArrayList;

public interface MemberMapper {
	
	ArrayList<Member> getMembers();
	void insertMember(Member member);
	void updateMember(String NM, String SCORE);
	void deleteMember(String NM, String SCORE);
	

}
