package org.bildit.service;

import java.util.List;

import org.bildit.dao.Mobilni;
import org.bildit.dao.MobilniDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("mobilniService")
public class MobilniService {

	private MobilniDAO mobilniDao;

	@Autowired
	public void setMobilniDao(MobilniDAO mobilniDao) {
		this.mobilniDao = mobilniDao;
	}

	public List<Mobilni> getAll() {
		return mobilniDao.getMobilni();
	}
	public boolean createMobilni(Mobilni mobilni){
		return mobilniDao.create(mobilni);
	}
	public boolean deleteMobilni(int id){
		return mobilniDao.delete(id);
	}
	public List<Mobilni> searchMobilni(String term){
		return mobilniDao.searchMobilni(term);
	}
}
