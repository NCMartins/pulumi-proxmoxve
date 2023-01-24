// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineHostpciGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("device", required: true)]
        public Input<string> Device { get; set; } = null!;

        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        [Input("mdev")]
        public Input<string>? Mdev { get; set; }

        [Input("pcie")]
        public Input<bool>? Pcie { get; set; }

        [Input("romFile")]
        public Input<string>? RomFile { get; set; }

        [Input("rombar")]
        public Input<bool>? Rombar { get; set; }

        [Input("xvga")]
        public Input<bool>? Xvga { get; set; }

        public VirtualMachineHostpciGetArgs()
        {
        }
        public static new VirtualMachineHostpciGetArgs Empty => new VirtualMachineHostpciGetArgs();
    }
}
