package com.telemedicine.rest.telemedicine.repository;


import com.telemedicine.rest.telemedicine.entity.LifelogRibbonBs;
import com.telemedicine.rest.telemedicine.entity.MemberInfo;
import com.telemedicine.rest.telemedicine.entity.TelemedicineList;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "telemedicines", path = "telemedicines")
public interface TelemedicineListRepository extends PagingAndSortingRepository<TelemedicineList, String> {
    List<TelemedicineList> findByFromId(@Param("userid") String userid);
    List<TelemedicineList> findByToId(@Param("userid") String userid);
}



