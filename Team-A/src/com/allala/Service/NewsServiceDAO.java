package com.allala.Service;

import java.util.List;
import com.allala.entities.News;

public interface NewsServiceDAO {
	public List<News> getAllNews();
	public List<News> getNewsByloc(Long zip);
}
