package com.example.demo.application.ports.output;

import com.example.demo.domain.entity.Router;
import com.example.demo.domain.vo.RouterId;

public interface RouterNetworkOutputPort {

    Router fectchRouterId(RouterId routerId);

    boolean persistRouter(Router router);
}
