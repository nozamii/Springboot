package com.example.DB.RealDB.Repository;

import com.example.DB.RealDB.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News,Long>{
}
