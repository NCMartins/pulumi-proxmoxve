// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Permission.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserAcl {
    /**
     * @return The path.
     * 
     */
    private String path;
    /**
     * @return Whether to propagate to child paths.
     * 
     */
    private @Nullable Boolean propagate;
    /**
     * @return The role identifier.
     * 
     */
    private String roleId;

    private UserAcl() {}
    /**
     * @return The path.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Whether to propagate to child paths.
     * 
     */
    public Optional<Boolean> propagate() {
        return Optional.ofNullable(this.propagate);
    }
    /**
     * @return The role identifier.
     * 
     */
    public String roleId() {
        return this.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAcl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String path;
        private @Nullable Boolean propagate;
        private String roleId;
        public Builder() {}
        public Builder(UserAcl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.propagate = defaults.propagate;
    	      this.roleId = defaults.roleId;
        }

        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder propagate(@Nullable Boolean propagate) {
            this.propagate = propagate;
            return this;
        }
        @CustomType.Setter
        public Builder roleId(String roleId) {
            this.roleId = Objects.requireNonNull(roleId);
            return this;
        }
        public UserAcl build() {
            final var _resultValue = new UserAcl();
            _resultValue.path = path;
            _resultValue.propagate = propagate;
            _resultValue.roleId = roleId;
            return _resultValue;
        }
    }
}
