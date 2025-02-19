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
    public sealed class VirtualMachineDisk
    {
        /// <summary>
        /// The cache type (defaults to `none`).
        /// </summary>
        public readonly string? Cache;
        /// <summary>
        /// The identifier for the datastore to create the
        /// cloud-init disk in (defaults to `local-lvm`).
        /// </summary>
        public readonly string? DatastoreId;
        /// <summary>
        /// Whether to pass discard/trim requests to the
        /// underlying storage. Supported values are `on`/`ignore` (defaults
        /// to `ignore`).
        /// </summary>
        public readonly string? Discard;
        /// <summary>
        /// The file format.
        /// </summary>
        public readonly string? FileFormat;
        /// <summary>
        /// The file ID for a disk image (experimental -
        /// might cause high CPU utilization during import, especially with large
        /// disk images).
        /// </summary>
        public readonly string? FileId;
        /// <summary>
        /// The hardware interface to connect the cloud-init
        /// image to. Must be one of `ide0..3`, `sata0..5`, `scsi0..30`. Will be
        /// detected if the setting is missing but a cloud-init image is present,
        /// otherwise defaults to `ide2`.
        /// </summary>
        public readonly string Interface;
        /// <summary>
        /// Whether to use iothreads for this disk (defaults
        /// to `false`).
        /// </summary>
        public readonly bool? Iothread;
        /// <summary>
        /// The in-datastore path to the disk image.
        /// ***Experimental.***Use to attach another VM's disks,
        /// or (as root only) host's filesystem paths (`datastore_id` empty string).
        /// See "*Example: Attached disks*".
        /// </summary>
        public readonly string? PathInDatastore;
        /// <summary>
        /// The disk size in gigabytes (defaults to `8`).
        /// </summary>
        public readonly int? Size;
        /// <summary>
        /// The speed limits.
        /// </summary>
        public readonly Outputs.VirtualMachineDiskSpeed? Speed;
        /// <summary>
        /// Whether to use an SSD emulation option for this disk (
        /// defaults to `false`). Note that SSD emulation is not supported on VirtIO
        /// Block drives.
        /// </summary>
        public readonly bool? Ssd;

        [OutputConstructor]
        private VirtualMachineDisk(
            string? cache,

            string? datastoreId,

            string? discard,

            string? fileFormat,

            string? fileId,

            string @interface,

            bool? iothread,

            string? pathInDatastore,

            int? size,

            Outputs.VirtualMachineDiskSpeed? speed,

            bool? ssd)
        {
            Cache = cache;
            DatastoreId = datastoreId;
            Discard = discard;
            FileFormat = fileFormat;
            FileId = fileId;
            Interface = @interface;
            Iothread = iothread;
            PathInDatastore = pathInDatastore;
            Size = size;
            Speed = speed;
            Ssd = ssd;
        }
    }
}
