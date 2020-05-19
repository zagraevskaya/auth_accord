package com.jwt.auth.service;

import com.jwt.auth.model.oracle.TmpIdocDepartment;

import java.util.List;

public interface TmpIdocDepartmentService {

    TmpIdocDepartment save(TmpIdocDepartment tmpIdocDepartment);
    List<TmpIdocDepartment> findAll();
    List<TmpIdocDepartment> getDepartments();
    List<TmpIdocDepartment> getBranches();
    void delete(int id);
    TmpIdocDepartment findOne(String name);
    TmpIdocDepartment findById(int id);
    TmpIdocDepartment update(TmpIdocDepartment tmpIdocDepartment);


}
