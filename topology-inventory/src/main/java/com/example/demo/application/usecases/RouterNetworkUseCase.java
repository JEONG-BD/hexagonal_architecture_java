package com.example.demo.application.usecases;

import com.example.demo.domain.entity.Router;
import com.example.demo.domain.vo.Network;
import com.example.demo.domain.vo.RouterId;

public interface RouterNetworkUseCase {

    Router addNetworkToRouter(RouterId routerId, Network network);
}
