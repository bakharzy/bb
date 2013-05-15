package org.openinfinity.domain.service;

import java.util.Collection;

import org.openinfinity.domain.entity.BuildingComplex;

public interface BuildingComplexService {

		String createBuildingComplex(String address);
		
		void deleteBuildingComplex(BuildingComplex buildingComplex);
		
		Collection<BuildingComplex> queryByAddress(String address);
		
		void updateBuildingComplexAddress(String building_id,String address);
		
		Collection<BuildingComplex> listAll();
}
