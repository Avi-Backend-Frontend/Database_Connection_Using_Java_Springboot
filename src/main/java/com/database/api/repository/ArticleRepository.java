package com.database.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.database.api.model.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
