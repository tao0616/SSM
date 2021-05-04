package com.rj.bd.tableys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rj.bd.tableys.dao.TableysMapper;
import com.rj.bd.tableys.entity.Tableys;

@Service("TableysService")
public class TableysServiceImpl implements ITableysService{
	
	@Autowired
	public TableysMapper tableysMapper;

	public List<Tableys> findAll() {
		return tableysMapper.findAll();
	}

	public void save(Tableys tableys) {
		tableysMapper.save(tableys);
	}

	public void deleteTableys(String t_id) {
		tableysMapper.deleteTableys(t_id);
	}

	public Tableys queryTableysById(String t_id) {
		return tableysMapper.queryTableysById(t_id);
	}
	

	public void updateTableys(Tableys tableys) {
		tableysMapper.updateTableys(tableys);
	}
	
	
}
