package com.example.demo.domain.specification;


public abstract class AbstractSpecification<T> implementscification<T>{
    public abstract boolean isSatisfiedBy(T t);
    public Specification<T> and(final Specification<T> specification){
        return new AndSpecification<T>(this, specification);
    }

}
