package org.acme.bazinga.extension.runtime;

import org.acme.bazinga.extension.Bazinga;

public class BazingaImpl implements Bazinga {
    private final BazingaConfig bazingaConfig;

    public BazingaImpl(BazingaConfig bazingaConfig) {
        this.bazingaConfig = bazingaConfig;
    }

    @Override
    public String callSheldon() {
        return bazingaConfig.bazingaString() + " knock knock knock " + bazingaConfig.bazingaNumber();
    }
}
