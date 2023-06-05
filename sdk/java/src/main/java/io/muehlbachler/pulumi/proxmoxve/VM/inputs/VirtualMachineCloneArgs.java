// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineCloneArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineCloneArgs Empty = new VirtualMachineCloneArgs();

    @Import(name="datastoreId")
    private @Nullable Output<String> datastoreId;

    public Optional<Output<String>> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }

    @Import(name="full")
    private @Nullable Output<Boolean> full;

    public Optional<Output<Boolean>> full() {
        return Optional.ofNullable(this.full);
    }

    @Import(name="nodeName")
    private @Nullable Output<String> nodeName;

    public Optional<Output<String>> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }

    @Import(name="retries")
    private @Nullable Output<Integer> retries;

    public Optional<Output<Integer>> retries() {
        return Optional.ofNullable(this.retries);
    }

    @Import(name="vmId", required=true)
    private Output<Integer> vmId;

    public Output<Integer> vmId() {
        return this.vmId;
    }

    private VirtualMachineCloneArgs() {}

    private VirtualMachineCloneArgs(VirtualMachineCloneArgs $) {
        this.datastoreId = $.datastoreId;
        this.full = $.full;
        this.nodeName = $.nodeName;
        this.retries = $.retries;
        this.vmId = $.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineCloneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineCloneArgs $;

        public Builder() {
            $ = new VirtualMachineCloneArgs();
        }

        public Builder(VirtualMachineCloneArgs defaults) {
            $ = new VirtualMachineCloneArgs(Objects.requireNonNull(defaults));
        }

        public Builder datastoreId(@Nullable Output<String> datastoreId) {
            $.datastoreId = datastoreId;
            return this;
        }

        public Builder datastoreId(String datastoreId) {
            return datastoreId(Output.of(datastoreId));
        }

        public Builder full(@Nullable Output<Boolean> full) {
            $.full = full;
            return this;
        }

        public Builder full(Boolean full) {
            return full(Output.of(full));
        }

        public Builder nodeName(@Nullable Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        public Builder retries(@Nullable Output<Integer> retries) {
            $.retries = retries;
            return this;
        }

        public Builder retries(Integer retries) {
            return retries(Output.of(retries));
        }

        public Builder vmId(Output<Integer> vmId) {
            $.vmId = vmId;
            return this;
        }

        public Builder vmId(Integer vmId) {
            return vmId(Output.of(vmId));
        }

        public VirtualMachineCloneArgs build() {
            $.vmId = Objects.requireNonNull($.vmId, "expected parameter 'vmId' to be non-null");
            return $;
        }
    }

}