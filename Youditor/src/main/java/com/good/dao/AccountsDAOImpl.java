package com.good.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.good.dto.AccountsVO;

@Repository
public class AccountsDAOImpl implements AccountsDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "com.good.mapper.accountsMapper";
	
	@Override
	public List<AccountsVO> selectAccounts() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE+".selectAccounts");
//		return null;
	}

	
	
	
	
}
