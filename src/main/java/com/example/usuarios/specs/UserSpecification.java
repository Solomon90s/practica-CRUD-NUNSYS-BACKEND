package com.example.usuarios.specs;


import com.example.usuarios.domain.entity.User;
import com.example.usuarios.specs.shared.EntitySpecification;
import com.example.usuarios.specs.shared.SearchCriteria;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public class UserSpecification extends EntitySpecification<User> implements Specification<User> {


    public UserSpecification(List<SearchCriteria> criteria) {
        this.criteria = criteria;
    }



}
