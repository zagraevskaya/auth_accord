package com.jwt.auth.service.impl;

import com.jwt.auth.dao.oracle.TmpIdocDepatmentDao;
import com.jwt.auth.model.oracle.TmpIdocDepartment;
import com.jwt.auth.service.TmpIdocDepartmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service(value = "tmpIdocDepartmentService")
public class TmpIdocDepartmentImpl implements TmpIdocDepartmentService {

    @Autowired
    @Qualifier("tmpIdocDepatmentDao")
    private TmpIdocDepatmentDao tmpIdocDepatmentDao;

    @Override
    public TmpIdocDepartment save(TmpIdocDepartment tmpIdocDepartment) {
        return  tmpIdocDepatmentDao.save(tmpIdocDepartment);
    }

    @Override
    public List<TmpIdocDepartment> findAll() {
        List<TmpIdocDepartment> list = new ArrayList<>();
        tmpIdocDepatmentDao.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public List<TmpIdocDepartment> getDepartments() {
        return tmpIdocDepatmentDao.getDepartmentsByBranchId(1);
    }

    @Override
    public List<TmpIdocDepartment> getBranches() {
        return tmpIdocDepatmentDao.getDepartmentsByBranchId(2);
    }

    @Override
    public void delete(int id) {
        tmpIdocDepatmentDao.deleteById(id);
    }

    @Override
    public TmpIdocDepartment findOne(String name) {
        return tmpIdocDepatmentDao.findByNameDepartment(name);
    }

    @Override
    public TmpIdocDepartment findById(int id) {

        Optional<TmpIdocDepartment> optionalTmpIdocDepartment = tmpIdocDepatmentDao.findById(id);
        return optionalTmpIdocDepartment.isPresent() ? optionalTmpIdocDepartment.get() : null;
    }

    @Override
    public TmpIdocDepartment update(TmpIdocDepartment tmpIdocDepartment) {
        TmpIdocDepartment tmpIdocDepartment_new = findById(tmpIdocDepartment.getId());
        if(tmpIdocDepartment_new != null) {
            BeanUtils.copyProperties(tmpIdocDepartment, tmpIdocDepartment_new);
            tmpIdocDepatmentDao.save(tmpIdocDepartment_new);
        }
        return tmpIdocDepartment_new;
    }
}
