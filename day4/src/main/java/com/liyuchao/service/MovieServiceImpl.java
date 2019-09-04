package com.liyuchao.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liyuchao.bean.Movie;
import com.liyuchao.dao.MovieDao;

@Service
public class MovieServiceImpl  implements MovieService{
@Resource
private MovieDao dao;


@Override
public List<Movie> list(Movie movie) {
	// TODO Auto-generated method stub
	return dao.list(movie);
}
}
