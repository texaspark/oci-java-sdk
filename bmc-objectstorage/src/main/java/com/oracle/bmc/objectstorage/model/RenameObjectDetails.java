/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RenameObjectDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class RenameObjectDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("newName")
        private String newName;

        public Builder newName(String newName) {
            this.newName = newName;
            this.__explicitlySet__.add("newName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("srcObjIfMatchETag")
        private String srcObjIfMatchETag;

        public Builder srcObjIfMatchETag(String srcObjIfMatchETag) {
            this.srcObjIfMatchETag = srcObjIfMatchETag;
            this.__explicitlySet__.add("srcObjIfMatchETag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("newObjIfMatchETag")
        private String newObjIfMatchETag;

        public Builder newObjIfMatchETag(String newObjIfMatchETag) {
            this.newObjIfMatchETag = newObjIfMatchETag;
            this.__explicitlySet__.add("newObjIfMatchETag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("newObjIfNoneMatchETag")
        private String newObjIfNoneMatchETag;

        public Builder newObjIfNoneMatchETag(String newObjIfNoneMatchETag) {
            this.newObjIfNoneMatchETag = newObjIfNoneMatchETag;
            this.__explicitlySet__.add("newObjIfNoneMatchETag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RenameObjectDetails build() {
            RenameObjectDetails __instance__ =
                    new RenameObjectDetails(
                            sourceName,
                            newName,
                            srcObjIfMatchETag,
                            newObjIfMatchETag,
                            newObjIfNoneMatchETag);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RenameObjectDetails o) {
            return sourceName(o.getSourceName())
                    .newName(o.getNewName())
                    .srcObjIfMatchETag(o.getSrcObjIfMatchETag())
                    .newObjIfMatchETag(o.getNewObjIfMatchETag())
                    .newObjIfNoneMatchETag(o.getNewObjIfNoneMatchETag());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the source object to be renamed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    String sourceName;

    /**
     * The new name of the source object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newName")
    String newName;

    /**
     * The if-match entity tag of the source object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("srcObjIfMatchETag")
    String srcObjIfMatchETag;

    /**
     * The if-match entity tag of the new object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newObjIfMatchETag")
    String newObjIfMatchETag;

    /**
     * The if-none-match entity tag of the new object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newObjIfNoneMatchETag")
    String newObjIfNoneMatchETag;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
