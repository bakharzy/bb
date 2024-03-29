package org.openinfinity.domain.service;

import java.util.Collection;

import org.openinfinity.domain.entity.BuildingComplex;
import org.openinfinity.domain.repository.BuildingComplexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingComplexServiceImpl implements BuildingComplexService {
	@Autowired
	BuildingComplexRepository repo;
	
	@Override
	public String createBuildingComplex(String address) {
		/*
		 * check for "new building" already exists in DB must be done here
		 */
		BuildingComplex building = new BuildingComplex();
		building.setAddress(address);
		repo.saveBuildingComplex(building);
		return building.getId();
	}

	@Override
	public void deleteBuildingComplex(BuildingComplex buildingComplex) {	
		 repo.removeBuildingComplex(buildingComplex);
	}

	@Override
	public Collection<BuildingComplex> queryByAddress(String address) {	
		return repo.queryByAddress(address);
	}

	@Override
	public void updateBuildingComplexAddress(String building_id,String address) {
		repo.updateBuildingComplexAddress(building_id, address);

	}

	@Override
	public Collection<BuildingComplex> listAll() {		
		return repo.listAll();
	}

}
