package com.example.demo.domain.specification;

import com.example.demo.domain.entity.Router;
import com.example.demo.domain.vo.RouterType;

public class RouterTypeSpecification extends AbstractSpecification<Router> {
    @Override
    public boolean isSatisfiedBy(Router router) {
        return router.getRouterType().equals(RouterType.EDGE) || router.getRouterType().equals(RouterType.CORE);
    }
}
