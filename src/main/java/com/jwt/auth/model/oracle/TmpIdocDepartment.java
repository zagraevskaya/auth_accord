package com.jwt.auth.model.oracle;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TMP_IDOC_DEPARTMENT", schema = "SR_BANK")
public class TmpIdocDepartment implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    @Column(name = "NAME_DEPARTMENT")
    private String nameDepartment;
    @Basic
    @Column(name = "CODE_ISPRO")
    private String codeIspro;
    @Basic
    @Column(name = "ORDER_CODE")
    private Integer orderCode;
    @Basic
    @Column(name = "BRANCH_ID")
    private Integer branchId;

    @Basic
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME_DEPARTMENT")
    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    @Basic
    @Column(name = "CODE_ISPRO")
    public String getCodeIspro() {
        return codeIspro;
    }

    public void setCodeIspro(String codeIspro) {
        this.codeIspro = codeIspro;
    }

    @Basic
    @Column(name = "ORDER_CODE")
    public Integer getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(Integer orderCode) {
        this.orderCode = orderCode;
    }

    @Basic
    @Column(name = "BRANCH_ID")
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
