package com.lcx.dao;

import java.util.List;

import com.lcx.doamin.Article;
import com.lcx.vo.ArticleVO;

public interface ArticleMapper {

	List<Article> selects(ArticleVO vo);

}
