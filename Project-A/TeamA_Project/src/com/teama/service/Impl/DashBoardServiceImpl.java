package com.teama.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teama.Bean.Stat;
import com.teama.DAO.DashBoard;
import com.teama.service.DashBoardService;
@Service
@Transactional
public class DashBoardServiceImpl implements DashBoardService {
	@Autowired
	DashBoard dashBoard;

	@Override
	public List<Stat> getStatsByTechCount() {
		// TODO Auto-generated method stub
		return dashBoard.getStatsByTechCount();
	}

	@Override
	public List<Stat> getStatsByVisaCount() {
		// TODO Auto-generated method stub
		return dashBoard.getStatsByVisaCount();
	}

	@Override
	public List<Stat> getStatsByUnivCount() {
		// TODO Auto-generated method stub
		return dashBoard.getStatsByUnivCount();
	}

	@Override
	public List<Stat> getStatsByUserTypeCount() {
		// TODO Auto-generated method stub
		return dashBoard.getStatsByUserTypeCount();
	}

	@Override
	public List<Stat> getStatsByEmpLocTypeCount() {
		// TODO Auto-generated method stub
		return dashBoard.getStatsByEmpLocTypeCount();
	}

}
