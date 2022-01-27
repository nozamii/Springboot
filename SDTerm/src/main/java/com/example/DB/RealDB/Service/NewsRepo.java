package com.example.DB.RealDB.Service;

import com.example.DB.RealDB.News;
import com.example.DB.RealDB.Repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Service
@Transactional
public class NewsRepo {
	@Autowired
	private NewsRepository pr;

	public List<News> getAll() {
		return pr.findAll();
	}

	public News getByID(long id) {
		return pr.findById(id).get();
	}

	public News add(News b) {
		return pr.save(b);
	}

	public void delete(long id) {
		pr.deleteById(id);
	}

}
