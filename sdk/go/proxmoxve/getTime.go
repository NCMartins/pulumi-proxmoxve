// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package proxmoxve

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the current time for a specific node.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := proxmoxve.LookupTime(ctx, &proxmoxve.LookupTimeArgs{
//				NodeName: "first-node",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupTime(ctx *pulumi.Context, args *LookupTimeArgs, opts ...pulumi.InvokeOption) (*LookupTimeResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTimeResult
	err := ctx.Invoke("proxmoxve:index/getTime:getTime", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTime.
type LookupTimeArgs struct {
	// A node name.
	NodeName string `pulumi:"nodeName"`
}

// A collection of values returned by getTime.
type LookupTimeResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The node's local time.
	LocalTime string `pulumi:"localTime"`
	NodeName  string `pulumi:"nodeName"`
	// The node's time zone.
	TimeZone string `pulumi:"timeZone"`
	// The node's local time formatted as UTC.
	UtcTime string `pulumi:"utcTime"`
}

func LookupTimeOutput(ctx *pulumi.Context, args LookupTimeOutputArgs, opts ...pulumi.InvokeOption) LookupTimeResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupTimeResult, error) {
			args := v.(LookupTimeArgs)
			r, err := LookupTime(ctx, &args, opts...)
			var s LookupTimeResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupTimeResultOutput)
}

// A collection of arguments for invoking getTime.
type LookupTimeOutputArgs struct {
	// A node name.
	NodeName pulumi.StringInput `pulumi:"nodeName"`
}

func (LookupTimeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTimeArgs)(nil)).Elem()
}

// A collection of values returned by getTime.
type LookupTimeResultOutput struct{ *pulumi.OutputState }

func (LookupTimeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTimeResult)(nil)).Elem()
}

func (o LookupTimeResultOutput) ToLookupTimeResultOutput() LookupTimeResultOutput {
	return o
}

func (o LookupTimeResultOutput) ToLookupTimeResultOutputWithContext(ctx context.Context) LookupTimeResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupTimeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTimeResult) string { return v.Id }).(pulumi.StringOutput)
}

// The node's local time.
func (o LookupTimeResultOutput) LocalTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTimeResult) string { return v.LocalTime }).(pulumi.StringOutput)
}

func (o LookupTimeResultOutput) NodeName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTimeResult) string { return v.NodeName }).(pulumi.StringOutput)
}

// The node's time zone.
func (o LookupTimeResultOutput) TimeZone() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTimeResult) string { return v.TimeZone }).(pulumi.StringOutput)
}

// The node's local time formatted as UTC.
func (o LookupTimeResultOutput) UtcTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTimeResult) string { return v.UtcTime }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTimeResultOutput{})
}
