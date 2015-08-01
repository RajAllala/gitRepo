package com.teama.DAO;

import java.util.List;

import com.teama.Bean.Stat;

public interface DashBoard {
	public List<Stat> getStatsByTechCount();
	public List<Stat> getStatsByVisaCount();
	public List<Stat> getStatsByUnivCount();
	public List<Stat> getStatsByUserTypeCount();
	public List<Stat> getStatsByEmpLocTypeCount();
}
