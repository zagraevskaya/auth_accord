package com.jwt.auth.dao.oracle;


import com.jwt.auth.model.oracle.TmpIdocDepartment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("tmpIdocDepatmentDao")
@Transactional(transactionManager="tmpIdocTransactionManager")
public interface TmpIdocDepatmentDao extends CrudRepository<TmpIdocDepartment, Integer> {
    TmpIdocDepartment findByNameDepartment(String name);

    @Query("select b from TmpIdocDepartment b where b.branchId = :branchId " +
            "and codeIspro not in ('02','97','98') order by codeIspro")    //This is using a named query method
    List<TmpIdocDepartment> getDepartmentsByBranchId(@Param("branchId") Integer branchId);
}
