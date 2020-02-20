package com.lcx.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.lcx.service.ArticleService;
import com.lcx.util.PageUtil;
import com.lcx.vo.ArticleVO;

@Controller
public class ArticleController {

	@Autowired
	private ArticleService service;
	
	@RequestMapping("/list")
	public String selects(@RequestParam(defaultValue = "1")int page,@RequestParam(defaultValue = "5")int pageSize,ArticleVO vo,HttpServletRequest request) {
		System.err.println("------------------------------------------");
		
		System.err.println(vo);
		PageInfo info =service.getlist(page,pageSize,vo);
		
		PageUtil.page(request, "/list", pageSize, info.getList(), (int)info.getTotal(), page);
		
		request.setAttribute("list", info.getList());
		
		return "/list";
	}
	
	
}
