package org.openinfinity.domain.repository;

import java.util.Collection;

import org.openinfinity.domain.entity.BuildingComplex;

public interface BuildingComplexRepository {

		String saveBuildingComplex(BuildingComplex building);
		
		void removeBuildingComplex(BuildingComplex buildingComplex);
		
		Collection<BuildingComplex> queryByAddress(String address);
		
		BuildingComplex findById(String id);
		
		void updateBuildingComplexAddress(String building_id, String address);
		
		Collection<BuildingComplex> listAll();
		
		void removeAll();
}
