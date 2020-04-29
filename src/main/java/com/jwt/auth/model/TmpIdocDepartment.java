package com.jwt.auth.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tmp_idoc_department", schema = "accord")
public class TmpIdocDepartment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column(name = "name_department")
    private String nameDepartment;
    @Basic
    @Column(name = "code_ispro")
    private String codeIspro;
    @Basic
    @Column(name = "order_code")
    private Integer orderCode;
    @Basic
    @Column(name = "branch_id")
    private Integer branchId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }


    public String getCodeIspro() {
        return codeIspro;
    }

    public void setCodeIspro(String codeIspro) {
        this.codeIspro = codeIspro;
    }


    public Integer getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(Integer orderCode) {
        this.orderCode = orderCode;
    }


    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TmpIdocDepartment that = (TmpIdocDepartment) o;
        return id == that.id &&
                Objects.equals(nameDepartment, that.nameDepartment) &&
                Objects.equals(codeIspro, that.codeIspro) &&
                Objects.equals(orderCode, that.orderCode) &&
                Objects.equals(branchId, that.branchId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameDepartment, codeIspro, orderCode, branchId);
    }
}
