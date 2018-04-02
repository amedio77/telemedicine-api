package com.telemedicine.rest.telemedicine.repository;


import com.telemedicine.rest.telemedicine.entity.LifelogBoryungBp;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "lifelogbb", path = "lifelogbb")
public interface LifelogBoryungBpRepository extends PagingAndSortingRepository<LifelogBoryungBp, String> {
    List<LifelogBoryungBp> findByUserId(@Param("userid") String userid);
}



