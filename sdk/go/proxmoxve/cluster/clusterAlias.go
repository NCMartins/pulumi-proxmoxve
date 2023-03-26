// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cluster

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type ClusterAlias struct {
	pulumi.CustomResourceState

	// IP/CIDR block
	Cidr pulumi.StringOutput `pulumi:"cidr"`
	// Alias comment
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Alias name
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewClusterAlias registers a new resource with the given unique name, arguments, and options.
func NewClusterAlias(ctx *pulumi.Context,
	name string, args *ClusterAliasArgs, opts ...pulumi.ResourceOption) (*ClusterAlias, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Cidr == nil {
		return nil, errors.New("invalid value for required argument 'Cidr'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource ClusterAlias
	err := ctx.RegisterResource("proxmoxve:Cluster/clusterAlias:ClusterAlias", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterAlias gets an existing ClusterAlias resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterAlias(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterAliasState, opts ...pulumi.ResourceOption) (*ClusterAlias, error) {
	var resource ClusterAlias
	err := ctx.ReadResource("proxmoxve:Cluster/clusterAlias:ClusterAlias", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterAlias resources.
type clusterAliasState struct {
	// IP/CIDR block
	Cidr *string `pulumi:"cidr"`
	// Alias comment
	Comment *string `pulumi:"comment"`
	// Alias name
	Name *string `pulumi:"name"`
}

type ClusterAliasState struct {
	// IP/CIDR block
	Cidr pulumi.StringPtrInput
	// Alias comment
	Comment pulumi.StringPtrInput
	// Alias name
	Name pulumi.StringPtrInput
}

func (ClusterAliasState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAliasState)(nil)).Elem()
}

type clusterAliasArgs struct {
	// IP/CIDR block
	Cidr string `pulumi:"cidr"`
	// Alias comment
	Comment *string `pulumi:"comment"`
	// Alias name
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a ClusterAlias resource.
type ClusterAliasArgs struct {
	// IP/CIDR block
	Cidr pulumi.StringInput
	// Alias comment
	Comment pulumi.StringPtrInput
	// Alias name
	Name pulumi.StringPtrInput
}

func (ClusterAliasArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterAliasArgs)(nil)).Elem()
}

type ClusterAliasInput interface {
	pulumi.Input

	ToClusterAliasOutput() ClusterAliasOutput
	ToClusterAliasOutputWithContext(ctx context.Context) ClusterAliasOutput
}

func (*ClusterAlias) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterAlias)(nil)).Elem()
}

func (i *ClusterAlias) ToClusterAliasOutput() ClusterAliasOutput {
	return i.ToClusterAliasOutputWithContext(context.Background())
}

func (i *ClusterAlias) ToClusterAliasOutputWithContext(ctx context.Context) ClusterAliasOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAliasOutput)
}

// ClusterAliasArrayInput is an input type that accepts ClusterAliasArray and ClusterAliasArrayOutput values.
// You can construct a concrete instance of `ClusterAliasArrayInput` via:
//
//	ClusterAliasArray{ ClusterAliasArgs{...} }
type ClusterAliasArrayInput interface {
	pulumi.Input

	ToClusterAliasArrayOutput() ClusterAliasArrayOutput
	ToClusterAliasArrayOutputWithContext(context.Context) ClusterAliasArrayOutput
}

type ClusterAliasArray []ClusterAliasInput

func (ClusterAliasArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterAlias)(nil)).Elem()
}

func (i ClusterAliasArray) ToClusterAliasArrayOutput() ClusterAliasArrayOutput {
	return i.ToClusterAliasArrayOutputWithContext(context.Background())
}

func (i ClusterAliasArray) ToClusterAliasArrayOutputWithContext(ctx context.Context) ClusterAliasArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAliasArrayOutput)
}

// ClusterAliasMapInput is an input type that accepts ClusterAliasMap and ClusterAliasMapOutput values.
// You can construct a concrete instance of `ClusterAliasMapInput` via:
//
//	ClusterAliasMap{ "key": ClusterAliasArgs{...} }
type ClusterAliasMapInput interface {
	pulumi.Input

	ToClusterAliasMapOutput() ClusterAliasMapOutput
	ToClusterAliasMapOutputWithContext(context.Context) ClusterAliasMapOutput
}

type ClusterAliasMap map[string]ClusterAliasInput

func (ClusterAliasMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterAlias)(nil)).Elem()
}

func (i ClusterAliasMap) ToClusterAliasMapOutput() ClusterAliasMapOutput {
	return i.ToClusterAliasMapOutputWithContext(context.Background())
}

func (i ClusterAliasMap) ToClusterAliasMapOutputWithContext(ctx context.Context) ClusterAliasMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterAliasMapOutput)
}

type ClusterAliasOutput struct{ *pulumi.OutputState }

func (ClusterAliasOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterAlias)(nil)).Elem()
}

func (o ClusterAliasOutput) ToClusterAliasOutput() ClusterAliasOutput {
	return o
}

func (o ClusterAliasOutput) ToClusterAliasOutputWithContext(ctx context.Context) ClusterAliasOutput {
	return o
}

// IP/CIDR block
func (o ClusterAliasOutput) Cidr() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterAlias) pulumi.StringOutput { return v.Cidr }).(pulumi.StringOutput)
}

// Alias comment
func (o ClusterAliasOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterAlias) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Alias name
func (o ClusterAliasOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterAlias) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type ClusterAliasArrayOutput struct{ *pulumi.OutputState }

func (ClusterAliasArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterAlias)(nil)).Elem()
}

func (o ClusterAliasArrayOutput) ToClusterAliasArrayOutput() ClusterAliasArrayOutput {
	return o
}

func (o ClusterAliasArrayOutput) ToClusterAliasArrayOutputWithContext(ctx context.Context) ClusterAliasArrayOutput {
	return o
}

func (o ClusterAliasArrayOutput) Index(i pulumi.IntInput) ClusterAliasOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterAlias {
		return vs[0].([]*ClusterAlias)[vs[1].(int)]
	}).(ClusterAliasOutput)
}

type ClusterAliasMapOutput struct{ *pulumi.OutputState }

func (ClusterAliasMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterAlias)(nil)).Elem()
}

func (o ClusterAliasMapOutput) ToClusterAliasMapOutput() ClusterAliasMapOutput {
	return o
}

func (o ClusterAliasMapOutput) ToClusterAliasMapOutputWithContext(ctx context.Context) ClusterAliasMapOutput {
	return o
}

func (o ClusterAliasMapOutput) MapIndex(k pulumi.StringInput) ClusterAliasOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterAlias {
		return vs[0].(map[string]*ClusterAlias)[vs[1].(string)]
	}).(ClusterAliasOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterAliasInput)(nil)).Elem(), &ClusterAlias{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterAliasArrayInput)(nil)).Elem(), ClusterAliasArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterAliasMapInput)(nil)).Elem(), ClusterAliasMap{})
	pulumi.RegisterOutputType(ClusterAliasOutput{})
	pulumi.RegisterOutputType(ClusterAliasArrayOutput{})
	pulumi.RegisterOutputType(ClusterAliasMapOutput{})
}
