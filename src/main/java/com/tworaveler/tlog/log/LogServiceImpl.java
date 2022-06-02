package com.tworaveler.tlog.log;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.tworaveler.tlog.member.MemberVO;

@Service
public class LogServiceImpl implements LogService{
	@Inject
	LogDAO dao;

	@Override
	public List<LogVO> selectLikeLog() {
		return dao.selectLikeLog();
	}

	@Override
	public List<LogVO> selectLogTag(int tNum) {
		return dao.selectLogTag(tNum);
	}

	@Override
	public List<LogVO> selectLogDetail(int tNum) {
		return dao.selectLogDetail(tNum);
	}

	@Override
	public List<LogVO> selectFollowLog(int userNum) {
		return dao.selectFollowLog(userNum);
	}

	@Override
	public List<LogVO> selectTagAll() {
		return dao.selectTagAll();
	}

	@Override
	public List<MemberVO> FollowedUser() {
		return dao.FollowedUser();
	}

	@Override
	public List<LogVO> selectmyTag(int userNum) {
		return dao.selectmyTag(userNum);
	}

	@Override
	public List<LogVO> selectTagUsers(int tNum) {
		return dao.selectTagUsers(tNum);
	}

	@Override
	public List<LogVO> selectNewLogs(int startNum, int limit) {
		return dao.selectNewLogs(startNum, limit);
	}

	@Override
	public List<LogVO> selectLikeLogs(int startNum, int limit) {
		return dao.selectLikeLogs(startNum, limit);
	}

	@Override
	public List<LogVO> searchNewLogs(String searchKey, String string, int startNum, int limitNum) {
		return dao.searchNewLogs(searchKey, string, startNum, limitNum);
	}

	@Override
	public List<LogVO> searchNewLogsTag(String string, int startNum, int limitNum) {
		return dao.searchNewLogsTag(string, startNum, limitNum);
	}

	@Override
	public List<LogVO> searchLikeLogs(String searchKey, String string, int startNum, int limitNum) {
		return dao.searchLikeLogs(searchKey, string, startNum, limitNum);
	}

	@Override
	public List<LogVO> searchLikeLogsTag(String string, int startNum, int limitNum) {
		return dao.searchLikeLogsTag(string, startNum, limitNum);
	}

}
