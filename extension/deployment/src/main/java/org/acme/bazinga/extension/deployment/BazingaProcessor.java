package org.acme.bazinga.extension.deployment;

import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import org.acme.bazinga.extension.runtime.BazingaBuildTimeConfig;
import org.acme.bazinga.extension.runtime.BazingaConditionalProducer;
import org.acme.bazinga.extension.runtime.BazingaProducer;

import java.util.function.BooleanSupplier;

public class BazingaProcessor {

    static class BazingaEnabled implements BooleanSupplier {
        BazingaBuildTimeConfig bazingaBuildTimeConfig;

        public boolean getAsBoolean() {
            return bazingaBuildTimeConfig.enabled();
        }
    }

    @BuildStep(onlyIf = BazingaEnabled.class)
    void registerBeans(BuildProducer<AdditionalBeanBuildItem> additionalBeans,
                       BazingaBuildTimeConfig bazingaBuildTimeConfig) {
        additionalBeans.produce(AdditionalBeanBuildItem.builder()
                                                       .addBeanClasses(BazingaProducer.class)
                                                       .setUnremovable()
                                                       .build());
        if (!bazingaBuildTimeConfig.stub()) {
            additionalBeans.produce(AdditionalBeanBuildItem.builder()
                                                           .addBeanClasses(BazingaConditionalProducer.class)
                                                           .setUnremovable()
                                                           .build());
        }
    }
}
