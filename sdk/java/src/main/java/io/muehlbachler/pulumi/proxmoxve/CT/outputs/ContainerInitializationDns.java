// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerInitializationDns {
    /**
     * @return The DNS search domain.
     * 
     */
    private @Nullable String domain;
    /**
     * @return The DNS server.
     * 
     */
    private @Nullable String server;

    private ContainerInitializationDns() {}
    /**
     * @return The DNS search domain.
     * 
     */
    public Optional<String> domain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * @return The DNS server.
     * 
     */
    public Optional<String> server() {
        return Optional.ofNullable(this.server);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerInitializationDns defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String domain;
        private @Nullable String server;
        public Builder() {}
        public Builder(ContainerInitializationDns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.server = defaults.server;
        }

        @CustomType.Setter
        public Builder domain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }
        @CustomType.Setter
        public Builder server(@Nullable String server) {
            this.server = server;
            return this;
        }
        public ContainerInitializationDns build() {
            final var _resultValue = new ContainerInitializationDns();
            _resultValue.domain = domain;
            _resultValue.server = server;
            return _resultValue;
        }
    }
}
