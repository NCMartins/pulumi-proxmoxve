// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallSecurityGroupRule {
    /**
     * @return Rule action (`ACCEPT`, `DROP`, `REJECT`).
     * 
     */
    private @Nullable String action;
    /**
     * @return Rule comment.
     * 
     */
    private @Nullable String comment;
    /**
     * @return Restrict packet destination address. This can refer to
     * a single IP address, an IP set (&#39;+ipsetname&#39;) or an IP alias definition.
     * You can also specify an address range like `20.34.101.207-201.3.9.99`, or
     * a list of IP addresses and networks (entries are separated by comma).
     * Please do not mix IPv4 and IPv6 addresses inside such lists.
     * 
     */
    private @Nullable String dest;
    /**
     * @return Restrict TCP/UDP destination port. You can use
     * service names or simple numbers (0-65535), as defined in &#39;/etc/services&#39;.
     * Port ranges can be specified with &#39;\d+:\d+&#39;, for example `80:85`, and
     * you can use comma separated list to match several ports or ranges.
     * 
     */
    private @Nullable String dport;
    private @Nullable Boolean enabled;
    /**
     * @return Network interface name. You have to use network
     * configuration key names for VMs and containers (&#39;net\d+&#39;). Host related
     * rules can use arbitrary strings.
     * 
     */
    private @Nullable String iface;
    /**
     * @return Log level for this rule (`emerg`, `alert`, `crit`,
     * `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
     * 
     */
    private @Nullable String log;
    /**
     * @return Macro name. Use predefined standard macro
     * from https://pve.proxmox.com/pve-docs/pve-admin-guide.html#_firewall_macro_definitions
     * 
     */
    private @Nullable String macro;
    /**
     * @return Position of the rule in the list.
     * 
     */
    private @Nullable Integer pos;
    /**
     * @return Restrict packet protocol. You can use protocol names
     * as defined in &#39;/etc/protocols&#39;.
     * 
     */
    private @Nullable String proto;
    private @Nullable String securityGroup;
    /**
     * @return Restrict packet source address. This can refer
     * to a single IP address, an IP set (&#39;+ipsetname&#39;) or an IP alias
     * definition. You can also specify an address range like
     * `20.34.101.207-201.3.9.99`, or a list of IP addresses and networks (
     * entries are separated by comma). Please do not mix IPv4 and IPv6 addresses
     * inside such lists.
     * 
     */
    private @Nullable String source;
    /**
     * @return Restrict TCP/UDP source port. You can use
     * service names or simple numbers (0-65535), as defined in &#39;/etc/services&#39;.
     * Port ranges can be specified with &#39;\d+:\d+&#39;, for example `80:85`, and
     * you can use comma separated list to match several ports or ranges.
     * 
     */
    private @Nullable String sport;
    /**
     * @return Rule type (`in`, `out`).
     * 
     */
    private @Nullable String type;

    private FirewallSecurityGroupRule() {}
    /**
     * @return Rule action (`ACCEPT`, `DROP`, `REJECT`).
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return Rule comment.
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * @return Restrict packet destination address. This can refer to
     * a single IP address, an IP set (&#39;+ipsetname&#39;) or an IP alias definition.
     * You can also specify an address range like `20.34.101.207-201.3.9.99`, or
     * a list of IP addresses and networks (entries are separated by comma).
     * Please do not mix IPv4 and IPv6 addresses inside such lists.
     * 
     */
    public Optional<String> dest() {
        return Optional.ofNullable(this.dest);
    }
    /**
     * @return Restrict TCP/UDP destination port. You can use
     * service names or simple numbers (0-65535), as defined in &#39;/etc/services&#39;.
     * Port ranges can be specified with &#39;\d+:\d+&#39;, for example `80:85`, and
     * you can use comma separated list to match several ports or ranges.
     * 
     */
    public Optional<String> dport() {
        return Optional.ofNullable(this.dport);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Network interface name. You have to use network
     * configuration key names for VMs and containers (&#39;net\d+&#39;). Host related
     * rules can use arbitrary strings.
     * 
     */
    public Optional<String> iface() {
        return Optional.ofNullable(this.iface);
    }
    /**
     * @return Log level for this rule (`emerg`, `alert`, `crit`,
     * `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
     * 
     */
    public Optional<String> log() {
        return Optional.ofNullable(this.log);
    }
    /**
     * @return Macro name. Use predefined standard macro
     * from https://pve.proxmox.com/pve-docs/pve-admin-guide.html#_firewall_macro_definitions
     * 
     */
    public Optional<String> macro() {
        return Optional.ofNullable(this.macro);
    }
    /**
     * @return Position of the rule in the list.
     * 
     */
    public Optional<Integer> pos() {
        return Optional.ofNullable(this.pos);
    }
    /**
     * @return Restrict packet protocol. You can use protocol names
     * as defined in &#39;/etc/protocols&#39;.
     * 
     */
    public Optional<String> proto() {
        return Optional.ofNullable(this.proto);
    }
    public Optional<String> securityGroup() {
        return Optional.ofNullable(this.securityGroup);
    }
    /**
     * @return Restrict packet source address. This can refer
     * to a single IP address, an IP set (&#39;+ipsetname&#39;) or an IP alias
     * definition. You can also specify an address range like
     * `20.34.101.207-201.3.9.99`, or a list of IP addresses and networks (
     * entries are separated by comma). Please do not mix IPv4 and IPv6 addresses
     * inside such lists.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * @return Restrict TCP/UDP source port. You can use
     * service names or simple numbers (0-65535), as defined in &#39;/etc/services&#39;.
     * Port ranges can be specified with &#39;\d+:\d+&#39;, for example `80:85`, and
     * you can use comma separated list to match several ports or ranges.
     * 
     */
    public Optional<String> sport() {
        return Optional.ofNullable(this.sport);
    }
    /**
     * @return Rule type (`in`, `out`).
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallSecurityGroupRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable String comment;
        private @Nullable String dest;
        private @Nullable String dport;
        private @Nullable Boolean enabled;
        private @Nullable String iface;
        private @Nullable String log;
        private @Nullable String macro;
        private @Nullable Integer pos;
        private @Nullable String proto;
        private @Nullable String securityGroup;
        private @Nullable String source;
        private @Nullable String sport;
        private @Nullable String type;
        public Builder() {}
        public Builder(FirewallSecurityGroupRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.comment = defaults.comment;
    	      this.dest = defaults.dest;
    	      this.dport = defaults.dport;
    	      this.enabled = defaults.enabled;
    	      this.iface = defaults.iface;
    	      this.log = defaults.log;
    	      this.macro = defaults.macro;
    	      this.pos = defaults.pos;
    	      this.proto = defaults.proto;
    	      this.securityGroup = defaults.securityGroup;
    	      this.source = defaults.source;
    	      this.sport = defaults.sport;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder dest(@Nullable String dest) {
            this.dest = dest;
            return this;
        }
        @CustomType.Setter
        public Builder dport(@Nullable String dport) {
            this.dport = dport;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder iface(@Nullable String iface) {
            this.iface = iface;
            return this;
        }
        @CustomType.Setter
        public Builder log(@Nullable String log) {
            this.log = log;
            return this;
        }
        @CustomType.Setter
        public Builder macro(@Nullable String macro) {
            this.macro = macro;
            return this;
        }
        @CustomType.Setter
        public Builder pos(@Nullable Integer pos) {
            this.pos = pos;
            return this;
        }
        @CustomType.Setter
        public Builder proto(@Nullable String proto) {
            this.proto = proto;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroup(@Nullable String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder sport(@Nullable String sport) {
            this.sport = sport;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public FirewallSecurityGroupRule build() {
            final var _resultValue = new FirewallSecurityGroupRule();
            _resultValue.action = action;
            _resultValue.comment = comment;
            _resultValue.dest = dest;
            _resultValue.dport = dport;
            _resultValue.enabled = enabled;
            _resultValue.iface = iface;
            _resultValue.log = log;
            _resultValue.macro = macro;
            _resultValue.pos = pos;
            _resultValue.proto = proto;
            _resultValue.securityGroup = securityGroup;
            _resultValue.source = source;
            _resultValue.sport = sport;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
