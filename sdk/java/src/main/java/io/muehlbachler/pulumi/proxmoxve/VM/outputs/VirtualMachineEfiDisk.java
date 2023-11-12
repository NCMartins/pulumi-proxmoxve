// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineEfiDisk {
    /**
     * @return The identifier for the datastore to create the
     * cloud-init disk in (defaults to `local-lvm`).
     * 
     */
    private @Nullable String datastoreId;
    /**
     * @return The file format.
     * 
     */
    private @Nullable String fileFormat;
    /**
     * @return Use am EFI vars template with
     * distribution-specific and Microsoft Standard keys enrolled, if used with
     * EFI type=`4m`. Ignored for VMs with cpu.architecture=`aarch64` (defaults
     * to `false`).
     * 
     */
    private @Nullable Boolean preEnrolledKeys;
    /**
     * @return The VGA type (defaults to `std`).
     * 
     */
    private @Nullable String type;

    private VirtualMachineEfiDisk() {}
    /**
     * @return The identifier for the datastore to create the
     * cloud-init disk in (defaults to `local-lvm`).
     * 
     */
    public Optional<String> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }
    /**
     * @return The file format.
     * 
     */
    public Optional<String> fileFormat() {
        return Optional.ofNullable(this.fileFormat);
    }
    /**
     * @return Use am EFI vars template with
     * distribution-specific and Microsoft Standard keys enrolled, if used with
     * EFI type=`4m`. Ignored for VMs with cpu.architecture=`aarch64` (defaults
     * to `false`).
     * 
     */
    public Optional<Boolean> preEnrolledKeys() {
        return Optional.ofNullable(this.preEnrolledKeys);
    }
    /**
     * @return The VGA type (defaults to `std`).
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineEfiDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String datastoreId;
        private @Nullable String fileFormat;
        private @Nullable Boolean preEnrolledKeys;
        private @Nullable String type;
        public Builder() {}
        public Builder(VirtualMachineEfiDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.fileFormat = defaults.fileFormat;
    	      this.preEnrolledKeys = defaults.preEnrolledKeys;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder datastoreId(@Nullable String datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }
        @CustomType.Setter
        public Builder fileFormat(@Nullable String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        @CustomType.Setter
        public Builder preEnrolledKeys(@Nullable Boolean preEnrolledKeys) {
            this.preEnrolledKeys = preEnrolledKeys;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public VirtualMachineEfiDisk build() {
            final var _resultValue = new VirtualMachineEfiDisk();
            _resultValue.datastoreId = datastoreId;
            _resultValue.fileFormat = fileFormat;
            _resultValue.preEnrolledKeys = preEnrolledKeys;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
