// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTimeResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The node&#39;s local time.
     * 
     */
    private String localTime;
    private String nodeName;
    /**
     * @return The node&#39;s time zone.
     * 
     */
    private String timeZone;
    /**
     * @return The node&#39;s local time formatted as UTC.
     * 
     */
    private String utcTime;

    private GetTimeResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The node&#39;s local time.
     * 
     */
    public String localTime() {
        return this.localTime;
    }
    public String nodeName() {
        return this.nodeName;
    }
    /**
     * @return The node&#39;s time zone.
     * 
     */
    public String timeZone() {
        return this.timeZone;
    }
    /**
     * @return The node&#39;s local time formatted as UTC.
     * 
     */
    public String utcTime() {
        return this.utcTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTimeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String localTime;
        private String nodeName;
        private String timeZone;
        private String utcTime;
        public Builder() {}
        public Builder(GetTimeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.localTime = defaults.localTime;
    	      this.nodeName = defaults.nodeName;
    	      this.timeZone = defaults.timeZone;
    	      this.utcTime = defaults.utcTime;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder localTime(String localTime) {
            this.localTime = Objects.requireNonNull(localTime);
            return this;
        }
        @CustomType.Setter
        public Builder nodeName(String nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }
        @CustomType.Setter
        public Builder timeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        @CustomType.Setter
        public Builder utcTime(String utcTime) {
            this.utcTime = Objects.requireNonNull(utcTime);
            return this;
        }
        public GetTimeResult build() {
            final var _resultValue = new GetTimeResult();
            _resultValue.id = id;
            _resultValue.localTime = localTime;
            _resultValue.nodeName = nodeName;
            _resultValue.timeZone = timeZone;
            _resultValue.utcTime = utcTime;
            return _resultValue;
        }
    }
}
