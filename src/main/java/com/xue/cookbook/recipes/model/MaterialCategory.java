package com.xue.cookbook.recipes.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import com.xue.cookbook.core.contracts.TreeInterface;

public class MaterialCategory implements Serializable,TreeInterface {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_category.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_category.pid
     *
     * @mbg.generated
     */
    private Long pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_category.level
     *
     * @mbg.generated
     */
    private Short level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_category.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_category.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_category.sort
     *
     * @mbg.generated
     */
    private Byte sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_category.is_leaf
     *
     * @mbg.generated
     */
    private Byte isLeaf;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_category.cover
     *
     * @mbg.generated
     */
    private String cover;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_category.deleted_at
     *
     * @mbg.generated
     */
    private Date deletedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_category.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_category.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;


    Set<TreeInterface> children;

    public Set<TreeInterface> getChildren() {
        return this.children;
    }

    public void setChildren(Set<TreeInterface> children) {
        this.children = children;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_category.intro
     *
     * @mbg.generated
     */
    private String intro;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table material_category
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_category.id
     *
     * @return the value of material_category.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_category.id
     *
     * @param id the value for material_category.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_category.pid
     *
     * @return the value of material_category.pid
     *
     * @mbg.generated
     */
    public Long getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_category.pid
     *
     * @param pid the value for material_category.pid
     *
     * @mbg.generated
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_category.level
     *
     * @return the value of material_category.level
     *
     * @mbg.generated
     */
    public Short getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_category.level
     *
     * @param level the value for material_category.level
     *
     * @mbg.generated
     */
    public void setLevel(Short level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_category.code
     *
     * @return the value of material_category.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_category.code
     *
     * @param code the value for material_category.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_category.name
     *
     * @return the value of material_category.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_category.name
     *
     * @param name the value for material_category.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_category.sort
     *
     * @return the value of material_category.sort
     *
     * @mbg.generated
     */
    public Byte getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_category.sort
     *
     * @param sort the value for material_category.sort
     *
     * @mbg.generated
     */
    public void setSort(Byte sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_category.is_leaf
     *
     * @return the value of material_category.is_leaf
     *
     * @mbg.generated
     */
    public Byte getIsLeaf() {
        return isLeaf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_category.is_leaf
     *
     * @param isLeaf the value for material_category.is_leaf
     *
     * @mbg.generated
     */
    public void setIsLeaf(Byte isLeaf) {
        this.isLeaf = isLeaf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_category.cover
     *
     * @return the value of material_category.cover
     *
     * @mbg.generated
     */
    public String getCover() {
        return cover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_category.cover
     *
     * @param cover the value for material_category.cover
     *
     * @mbg.generated
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_category.deleted_at
     *
     * @return the value of material_category.deleted_at
     *
     * @mbg.generated
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_category.deleted_at
     *
     * @param deletedAt the value for material_category.deleted_at
     *
     * @mbg.generated
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_category.created_at
     *
     * @return the value of material_category.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_category.created_at
     *
     * @param createdAt the value for material_category.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_category.updated_at
     *
     * @return the value of material_category.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_category.updated_at
     *
     * @param updatedAt the value for material_category.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_category.intro
     *
     * @return the value of material_category.intro
     *
     * @mbg.generated
     */
    public String getIntro() {
        return intro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_category.intro
     *
     * @param intro the value for material_category.intro
     *
     * @mbg.generated
     */
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_category
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pid=").append(pid);
        sb.append(", level=").append(level);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", sort=").append(sort);
        sb.append(", isLeaf=").append(isLeaf);
        sb.append(", cover=").append(cover);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", intro=").append(intro);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}