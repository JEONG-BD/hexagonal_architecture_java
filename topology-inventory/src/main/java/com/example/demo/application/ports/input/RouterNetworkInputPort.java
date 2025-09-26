package com.example.demo.application.ports.input;

import com.example.demo.application.ports.output.RouterNetworkOutputPort;
import com.example.demo.application.usecases.RouterNetworkUseCase;
import com.example.demo.domain.entity.Router;
import com.example.demo.domain.service.NetworkOperation;
import com.example.demo.domain.vo.Network;
import com.example.demo.domain.vo.RouterId;

public class RouterNetworkInputPort implements RouterNetworkUseCase {
    private final RouterNetworkOutputPort routerNetworkOutputPort;

    public RouterNetworkInputPort(RouterNetworkOutputPort routerNetworkOutputPort){
        this.routerNetworkOutputPort = routerNetworkOutputPort;
    }

    @Override
    public Router addNetworkToRouter(RouterId routerId, Network network) {
        var router = fetchRouter(routerId);
        return createNetwork(router, network);
    }

    private Router fetchRouter(RouterId routerId) {
        return routerNetworkOutputPort.fetchRouterById(routerId);
    }

    private Router createNetwork(Router router, Network network) {
        var newRouter = NetworkOperation.createNewNetwork(router, network);
        return persistNetwork(router) ? newRouter :
                router;
    }

    private boolean persistNetwork(Router router) {
        return routerNetworkOutputPort.persistRouter(router);
    }

}
