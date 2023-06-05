// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Permission.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRolesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<List<String>> privileges;
    private List<String> roleIds;
    private List<Boolean> specials;

    private GetRolesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<List<String>> privileges() {
        return this.privileges;
    }
    public List<String> roleIds() {
        return this.roleIds;
    }
    public List<Boolean> specials() {
        return this.specials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRolesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<List<String>> privileges;
        private List<String> roleIds;
        private List<Boolean> specials;
        public Builder() {}
        public Builder(GetRolesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.privileges = defaults.privileges;
    	      this.roleIds = defaults.roleIds;
    	      this.specials = defaults.specials;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder privileges(List<List<String>> privileges) {
            this.privileges = Objects.requireNonNull(privileges);
            return this;
        }
        @CustomType.Setter
        public Builder roleIds(List<String> roleIds) {
            this.roleIds = Objects.requireNonNull(roleIds);
            return this;
        }
        public Builder roleIds(String... roleIds) {
            return roleIds(List.of(roleIds));
        }
        @CustomType.Setter
        public Builder specials(List<Boolean> specials) {
            this.specials = Objects.requireNonNull(specials);
            return this;
        }
        public Builder specials(Boolean... specials) {
            return specials(List.of(specials));
        }
        public GetRolesResult build() {
            final var o = new GetRolesResult();
            o.id = id;
            o.privileges = privileges;
            o.roleIds = roleIds;
            o.specials = specials;
            return o;
        }
    }
}