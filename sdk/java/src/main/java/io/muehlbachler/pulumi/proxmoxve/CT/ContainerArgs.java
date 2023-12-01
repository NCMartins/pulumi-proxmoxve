// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.muehlbachler.pulumi.proxmoxve.CT.inputs.ContainerCloneArgs;
import io.muehlbachler.pulumi.proxmoxve.CT.inputs.ContainerConsoleArgs;
import io.muehlbachler.pulumi.proxmoxve.CT.inputs.ContainerCpuArgs;
import io.muehlbachler.pulumi.proxmoxve.CT.inputs.ContainerDiskArgs;
import io.muehlbachler.pulumi.proxmoxve.CT.inputs.ContainerFeaturesArgs;
import io.muehlbachler.pulumi.proxmoxve.CT.inputs.ContainerInitializationArgs;
import io.muehlbachler.pulumi.proxmoxve.CT.inputs.ContainerMemoryArgs;
import io.muehlbachler.pulumi.proxmoxve.CT.inputs.ContainerMountPointArgs;
import io.muehlbachler.pulumi.proxmoxve.CT.inputs.ContainerNetworkInterfaceArgs;
import io.muehlbachler.pulumi.proxmoxve.CT.inputs.ContainerOperatingSystemArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerArgs Empty = new ContainerArgs();

    /**
     * The cloning configuration.
     * 
     */
    @Import(name="clone")
    private @Nullable Output<ContainerCloneArgs> clone;

    /**
     * @return The cloning configuration.
     * 
     */
    public Optional<Output<ContainerCloneArgs>> clone_() {
        return Optional.ofNullable(this.clone);
    }

    /**
     * Console.
     * 
     */
    @Import(name="console")
    private @Nullable Output<ContainerConsoleArgs> console;

    /**
     * @return Console.
     * 
     */
    public Optional<Output<ContainerConsoleArgs>> console() {
        return Optional.ofNullable(this.console);
    }

    /**
     * The CPU configuration.
     * 
     */
    @Import(name="cpu")
    private @Nullable Output<ContainerCpuArgs> cpu;

    /**
     * @return The CPU configuration.
     * 
     */
    public Optional<Output<ContainerCpuArgs>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * The description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The disk configuration.
     * 
     */
    @Import(name="disk")
    private @Nullable Output<ContainerDiskArgs> disk;

    /**
     * @return The disk configuration.
     * 
     */
    public Optional<Output<ContainerDiskArgs>> disk() {
        return Optional.ofNullable(this.disk);
    }

    /**
     * The container feature flags. Changing flags (except nesting) is only allowed for `root@pam` authenticated user.
     * 
     */
    @Import(name="features")
    private @Nullable Output<ContainerFeaturesArgs> features;

    /**
     * @return The container feature flags. Changing flags (except nesting) is only allowed for `root@pam` authenticated user.
     * 
     */
    public Optional<Output<ContainerFeaturesArgs>> features() {
        return Optional.ofNullable(this.features);
    }

    /**
     * The initialization configuration.
     * 
     */
    @Import(name="initialization")
    private @Nullable Output<ContainerInitializationArgs> initialization;

    /**
     * @return The initialization configuration.
     * 
     */
    public Optional<Output<ContainerInitializationArgs>> initialization() {
        return Optional.ofNullable(this.initialization);
    }

    /**
     * The memory configuration.
     * 
     */
    @Import(name="memory")
    private @Nullable Output<ContainerMemoryArgs> memory;

    /**
     * @return The memory configuration.
     * 
     */
    public Optional<Output<ContainerMemoryArgs>> memory() {
        return Optional.ofNullable(this.memory);
    }

    /**
     * A mount point
     * 
     */
    @Import(name="mountPoints")
    private @Nullable Output<List<ContainerMountPointArgs>> mountPoints;

    /**
     * @return A mount point
     * 
     */
    public Optional<Output<List<ContainerMountPointArgs>>> mountPoints() {
        return Optional.ofNullable(this.mountPoints);
    }

    /**
     * A network interface (multiple blocks
     * supported).
     * 
     */
    @Import(name="networkInterfaces")
    private @Nullable Output<List<ContainerNetworkInterfaceArgs>> networkInterfaces;

    /**
     * @return A network interface (multiple blocks
     * supported).
     * 
     */
    public Optional<Output<List<ContainerNetworkInterfaceArgs>>> networkInterfaces() {
        return Optional.ofNullable(this.networkInterfaces);
    }

    /**
     * The name of the node to assign the container to.
     * 
     */
    @Import(name="nodeName", required=true)
    private Output<String> nodeName;

    /**
     * @return The name of the node to assign the container to.
     * 
     */
    public Output<String> nodeName() {
        return this.nodeName;
    }

    /**
     * The Operating System configuration.
     * 
     */
    @Import(name="operatingSystem")
    private @Nullable Output<ContainerOperatingSystemArgs> operatingSystem;

    /**
     * @return The Operating System configuration.
     * 
     */
    public Optional<Output<ContainerOperatingSystemArgs>> operatingSystem() {
        return Optional.ofNullable(this.operatingSystem);
    }

    /**
     * The identifier for a pool to assign the container to.
     * 
     */
    @Import(name="poolId")
    private @Nullable Output<String> poolId;

    /**
     * @return The identifier for a pool to assign the container to.
     * 
     */
    public Optional<Output<String>> poolId() {
        return Optional.ofNullable(this.poolId);
    }

    /**
     * Automatically start container when the host system boots (defaults to `true`).
     * 
     */
    @Import(name="startOnBoot")
    private @Nullable Output<Boolean> startOnBoot;

    /**
     * @return Automatically start container when the host system boots (defaults to `true`).
     * 
     */
    public Optional<Output<Boolean>> startOnBoot() {
        return Optional.ofNullable(this.startOnBoot);
    }

    /**
     * Whether to start the container (defaults to `true`).
     * 
     */
    @Import(name="started")
    private @Nullable Output<Boolean> started;

    /**
     * @return Whether to start the container (defaults to `true`).
     * 
     */
    public Optional<Output<Boolean>> started() {
        return Optional.ofNullable(this.started);
    }

    /**
     * A list of tags the container tags. This is only meta
     * information (defaults to `[]`). Note: Proxmox always sorts the container tags.
     * If the list in template is not sorted, then Proxmox will always report a
     * difference on the resource. You may use the `ignore_changes` lifecycle
     * meta-argument to ignore changes to this attribute.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tags the container tags. This is only meta
     * information (defaults to `[]`). Note: Proxmox always sorts the container tags.
     * If the list in template is not sorted, then Proxmox will always report a
     * difference on the resource. You may use the `ignore_changes` lifecycle
     * meta-argument to ignore changes to this attribute.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Whether to create a template (defaults to `false`).
     * 
     */
    @Import(name="template")
    private @Nullable Output<Boolean> template;

    /**
     * @return Whether to create a template (defaults to `false`).
     * 
     */
    public Optional<Output<Boolean>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * Whether the container runs as unprivileged on
     * the host (defaults to `false`).
     * 
     */
    @Import(name="unprivileged")
    private @Nullable Output<Boolean> unprivileged;

    /**
     * @return Whether the container runs as unprivileged on
     * the host (defaults to `false`).
     * 
     */
    public Optional<Output<Boolean>> unprivileged() {
        return Optional.ofNullable(this.unprivileged);
    }

    /**
     * The container identifier
     * 
     */
    @Import(name="vmId")
    private @Nullable Output<Integer> vmId;

    /**
     * @return The container identifier
     * 
     */
    public Optional<Output<Integer>> vmId() {
        return Optional.ofNullable(this.vmId);
    }

    private ContainerArgs() {}

    private ContainerArgs(ContainerArgs $) {
        this.clone = $.clone;
        this.console = $.console;
        this.cpu = $.cpu;
        this.description = $.description;
        this.disk = $.disk;
        this.features = $.features;
        this.initialization = $.initialization;
        this.memory = $.memory;
        this.mountPoints = $.mountPoints;
        this.networkInterfaces = $.networkInterfaces;
        this.nodeName = $.nodeName;
        this.operatingSystem = $.operatingSystem;
        this.poolId = $.poolId;
        this.startOnBoot = $.startOnBoot;
        this.started = $.started;
        this.tags = $.tags;
        this.template = $.template;
        this.unprivileged = $.unprivileged;
        this.vmId = $.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerArgs $;

        public Builder() {
            $ = new ContainerArgs();
        }

        public Builder(ContainerArgs defaults) {
            $ = new ContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clone The cloning configuration.
         * 
         * @return builder
         * 
         */
        public Builder clone_(@Nullable Output<ContainerCloneArgs> clone) {
            $.clone = clone;
            return this;
        }

        /**
         * @param clone The cloning configuration.
         * 
         * @return builder
         * 
         */
        public Builder clone_(ContainerCloneArgs clone) {
            return clone_(Output.of(clone));
        }

        /**
         * @param console Console.
         * 
         * @return builder
         * 
         */
        public Builder console(@Nullable Output<ContainerConsoleArgs> console) {
            $.console = console;
            return this;
        }

        /**
         * @param console Console.
         * 
         * @return builder
         * 
         */
        public Builder console(ContainerConsoleArgs console) {
            return console(Output.of(console));
        }

        /**
         * @param cpu The CPU configuration.
         * 
         * @return builder
         * 
         */
        public Builder cpu(@Nullable Output<ContainerCpuArgs> cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param cpu The CPU configuration.
         * 
         * @return builder
         * 
         */
        public Builder cpu(ContainerCpuArgs cpu) {
            return cpu(Output.of(cpu));
        }

        /**
         * @param description The description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disk The disk configuration.
         * 
         * @return builder
         * 
         */
        public Builder disk(@Nullable Output<ContainerDiskArgs> disk) {
            $.disk = disk;
            return this;
        }

        /**
         * @param disk The disk configuration.
         * 
         * @return builder
         * 
         */
        public Builder disk(ContainerDiskArgs disk) {
            return disk(Output.of(disk));
        }

        /**
         * @param features The container feature flags. Changing flags (except nesting) is only allowed for `root@pam` authenticated user.
         * 
         * @return builder
         * 
         */
        public Builder features(@Nullable Output<ContainerFeaturesArgs> features) {
            $.features = features;
            return this;
        }

        /**
         * @param features The container feature flags. Changing flags (except nesting) is only allowed for `root@pam` authenticated user.
         * 
         * @return builder
         * 
         */
        public Builder features(ContainerFeaturesArgs features) {
            return features(Output.of(features));
        }

        /**
         * @param initialization The initialization configuration.
         * 
         * @return builder
         * 
         */
        public Builder initialization(@Nullable Output<ContainerInitializationArgs> initialization) {
            $.initialization = initialization;
            return this;
        }

        /**
         * @param initialization The initialization configuration.
         * 
         * @return builder
         * 
         */
        public Builder initialization(ContainerInitializationArgs initialization) {
            return initialization(Output.of(initialization));
        }

        /**
         * @param memory The memory configuration.
         * 
         * @return builder
         * 
         */
        public Builder memory(@Nullable Output<ContainerMemoryArgs> memory) {
            $.memory = memory;
            return this;
        }

        /**
         * @param memory The memory configuration.
         * 
         * @return builder
         * 
         */
        public Builder memory(ContainerMemoryArgs memory) {
            return memory(Output.of(memory));
        }

        /**
         * @param mountPoints A mount point
         * 
         * @return builder
         * 
         */
        public Builder mountPoints(@Nullable Output<List<ContainerMountPointArgs>> mountPoints) {
            $.mountPoints = mountPoints;
            return this;
        }

        /**
         * @param mountPoints A mount point
         * 
         * @return builder
         * 
         */
        public Builder mountPoints(List<ContainerMountPointArgs> mountPoints) {
            return mountPoints(Output.of(mountPoints));
        }

        /**
         * @param mountPoints A mount point
         * 
         * @return builder
         * 
         */
        public Builder mountPoints(ContainerMountPointArgs... mountPoints) {
            return mountPoints(List.of(mountPoints));
        }

        /**
         * @param networkInterfaces A network interface (multiple blocks
         * supported).
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(@Nullable Output<List<ContainerNetworkInterfaceArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        /**
         * @param networkInterfaces A network interface (multiple blocks
         * supported).
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(List<ContainerNetworkInterfaceArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        /**
         * @param networkInterfaces A network interface (multiple blocks
         * supported).
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(ContainerNetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        /**
         * @param nodeName The name of the node to assign the container to.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName The name of the node to assign the container to.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        /**
         * @param operatingSystem The Operating System configuration.
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(@Nullable Output<ContainerOperatingSystemArgs> operatingSystem) {
            $.operatingSystem = operatingSystem;
            return this;
        }

        /**
         * @param operatingSystem The Operating System configuration.
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(ContainerOperatingSystemArgs operatingSystem) {
            return operatingSystem(Output.of(operatingSystem));
        }

        /**
         * @param poolId The identifier for a pool to assign the container to.
         * 
         * @return builder
         * 
         */
        public Builder poolId(@Nullable Output<String> poolId) {
            $.poolId = poolId;
            return this;
        }

        /**
         * @param poolId The identifier for a pool to assign the container to.
         * 
         * @return builder
         * 
         */
        public Builder poolId(String poolId) {
            return poolId(Output.of(poolId));
        }

        /**
         * @param startOnBoot Automatically start container when the host system boots (defaults to `true`).
         * 
         * @return builder
         * 
         */
        public Builder startOnBoot(@Nullable Output<Boolean> startOnBoot) {
            $.startOnBoot = startOnBoot;
            return this;
        }

        /**
         * @param startOnBoot Automatically start container when the host system boots (defaults to `true`).
         * 
         * @return builder
         * 
         */
        public Builder startOnBoot(Boolean startOnBoot) {
            return startOnBoot(Output.of(startOnBoot));
        }

        /**
         * @param started Whether to start the container (defaults to `true`).
         * 
         * @return builder
         * 
         */
        public Builder started(@Nullable Output<Boolean> started) {
            $.started = started;
            return this;
        }

        /**
         * @param started Whether to start the container (defaults to `true`).
         * 
         * @return builder
         * 
         */
        public Builder started(Boolean started) {
            return started(Output.of(started));
        }

        /**
         * @param tags A list of tags the container tags. This is only meta
         * information (defaults to `[]`). Note: Proxmox always sorts the container tags.
         * If the list in template is not sorted, then Proxmox will always report a
         * difference on the resource. You may use the `ignore_changes` lifecycle
         * meta-argument to ignore changes to this attribute.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags the container tags. This is only meta
         * information (defaults to `[]`). Note: Proxmox always sorts the container tags.
         * If the list in template is not sorted, then Proxmox will always report a
         * difference on the resource. You may use the `ignore_changes` lifecycle
         * meta-argument to ignore changes to this attribute.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags the container tags. This is only meta
         * information (defaults to `[]`). Note: Proxmox always sorts the container tags.
         * If the list in template is not sorted, then Proxmox will always report a
         * difference on the resource. You may use the `ignore_changes` lifecycle
         * meta-argument to ignore changes to this attribute.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param template Whether to create a template (defaults to `false`).
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<Boolean> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Whether to create a template (defaults to `false`).
         * 
         * @return builder
         * 
         */
        public Builder template(Boolean template) {
            return template(Output.of(template));
        }

        /**
         * @param unprivileged Whether the container runs as unprivileged on
         * the host (defaults to `false`).
         * 
         * @return builder
         * 
         */
        public Builder unprivileged(@Nullable Output<Boolean> unprivileged) {
            $.unprivileged = unprivileged;
            return this;
        }

        /**
         * @param unprivileged Whether the container runs as unprivileged on
         * the host (defaults to `false`).
         * 
         * @return builder
         * 
         */
        public Builder unprivileged(Boolean unprivileged) {
            return unprivileged(Output.of(unprivileged));
        }

        /**
         * @param vmId The container identifier
         * 
         * @return builder
         * 
         */
        public Builder vmId(@Nullable Output<Integer> vmId) {
            $.vmId = vmId;
            return this;
        }

        /**
         * @param vmId The container identifier
         * 
         * @return builder
         * 
         */
        public Builder vmId(Integer vmId) {
            return vmId(Output.of(vmId));
        }

        public ContainerArgs build() {
            $.nodeName = Objects.requireNonNull($.nodeName, "expected parameter 'nodeName' to be non-null");
            return $;
        }
    }

}
