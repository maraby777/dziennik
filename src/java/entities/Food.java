/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author maraby
 */
@Entity
@Table(name = "food")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Food.findAll", query = "SELECT f FROM Food f"),
    @NamedQuery(name = "Food.findByIdFood", query = "SELECT f FROM Food f WHERE f.idFood = :idFood"),
    @NamedQuery(name = "Food.findByName", query = "SELECT f FROM Food f WHERE f.name = :name"),
    @NamedQuery(name = "Food.findByKcal", query = "SELECT f FROM Food f WHERE f.kcal = :kcal"),
    @NamedQuery(name = "Food.findByProteins", query = "SELECT f FROM Food f WHERE f.proteins = :proteins"),
    @NamedQuery(name = "Food.findByFat", query = "SELECT f FROM Food f WHERE f.fat = :fat"),
    @NamedQuery(name = "Food.findByCarbohydrates", query = "SELECT f FROM Food f WHERE f.carbohydrates = :carbohydrates"),
    @NamedQuery(name = "Food.findByComments", query = "SELECT f FROM Food f WHERE f.comments = :comments"),
    @NamedQuery(name = "Food.findByIsComplex", query = "SELECT f FROM Food f WHERE f.isComplex = :isComplex")})
public class Food implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idFood")
    private Integer idFood;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @Column(name = "kcal")
    private Integer kcal;
    @Column(name = "proteins")
    private Integer proteins;
    @Column(name = "fat")
    private Integer fat;
    @Column(name = "carbohydrates")
    private Integer carbohydrates;
    @Size(max = 200)
    @Column(name = "comments")
    private String comments;
    @Column(name = "isComplex")
    private Boolean isComplex;
    @JoinColumn(name = "GroupFood_idGroupFood", referencedColumnName = "idGroupFood")
    @ManyToOne(optional = false)
    private Groupfood groupFoodidGroupFood;
    @OneToMany(mappedBy = "foodidFood14")
    private List<FoodHasFood> foodHasFoodList;
    @OneToMany(mappedBy = "foodidFood13")
    private List<FoodHasFood> foodHasFoodList1;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "food")
    private FoodHasFood foodHasFood;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foodidFood2")
    private List<FoodHasFood> foodHasFoodList2;
    @OneToMany(mappedBy = "foodidFood3")
    private List<FoodHasFood> foodHasFoodList3;
    @OneToMany(mappedBy = "foodidFood4")
    private List<FoodHasFood> foodHasFoodList4;
    @OneToMany(mappedBy = "foodidFood5")
    private List<FoodHasFood> foodHasFoodList5;
    @OneToMany(mappedBy = "foodidFood6")
    private List<FoodHasFood> foodHasFoodList6;
    @OneToMany(mappedBy = "foodidFood7")
    private List<FoodHasFood> foodHasFoodList7;
    @OneToMany(mappedBy = "foodidFood8")
    private List<FoodHasFood> foodHasFoodList8;
    @OneToMany(mappedBy = "foodidFood9")
    private List<FoodHasFood> foodHasFoodList9;
    @OneToMany(mappedBy = "foodidFood10")
    private List<FoodHasFood> foodHasFoodList10;
    @OneToMany(mappedBy = "foodidFood11")
    private List<FoodHasFood> foodHasFoodList11;
    @OneToMany(mappedBy = "foodidFood12")
    private List<FoodHasFood> foodHasFoodList12;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foodidFood")
    private List<Diares> diaresList;

    public Food() {
    }

    public Food(Integer idFood) {
        this.idFood = idFood;
    }

    public Integer getIdFood() {
        return idFood;
    }

    public void setIdFood(Integer idFood) {
        this.idFood = idFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getKcal() {
        return kcal;
    }

    public void setKcal(Integer kcal) {
        this.kcal = kcal;
    }

    public Integer getProteins() {
        return proteins;
    }

    public void setProteins(Integer proteins) {
        this.proteins = proteins;
    }

    public Integer getFat() {
        return fat;
    }

    public void setFat(Integer fat) {
        this.fat = fat;
    }

    public Integer getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Integer carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean getIsComplex() {
        return isComplex;
    }

    public void setIsComplex(Boolean isComplex) {
        this.isComplex = isComplex;
    }

    public Groupfood getGroupFoodidGroupFood() {
        return groupFoodidGroupFood;
    }

    public void setGroupFoodidGroupFood(Groupfood groupFoodidGroupFood) {
        this.groupFoodidGroupFood = groupFoodidGroupFood;
    }

    @XmlTransient
    public List<FoodHasFood> getFoodHasFoodList() {
        return foodHasFoodList;
    }

    public void setFoodHasFoodList(List<FoodHasFood> foodHasFoodList) {
        this.foodHasFoodList = foodHasFoodList;
    }

    @XmlTransient
    public List<FoodHasFood> getFoodHasFoodList1() {
        return foodHasFoodList1;
    }

    public void setFoodHasFoodList1(List<FoodHasFood> foodHasFoodList1) {
        this.foodHasFoodList1 = foodHasFoodList1;
    }

    public FoodHasFood getFoodHasFood() {
        return foodHasFood;
    }

    public void setFoodHasFood(FoodHasFood foodHasFood) {
        this.foodHasFood = foodHasFood;
    }

    @XmlTransient
    public List<FoodHasFood> getFoodHasFoodList2() {
        return foodHasFoodList2;
    }

    public void setFoodHasFoodList2(List<FoodHasFood> foodHasFoodList2) {
        this.foodHasFoodList2 = foodHasFoodList2;
    }

    @XmlTransient
    public List<FoodHasFood> getFoodHasFoodList3() {
        return foodHasFoodList3;
    }

    public void setFoodHasFoodList3(List<FoodHasFood> foodHasFoodList3) {
        this.foodHasFoodList3 = foodHasFoodList3;
    }

    @XmlTransient
    public List<FoodHasFood> getFoodHasFoodList4() {
        return foodHasFoodList4;
    }

    public void setFoodHasFoodList4(List<FoodHasFood> foodHasFoodList4) {
        this.foodHasFoodList4 = foodHasFoodList4;
    }

    @XmlTransient
    public List<FoodHasFood> getFoodHasFoodList5() {
        return foodHasFoodList5;
    }

    public void setFoodHasFoodList5(List<FoodHasFood> foodHasFoodList5) {
        this.foodHasFoodList5 = foodHasFoodList5;
    }

    @XmlTransient
    public List<FoodHasFood> getFoodHasFoodList6() {
        return foodHasFoodList6;
    }

    public void setFoodHasFoodList6(List<FoodHasFood> foodHasFoodList6) {
        this.foodHasFoodList6 = foodHasFoodList6;
    }

    @XmlTransient
    public List<FoodHasFood> getFoodHasFoodList7() {
        return foodHasFoodList7;
    }

    public void setFoodHasFoodList7(List<FoodHasFood> foodHasFoodList7) {
        this.foodHasFoodList7 = foodHasFoodList7;
    }

    @XmlTransient
    public List<FoodHasFood> getFoodHasFoodList8() {
        return foodHasFoodList8;
    }

    public void setFoodHasFoodList8(List<FoodHasFood> foodHasFoodList8) {
        this.foodHasFoodList8 = foodHasFoodList8;
    }

    @XmlTransient
    public List<FoodHasFood> getFoodHasFoodList9() {
        return foodHasFoodList9;
    }

    public void setFoodHasFoodList9(List<FoodHasFood> foodHasFoodList9) {
        this.foodHasFoodList9 = foodHasFoodList9;
    }

    @XmlTransient
    public List<FoodHasFood> getFoodHasFoodList10() {
        return foodHasFoodList10;
    }

    public void setFoodHasFoodList10(List<FoodHasFood> foodHasFoodList10) {
        this.foodHasFoodList10 = foodHasFoodList10;
    }

    @XmlTransient
    public List<FoodHasFood> getFoodHasFoodList11() {
        return foodHasFoodList11;
    }

    public void setFoodHasFoodList11(List<FoodHasFood> foodHasFoodList11) {
        this.foodHasFoodList11 = foodHasFoodList11;
    }

    @XmlTransient
    public List<FoodHasFood> getFoodHasFoodList12() {
        return foodHasFoodList12;
    }

    public void setFoodHasFoodList12(List<FoodHasFood> foodHasFoodList12) {
        this.foodHasFoodList12 = foodHasFoodList12;
    }

    @XmlTransient
    public List<Diares> getDiaresList() {
        return diaresList;
    }

    public void setDiaresList(List<Diares> diaresList) {
        this.diaresList = diaresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFood != null ? idFood.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Food)) {
            return false;
        }
        Food other = (Food) object;
        if ((this.idFood == null && other.idFood != null) || (this.idFood != null && !this.idFood.equals(other.idFood))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Food[ idFood=" + idFood + " ]";
    }
    
}
