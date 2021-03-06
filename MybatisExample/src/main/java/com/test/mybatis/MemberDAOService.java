package com.test.mybatis;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/*Service 클래스를 Repository로 등록 함으로서 빈 클래스로 사용 가능하게 한다. */
@Repository
public class MemberDAOService implements MemberDAO {
	
	//Autowired를 사용하여 sqlSession을 사용 할 수 있다. 
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public ArrayList<Member> getMembers(){
		
		ArrayList<Member> result  = new ArrayList<Member>();
		
		//sqlSession을 통하여 매핑한다. 
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		
		//getMember()의 메소드 명과 mapper.xml과 id는 동일해야 한다. 
		result = memberMapper.getMembers();

		return result;
		
	}
	
	@Override
	public void insertMember(Member member) {
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		memberMapper.insertMember(member);
		
	}

}
