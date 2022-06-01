package com.tworaveler.tlog.home;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.tworaveler.tlog.vo.LogVO;
import com.tworaveler.tlog.vo.MemberVO;

@Mapper
@Repository
public interface HomeDAO {
	// ����: �ֽ� �� ����Ʈ
	public List<LogVO> selectLikeLog();

	// ����: �ȷ��� �� ����Ʈ
	public List<LogVO> selectFollowLog(int userNum);

	// tNum�� �±� ����Ʈ
	public List<String> selectLogTag(int tNum);

	// tNum�� �۳��� ����Ʈ
	public List<LogVO> selectLogDetail(int tNum);

	// tNum�� �±׵� ���� ����Ʈ
	public List<LogVO> selectTagUsers(int tNum);

	// tNum�� �±� ����Ʈ
	public List<String> selectTagAll();

	// ����) �ȷο� ���� ����
	public List<MemberVO> FollowedUser();

	// userNum�� �±� ����Ʈ
	public List<String> selectmyTag(int userNum);
}