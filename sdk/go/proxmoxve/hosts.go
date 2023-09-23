// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package proxmoxve

import (
	"context"
	"reflect"

	"errors"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

type Hosts struct {
	pulumi.CustomResourceState

	// The addresses
	Addresses pulumi.StringArrayOutput `pulumi:"addresses"`
	// The SHA1 digest
	Digest pulumi.StringOutput `pulumi:"digest"`
	// The host entries
	Entries HostsEntryArrayOutput `pulumi:"entries"`
	// The host entries
	Entry HostsEntryArrayOutput `pulumi:"entry"`
	// The hostnames
	Hostnames pulumi.StringArrayArrayOutput `pulumi:"hostnames"`
	// The node name
	NodeName pulumi.StringOutput `pulumi:"nodeName"`
}

// NewHosts registers a new resource with the given unique name, arguments, and options.
func NewHosts(ctx *pulumi.Context,
	name string, args *HostsArgs, opts ...pulumi.ResourceOption) (*Hosts, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Entry == nil {
		return nil, errors.New("invalid value for required argument 'Entry'")
	}
	if args.NodeName == nil {
		return nil, errors.New("invalid value for required argument 'NodeName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Hosts
	err := ctx.RegisterResource("proxmoxve:index/hosts:Hosts", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHosts gets an existing Hosts resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHosts(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HostsState, opts ...pulumi.ResourceOption) (*Hosts, error) {
	var resource Hosts
	err := ctx.ReadResource("proxmoxve:index/hosts:Hosts", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Hosts resources.
type hostsState struct {
	// The addresses
	Addresses []string `pulumi:"addresses"`
	// The SHA1 digest
	Digest *string `pulumi:"digest"`
	// The host entries
	Entries []HostsEntry `pulumi:"entries"`
	// The host entries
	Entry []HostsEntry `pulumi:"entry"`
	// The hostnames
	Hostnames [][]string `pulumi:"hostnames"`
	// The node name
	NodeName *string `pulumi:"nodeName"`
}

type HostsState struct {
	// The addresses
	Addresses pulumi.StringArrayInput
	// The SHA1 digest
	Digest pulumi.StringPtrInput
	// The host entries
	Entries HostsEntryArrayInput
	// The host entries
	Entry HostsEntryArrayInput
	// The hostnames
	Hostnames pulumi.StringArrayArrayInput
	// The node name
	NodeName pulumi.StringPtrInput
}

func (HostsState) ElementType() reflect.Type {
	return reflect.TypeOf((*hostsState)(nil)).Elem()
}

type hostsArgs struct {
	// The host entries
	Entry []HostsEntry `pulumi:"entry"`
	// The node name
	NodeName string `pulumi:"nodeName"`
}

// The set of arguments for constructing a Hosts resource.
type HostsArgs struct {
	// The host entries
	Entry HostsEntryArrayInput
	// The node name
	NodeName pulumi.StringInput
}

func (HostsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hostsArgs)(nil)).Elem()
}

type HostsInput interface {
	pulumi.Input

	ToHostsOutput() HostsOutput
	ToHostsOutputWithContext(ctx context.Context) HostsOutput
}

func (*Hosts) ElementType() reflect.Type {
	return reflect.TypeOf((**Hosts)(nil)).Elem()
}

func (i *Hosts) ToHostsOutput() HostsOutput {
	return i.ToHostsOutputWithContext(context.Background())
}

func (i *Hosts) ToHostsOutputWithContext(ctx context.Context) HostsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostsOutput)
}

func (i *Hosts) ToOutput(ctx context.Context) pulumix.Output[*Hosts] {
	return pulumix.Output[*Hosts]{
		OutputState: i.ToHostsOutputWithContext(ctx).OutputState,
	}
}

// HostsArrayInput is an input type that accepts HostsArray and HostsArrayOutput values.
// You can construct a concrete instance of `HostsArrayInput` via:
//
//	HostsArray{ HostsArgs{...} }
type HostsArrayInput interface {
	pulumi.Input

	ToHostsArrayOutput() HostsArrayOutput
	ToHostsArrayOutputWithContext(context.Context) HostsArrayOutput
}

type HostsArray []HostsInput

func (HostsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Hosts)(nil)).Elem()
}

func (i HostsArray) ToHostsArrayOutput() HostsArrayOutput {
	return i.ToHostsArrayOutputWithContext(context.Background())
}

func (i HostsArray) ToHostsArrayOutputWithContext(ctx context.Context) HostsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostsArrayOutput)
}

func (i HostsArray) ToOutput(ctx context.Context) pulumix.Output[[]*Hosts] {
	return pulumix.Output[[]*Hosts]{
		OutputState: i.ToHostsArrayOutputWithContext(ctx).OutputState,
	}
}

// HostsMapInput is an input type that accepts HostsMap and HostsMapOutput values.
// You can construct a concrete instance of `HostsMapInput` via:
//
//	HostsMap{ "key": HostsArgs{...} }
type HostsMapInput interface {
	pulumi.Input

	ToHostsMapOutput() HostsMapOutput
	ToHostsMapOutputWithContext(context.Context) HostsMapOutput
}

type HostsMap map[string]HostsInput

func (HostsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Hosts)(nil)).Elem()
}

func (i HostsMap) ToHostsMapOutput() HostsMapOutput {
	return i.ToHostsMapOutputWithContext(context.Background())
}

func (i HostsMap) ToHostsMapOutputWithContext(ctx context.Context) HostsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostsMapOutput)
}

func (i HostsMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Hosts] {
	return pulumix.Output[map[string]*Hosts]{
		OutputState: i.ToHostsMapOutputWithContext(ctx).OutputState,
	}
}

type HostsOutput struct{ *pulumi.OutputState }

func (HostsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Hosts)(nil)).Elem()
}

func (o HostsOutput) ToHostsOutput() HostsOutput {
	return o
}

func (o HostsOutput) ToHostsOutputWithContext(ctx context.Context) HostsOutput {
	return o
}

func (o HostsOutput) ToOutput(ctx context.Context) pulumix.Output[*Hosts] {
	return pulumix.Output[*Hosts]{
		OutputState: o.OutputState,
	}
}

// The addresses
func (o HostsOutput) Addresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Hosts) pulumi.StringArrayOutput { return v.Addresses }).(pulumi.StringArrayOutput)
}

// The SHA1 digest
func (o HostsOutput) Digest() pulumi.StringOutput {
	return o.ApplyT(func(v *Hosts) pulumi.StringOutput { return v.Digest }).(pulumi.StringOutput)
}

// The host entries
func (o HostsOutput) Entries() HostsEntryArrayOutput {
	return o.ApplyT(func(v *Hosts) HostsEntryArrayOutput { return v.Entries }).(HostsEntryArrayOutput)
}

// The host entries
func (o HostsOutput) Entry() HostsEntryArrayOutput {
	return o.ApplyT(func(v *Hosts) HostsEntryArrayOutput { return v.Entry }).(HostsEntryArrayOutput)
}

// The hostnames
func (o HostsOutput) Hostnames() pulumi.StringArrayArrayOutput {
	return o.ApplyT(func(v *Hosts) pulumi.StringArrayArrayOutput { return v.Hostnames }).(pulumi.StringArrayArrayOutput)
}

// The node name
func (o HostsOutput) NodeName() pulumi.StringOutput {
	return o.ApplyT(func(v *Hosts) pulumi.StringOutput { return v.NodeName }).(pulumi.StringOutput)
}

type HostsArrayOutput struct{ *pulumi.OutputState }

func (HostsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Hosts)(nil)).Elem()
}

func (o HostsArrayOutput) ToHostsArrayOutput() HostsArrayOutput {
	return o
}

func (o HostsArrayOutput) ToHostsArrayOutputWithContext(ctx context.Context) HostsArrayOutput {
	return o
}

func (o HostsArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Hosts] {
	return pulumix.Output[[]*Hosts]{
		OutputState: o.OutputState,
	}
}

func (o HostsArrayOutput) Index(i pulumi.IntInput) HostsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Hosts {
		return vs[0].([]*Hosts)[vs[1].(int)]
	}).(HostsOutput)
}

type HostsMapOutput struct{ *pulumi.OutputState }

func (HostsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Hosts)(nil)).Elem()
}

func (o HostsMapOutput) ToHostsMapOutput() HostsMapOutput {
	return o
}

func (o HostsMapOutput) ToHostsMapOutputWithContext(ctx context.Context) HostsMapOutput {
	return o
}

func (o HostsMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Hosts] {
	return pulumix.Output[map[string]*Hosts]{
		OutputState: o.OutputState,
	}
}

func (o HostsMapOutput) MapIndex(k pulumi.StringInput) HostsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Hosts {
		return vs[0].(map[string]*Hosts)[vs[1].(string)]
	}).(HostsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HostsInput)(nil)).Elem(), &Hosts{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostsArrayInput)(nil)).Elem(), HostsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostsMapInput)(nil)).Elem(), HostsMap{})
	pulumi.RegisterOutputType(HostsOutput{})
	pulumi.RegisterOutputType(HostsArrayOutput{})
	pulumi.RegisterOutputType(HostsMapOutput{})
}
