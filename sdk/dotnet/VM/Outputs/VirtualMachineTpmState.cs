// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Outputs
{

    [OutputType]
    public sealed class VirtualMachineTpmState
    {
        /// <summary>
        /// The identifier for the datastore to create the
        /// cloud-init disk in (defaults to `local-lvm`).
        /// </summary>
        public readonly string? DatastoreId;
        /// <summary>
        /// The version.
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private VirtualMachineTpmState(
            string? datastoreId,

            string? version)
        {
            DatastoreId = datastoreId;
            Version = version;
        }
    }
}