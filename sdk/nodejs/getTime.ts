// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Retrieves the current time for a specific node.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const firstNodeTime = proxmoxve.getTime({
 *     nodeName: "first-node",
 * });
 * ```
 */
export function getTime(args: GetTimeArgs, opts?: pulumi.InvokeOptions): Promise<GetTimeResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("proxmoxve:index/getTime:getTime", {
        "nodeName": args.nodeName,
    }, opts);
}

/**
 * A collection of arguments for invoking getTime.
 */
export interface GetTimeArgs {
    /**
     * A node name.
     */
    nodeName: string;
}

/**
 * A collection of values returned by getTime.
 */
export interface GetTimeResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The node's local time.
     */
    readonly localTime: string;
    readonly nodeName: string;
    /**
     * The node's time zone.
     */
    readonly timeZone: string;
    /**
     * The node's local time formatted as UTC.
     */
    readonly utcTime: string;
}
/**
 * Retrieves the current time for a specific node.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const firstNodeTime = proxmoxve.getTime({
 *     nodeName: "first-node",
 * });
 * ```
 */
export function getTimeOutput(args: GetTimeOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTimeResult> {
    return pulumi.output(args).apply((a: any) => getTime(a, opts))
}

/**
 * A collection of arguments for invoking getTime.
 */
export interface GetTimeOutputArgs {
    /**
     * A node name.
     */
    nodeName: pulumi.Input<string>;
}
