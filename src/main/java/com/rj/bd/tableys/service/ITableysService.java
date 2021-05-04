package com.rj.bd.tableys.service;

import java.util.List;

import com.rj.bd.tableys.entity.Tableys;

public interface ITableysService {

	List<Tableys> findAll();

	void save(Tableys tableys);

	void deleteTableys(String t_id);

	Tableys queryTableysById(String t_id);

	void updateTableys(Tableys tableys);


}
