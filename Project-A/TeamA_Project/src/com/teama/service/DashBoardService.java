package com.teama.service;

import java.util.List;

import com.teama.Bean.Stat;

public interface DashBoardService {

	public List<Stat> getStatsByTechCount();
	public List<Stat> getStatsByVisaCount();
	public List<Stat> getStatsByUnivCount();
	public List<Stat> getStatsByUserTypeCount();
	public List<Stat> getStatsByEmpLocTypeCount();
	
}
