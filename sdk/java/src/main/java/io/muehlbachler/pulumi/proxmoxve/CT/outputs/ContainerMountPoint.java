// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerMountPoint {
    /**
     * @return Explicitly enable or disable ACL support.
     * 
     */
    private @Nullable Boolean acl;
    /**
     * @return Whether to include the mount point in backups (only
     * used for volume mount points).
     * 
     */
    private @Nullable Boolean backup;
    /**
     * @return List of extra mount options.
     * 
     */
    private @Nullable List<String> mountOptions;
    /**
     * @return Path to the mount point as seen from inside the
     * container.
     * 
     */
    private String path;
    /**
     * @return Enable user quotas inside the container (not supported
     * with ZFS subvolumes).
     * 
     */
    private @Nullable Boolean quota;
    /**
     * @return Read-only mount point.
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return Will include this volume to a storage replica job.
     * 
     */
    private @Nullable Boolean replicate;
    /**
     * @return Mark this non-volume mount point as available on all
     * nodes.
     * 
     */
    private @Nullable Boolean shared;
    /**
     * @return Volume size (only for ZFS storage backed mount points).
     * Can be specified with a unit suffix (e.g. `10G`).
     * 
     */
    private @Nullable String size;
    /**
     * @return Volume, device or directory to mount into the
     * container.
     * 
     */
    private String volume;

    private ContainerMountPoint() {}
    /**
     * @return Explicitly enable or disable ACL support.
     * 
     */
    public Optional<Boolean> acl() {
        return Optional.ofNullable(this.acl);
    }
    /**
     * @return Whether to include the mount point in backups (only
     * used for volume mount points).
     * 
     */
    public Optional<Boolean> backup() {
        return Optional.ofNullable(this.backup);
    }
    /**
     * @return List of extra mount options.
     * 
     */
    public List<String> mountOptions() {
        return this.mountOptions == null ? List.of() : this.mountOptions;
    }
    /**
     * @return Path to the mount point as seen from inside the
     * container.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Enable user quotas inside the container (not supported
     * with ZFS subvolumes).
     * 
     */
    public Optional<Boolean> quota() {
        return Optional.ofNullable(this.quota);
    }
    /**
     * @return Read-only mount point.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return Will include this volume to a storage replica job.
     * 
     */
    public Optional<Boolean> replicate() {
        return Optional.ofNullable(this.replicate);
    }
    /**
     * @return Mark this non-volume mount point as available on all
     * nodes.
     * 
     */
    public Optional<Boolean> shared() {
        return Optional.ofNullable(this.shared);
    }
    /**
     * @return Volume size (only for ZFS storage backed mount points).
     * Can be specified with a unit suffix (e.g. `10G`).
     * 
     */
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }
    /**
     * @return Volume, device or directory to mount into the
     * container.
     * 
     */
    public String volume() {
        return this.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerMountPoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean acl;
        private @Nullable Boolean backup;
        private @Nullable List<String> mountOptions;
        private String path;
        private @Nullable Boolean quota;
        private @Nullable Boolean readOnly;
        private @Nullable Boolean replicate;
        private @Nullable Boolean shared;
        private @Nullable String size;
        private String volume;
        public Builder() {}
        public Builder(ContainerMountPoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acl = defaults.acl;
    	      this.backup = defaults.backup;
    	      this.mountOptions = defaults.mountOptions;
    	      this.path = defaults.path;
    	      this.quota = defaults.quota;
    	      this.readOnly = defaults.readOnly;
    	      this.replicate = defaults.replicate;
    	      this.shared = defaults.shared;
    	      this.size = defaults.size;
    	      this.volume = defaults.volume;
        }

        @CustomType.Setter
        public Builder acl(@Nullable Boolean acl) {
            this.acl = acl;
            return this;
        }
        @CustomType.Setter
        public Builder backup(@Nullable Boolean backup) {
            this.backup = backup;
            return this;
        }
        @CustomType.Setter
        public Builder mountOptions(@Nullable List<String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        public Builder mountOptions(String... mountOptions) {
            return mountOptions(List.of(mountOptions));
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder quota(@Nullable Boolean quota) {
            this.quota = quota;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        @CustomType.Setter
        public Builder replicate(@Nullable Boolean replicate) {
            this.replicate = replicate;
            return this;
        }
        @CustomType.Setter
        public Builder shared(@Nullable Boolean shared) {
            this.shared = shared;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable String size) {
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder volume(String volume) {
            this.volume = Objects.requireNonNull(volume);
            return this;
        }
        public ContainerMountPoint build() {
            final var _resultValue = new ContainerMountPoint();
            _resultValue.acl = acl;
            _resultValue.backup = backup;
            _resultValue.mountOptions = mountOptions;
            _resultValue.path = path;
            _resultValue.quota = quota;
            _resultValue.readOnly = readOnly;
            _resultValue.replicate = replicate;
            _resultValue.shared = shared;
            _resultValue.size = size;
            _resultValue.volume = volume;
            return _resultValue;
        }
    }
}
