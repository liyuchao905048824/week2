package com.liyuchao.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liyuchao.bean.Movie;
import com.liyuchao.service.MovieService;

@Controller
public class MovieController {
@Resource
private MovieService service;

@RequestMapping(value="/list.do")
public String list(Model model,Movie movie,
		@RequestParam(defaultValue="5")int cpage,
		@RequestParam(defaultValue="")String mname
		
		){
	Map<String, Object> map = new HashMap<>();
	map.put("mname", mname);
	PageHelper.startPage(cpage, 5);
	List<Movie> list=service.list(movie);
	PageInfo<Movie> pageInfo = new PageInfo<>(list);
	model.addAttribute("list", list);
	model.addAttribute("page", pageInfo);
	model.addAttribute("map", map);
	
	return "list";
	
	
}


}
