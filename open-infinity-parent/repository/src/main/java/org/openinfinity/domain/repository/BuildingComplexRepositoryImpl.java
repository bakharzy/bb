package org.openinfinity.domain.repository;

import java.util.Collection;

import org.openinfinity.domain.entity.BuildingComplex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
public class BuildingComplexRepositoryImpl implements BuildingComplexRepository{

	@Autowired
	MongoTemplate dbManager;
	
	@Override
	public String saveBuildingComplex(BuildingComplex building) {
		dbManager.save(building);
		return building.getId();
	}

	@Override
	public void removeBuildingComplex(BuildingComplex buildingComplex) {
		dbManager.remove(buildingComplex);		
	}

	@Override
	public Collection<BuildingComplex> queryByAddress(String address) {		
		Query query = new Query(Criteria.where("address").is(address));		
		return dbManager.find(query, BuildingComplex.class);
	}

	@Override
	public void updateBuildingComplexAddress(String id,String address) {				
		Query query = new Query(Criteria.where("id").is(id));		
		dbManager.findAndModify(query, Update.update("address", address), BuildingComplex.class);
	}

	@Override
	public Collection<BuildingComplex> listAll() {			
		return dbManager.findAll(BuildingComplex.class);
	}

	@Override
	public void removeAll() {
		Collection<BuildingComplex> all = dbManager.findAll(BuildingComplex.class);
		for(BuildingComplex b: all){
			dbManager.remove(b);			
		}		
	}

	@Override
	public BuildingComplex findById(String id) {
		
		return dbManager.findById(new Query(Criteria.where("id").is(id)), BuildingComplex.class); 
	}
	

}
