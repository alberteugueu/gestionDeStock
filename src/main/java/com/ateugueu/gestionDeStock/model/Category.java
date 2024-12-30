package com.ateugueu.gestionDeStock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="category")
public class Category  extends AbstractEntity{

    @Column(name="code")
    private String code;

    @Column(name="designation")
    private String designation;

    @OneToMany(mappedBy = "category")
    private List<Article> articles;
}
