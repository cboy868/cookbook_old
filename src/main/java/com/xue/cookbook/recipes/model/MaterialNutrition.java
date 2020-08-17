package com.xue.cookbook.recipes.model;

import java.io.Serializable;
import java.util.Date;

public class MaterialNutrition implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_nutrition.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_nutrition.material_id
     *
     * @mbg.generated
     */
    private Long materialId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_nutrition.material_type_id
     *
     * @mbg.generated
     */
    private Long materialTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_nutrition.quality
     *
     * @mbg.generated
     */
    private Long quality;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_nutrition.deleted_at
     *
     * @mbg.generated
     */
    private Date deletedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_nutrition.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_nutrition.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table material_nutrition
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_nutrition.id
     *
     * @return the value of material_nutrition.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_nutrition.id
     *
     * @param id the value for material_nutrition.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_nutrition.material_id
     *
     * @return the value of material_nutrition.material_id
     *
     * @mbg.generated
     */
    public Long getMaterialId() {
        return materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_nutrition.material_id
     *
     * @param materialId the value for material_nutrition.material_id
     *
     * @mbg.generated
     */
    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_nutrition.material_type_id
     *
     * @return the value of material_nutrition.material_type_id
     *
     * @mbg.generated
     */
    public Long getMaterialTypeId() {
        return materialTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_nutrition.material_type_id
     *
     * @param materialTypeId the value for material_nutrition.material_type_id
     *
     * @mbg.generated
     */
    public void setMaterialTypeId(Long materialTypeId) {
        this.materialTypeId = materialTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_nutrition.quality
     *
     * @return the value of material_nutrition.quality
     *
     * @mbg.generated
     */
    public Long getQuality() {
        return quality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_nutrition.quality
     *
     * @param quality the value for material_nutrition.quality
     *
     * @mbg.generated
     */
    public void setQuality(Long quality) {
        this.quality = quality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_nutrition.deleted_at
     *
     * @return the value of material_nutrition.deleted_at
     *
     * @mbg.generated
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_nutrition.deleted_at
     *
     * @param deletedAt the value for material_nutrition.deleted_at
     *
     * @mbg.generated
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_nutrition.created_at
     *
     * @return the value of material_nutrition.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_nutrition.created_at
     *
     * @param createdAt the value for material_nutrition.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_nutrition.updated_at
     *
     * @return the value of material_nutrition.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_nutrition.updated_at
     *
     * @param updatedAt the value for material_nutrition.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_nutrition
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
        sb.append(", materialId=").append(materialId);
        sb.append(", materialTypeId=").append(materialTypeId);
        sb.append(", quality=").append(quality);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}