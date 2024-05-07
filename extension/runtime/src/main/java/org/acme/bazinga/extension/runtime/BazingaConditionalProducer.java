
package org.acme.bazinga.extension.runtime;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Produces;
import org.acme.bazinga.extension.Bazinga;

@Dependent
public class BazingaConditionalProducer {
    @Produces
    @ApplicationScoped
    @Alternative
    @Priority(1)
    Bazinga realBazinga(BazingaConfig config) {
        return new BazingaImpl(config);
    }
}
