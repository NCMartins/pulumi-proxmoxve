// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualMachinesVm {
    /**
     * @return The virtual machine name.
     * 
     */
    private String name;
    /**
     * @return The node name.
     * 
     */
    private String nodeName;
    /**
     * @return A list of tags to filter the VMs. The VM must have all
     * the tags to be included in the result.
     * 
     */
    private List<String> tags;
    /**
     * @return The VM identifier.
     * 
     */
    private Integer vmId;

    private GetVirtualMachinesVm() {}
    /**
     * @return The virtual machine name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The node name.
     * 
     */
    public String nodeName() {
        return this.nodeName;
    }
    /**
     * @return A list of tags to filter the VMs. The VM must have all
     * the tags to be included in the result.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return The VM identifier.
     * 
     */
    public Integer vmId() {
        return this.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachinesVm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String nodeName;
        private List<String> tags;
        private Integer vmId;
        public Builder() {}
        public Builder(GetVirtualMachinesVm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.nodeName = defaults.nodeName;
    	      this.tags = defaults.tags;
    	      this.vmId = defaults.vmId;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nodeName(String nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder vmId(Integer vmId) {
            this.vmId = Objects.requireNonNull(vmId);
            return this;
        }
        public GetVirtualMachinesVm build() {
            final var _resultValue = new GetVirtualMachinesVm();
            _resultValue.name = name;
            _resultValue.nodeName = nodeName;
            _resultValue.tags = tags;
            _resultValue.vmId = vmId;
            return _resultValue;
        }
    }
}
