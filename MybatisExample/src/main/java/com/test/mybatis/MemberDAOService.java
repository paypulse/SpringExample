package com.test.mybatis;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/*Service Ŭ������ Repository�� ��� �����μ� �� Ŭ������ ��� �����ϰ� �Ѵ�. */
@Repository
public class MemberDAOService implements MemberDAO {
	
	//Autowired�� ����Ͽ� sqlSession�� ��� �� �� �ִ�. 
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public ArrayList<Member> getMembers(){
		
		ArrayList<Member> result  = new ArrayList<Member>();
		
		//sqlSession�� ���Ͽ� �����Ѵ�. 
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		
		//getMember()�� �޼ҵ� ��� mapper.xml�� id�� �����ؾ� �Ѵ�. 
		result = memberMapper.getMembers();

		return result;
		
	}
	
	@Override
	public void insertMember(Member member) {
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		memberMapper.insertMember(member);
		
	}

}
