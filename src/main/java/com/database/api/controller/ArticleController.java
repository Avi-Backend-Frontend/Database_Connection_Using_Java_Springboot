package com.database.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.api.model.Article;
import com.database.api.service.ArticleService;

@RestController
@RequestMapping("/Article")
public class ArticleController {
	
	@Autowired
	public ArticleService articleService;
	
	@GetMapping("/getAll")
	public List<Article> getArticle(){
		return articleService.getArticle();
	}

	@PostMapping("addArticle")
	public Article addArticle(@RequestBody Article article){
		return articleService.addArticle(article);
	}
	

}
