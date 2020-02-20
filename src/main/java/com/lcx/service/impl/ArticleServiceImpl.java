package com.lcx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lcx.dao.ArticleMapper;
import com.lcx.doamin.Article;
import com.lcx.service.ArticleService;
import com.lcx.vo.ArticleVO;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private ArticleMapper mapper;

	@Override
	public PageInfo getlist(int page, int pageSize, ArticleVO vo) {
		PageHelper.startPage(page, pageSize);
		
		 List<Article> list= mapper.selects(vo);
		 
		 
		return new PageInfo(list);
	}
	
	
	
	
	
}
