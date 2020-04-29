package com.jwt.auth.dao;


import com.jwt.auth.model.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TmpIdocDepatmentDao extends CrudRepository<TmpIdocDepartment, Integer> {
    TmpIdocDepartment findByNameDepartment(String name);

    @Query("select b from TmpIdocDepartment b where b.branchId = :branchId")    //This is using a named query method
    List<TmpIdocDepartment> getDepartmentsByBranchId(@Param("branchId") Integer branchId);
}
