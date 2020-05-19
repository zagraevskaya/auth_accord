package com.jwt.auth.dao.mySql;

import com.jwt.auth.model.mySql.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("userDao")
@Transactional(transactionManager="mySqlTransactionManager")
public interface UserDao extends CrudRepository<User, Integer> {
    @Transactional(transactionManager="mySqlTransactionManager")
    User findByName(String name);

    @Transactional(transactionManager="mySqlTransactionManager")
    User findByEmail(String email);
}
