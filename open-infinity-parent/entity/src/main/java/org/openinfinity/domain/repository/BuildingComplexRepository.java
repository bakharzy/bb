package org.openinfinity.domain.repository;

import java.util.Collection;

import org.openinfinity.domain.entity.BuildingComplex;

public interface BuildingComplexRepository {

		String createBuildingComplex(String address);
		
		String deleteBuildingComplex(BuildingComplex buildingComplex);
		
		Collection<BuildingComplex> queryByAddress(String address);
		
		void updateBuildingComplexAddress(String address);
		
		Collection<BuildingComplex> listAll();
}
