package com.github.kuzznya.quarkus.reactive.querier.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class QuarkusReactiveQuerierProcessor {

    private static final String FEATURE = "quarkus-reactive-querier";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
