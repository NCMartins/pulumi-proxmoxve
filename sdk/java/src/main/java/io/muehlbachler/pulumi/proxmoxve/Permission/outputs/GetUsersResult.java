// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Permission.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUsersResult {
    private List<String> comments;
    private List<String> emails;
    private List<Boolean> enableds;
    private List<String> expirationDates;
    private List<String> firstNames;
    private List<List<String>> groups;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> keys;
    private List<String> lastNames;
    private List<String> userIds;

    private GetUsersResult() {}
    public List<String> comments() {
        return this.comments;
    }
    public List<String> emails() {
        return this.emails;
    }
    public List<Boolean> enableds() {
        return this.enableds;
    }
    public List<String> expirationDates() {
        return this.expirationDates;
    }
    public List<String> firstNames() {
        return this.firstNames;
    }
    public List<List<String>> groups() {
        return this.groups;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> keys() {
        return this.keys;
    }
    public List<String> lastNames() {
        return this.lastNames;
    }
    public List<String> userIds() {
        return this.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> comments;
        private List<String> emails;
        private List<Boolean> enableds;
        private List<String> expirationDates;
        private List<String> firstNames;
        private List<List<String>> groups;
        private String id;
        private List<String> keys;
        private List<String> lastNames;
        private List<String> userIds;
        public Builder() {}
        public Builder(GetUsersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comments = defaults.comments;
    	      this.emails = defaults.emails;
    	      this.enableds = defaults.enableds;
    	      this.expirationDates = defaults.expirationDates;
    	      this.firstNames = defaults.firstNames;
    	      this.groups = defaults.groups;
    	      this.id = defaults.id;
    	      this.keys = defaults.keys;
    	      this.lastNames = defaults.lastNames;
    	      this.userIds = defaults.userIds;
        }

        @CustomType.Setter
        public Builder comments(List<String> comments) {
            this.comments = Objects.requireNonNull(comments);
            return this;
        }
        public Builder comments(String... comments) {
            return comments(List.of(comments));
        }
        @CustomType.Setter
        public Builder emails(List<String> emails) {
            this.emails = Objects.requireNonNull(emails);
            return this;
        }
        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }
        @CustomType.Setter
        public Builder enableds(List<Boolean> enableds) {
            this.enableds = Objects.requireNonNull(enableds);
            return this;
        }
        public Builder enableds(Boolean... enableds) {
            return enableds(List.of(enableds));
        }
        @CustomType.Setter
        public Builder expirationDates(List<String> expirationDates) {
            this.expirationDates = Objects.requireNonNull(expirationDates);
            return this;
        }
        public Builder expirationDates(String... expirationDates) {
            return expirationDates(List.of(expirationDates));
        }
        @CustomType.Setter
        public Builder firstNames(List<String> firstNames) {
            this.firstNames = Objects.requireNonNull(firstNames);
            return this;
        }
        public Builder firstNames(String... firstNames) {
            return firstNames(List.of(firstNames));
        }
        @CustomType.Setter
        public Builder groups(List<List<String>> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder keys(List<String> keys) {
            this.keys = Objects.requireNonNull(keys);
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }
        @CustomType.Setter
        public Builder lastNames(List<String> lastNames) {
            this.lastNames = Objects.requireNonNull(lastNames);
            return this;
        }
        public Builder lastNames(String... lastNames) {
            return lastNames(List.of(lastNames));
        }
        @CustomType.Setter
        public Builder userIds(List<String> userIds) {
            this.userIds = Objects.requireNonNull(userIds);
            return this;
        }
        public Builder userIds(String... userIds) {
            return userIds(List.of(userIds));
        }
        public GetUsersResult build() {
            final var o = new GetUsersResult();
            o.comments = comments;
            o.emails = emails;
            o.enableds = enableds;
            o.expirationDates = expirationDates;
            o.firstNames = firstNames;
            o.groups = groups;
            o.id = id;
            o.keys = keys;
            o.lastNames = lastNames;
            o.userIds = userIds;
            return o;
        }
    }
}