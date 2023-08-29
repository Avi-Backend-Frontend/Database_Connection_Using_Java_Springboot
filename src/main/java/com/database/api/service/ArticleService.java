package com.database.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.api.model.Article;
import com.database.api.repository.ArticleRepository;

@Service
public class ArticleService {
	
	@Autowired
	public ArticleRepository articleRepository;

	public List<Article> getArticle() {
		return articleRepository.findAll();
	}

	public Article addArticle(Article article) {
		return articleRepository.save(article);
	}

	
}
