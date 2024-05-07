package org.acme.bazinga.extension.runtime;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigMapping(prefix = "quarkus.bazinga")
@ConfigRoot(phase = ConfigPhase.RUN_TIME)
public interface BazingaConfig {

    /**
     * The Bazinga String
     */
    String bazingaString();

    /**
     * The Bazinga Number
     */
    @WithDefault("250")
    int bazingaNumber();
}