// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineCdromGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("fileId")]
        public Input<string>? FileId { get; set; }

        [Input("interface")]
        public Input<string>? Interface { get; set; }

        public VirtualMachineCdromGetArgs()
        {
        }
        public static new VirtualMachineCdromGetArgs Empty => new VirtualMachineCdromGetArgs();
    }
}
