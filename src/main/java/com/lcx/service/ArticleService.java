package com.lcx.service;

import com.github.pagehelper.PageInfo;
import com.lcx.vo.ArticleVO;

public interface ArticleService {

	PageInfo getlist(int page, int pageSize, ArticleVO vo);

}
