package com.teama.DAO.Impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.teama.Bean.Stat;
import com.teama.DAO.DashBoard;


@Repository
public class DashBoardImpl implements DashBoard {
	@Autowired
	private HibernateTemplate hTemplate;
	
	@SuppressWarnings("unchecked")
	private List<Stat> runGenericStatisticsQuery(String sql){
		List<Stat> stats = new ArrayList<Stat>();
		List<Object[]> rows = 	hTemplate.getSessionFactory().getCurrentSession().createSQLQuery(sql).list();
		
		
		if(CollectionUtils.isNotEmpty(rows)){
			for(Object[] row: rows){
			stats.add(new Stat((String)row[0],(BigInteger) row[1]));
			}
		}
		return stats;
	}
	@Override
	public List<Stat> getStatsByTechCount() {
		// TODO Auto-generated method stub
		return runGenericStatisticsQuery("SELECT tech_type,COUNT(tech_type) FROM user_info GROUP BY tech_type");
	}
	@Override
	public List<Stat> getStatsByVisaCount() {
		// TODO Auto-generated method stub
		return runGenericStatisticsQuery("SELECT visa_status,COUNT(visa_status) FROM user_info GROUP BY visa_status");
	}
	@Override
	public List<Stat> getStatsByUnivCount() {
		// TODO Auto-generated method stub
		return runGenericStatisticsQuery("SELECT university,COUNT(university) FROM user_info GROUP BY university");
	}
	@Override
	public List<Stat> getStatsByUserTypeCount() {
		// TODO Auto-generated method stub
		return runGenericStatisticsQuery("SELECT authority,COUNT(authority) FROM authorities GROUP BY authority");
	}
	@Override
	public List<Stat> getStatsByEmpLocTypeCount() {
		// TODO Auto-generated method stub
		return runGenericStatisticsQuery("select state,count(state) from employee_details group by state");
	}

}
