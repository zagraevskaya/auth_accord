package com.jwt.auth.dao.mySql;

import com.jwt.auth.model.mySql.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("roleDao")
@Transactional(transactionManager="mySqlTransactionManager")
public interface RoleDao extends CrudRepository<Role, Integer> {
    @Transactional(transactionManager="mySqlTransactionManager")
    Role findByRole(String name);
}

