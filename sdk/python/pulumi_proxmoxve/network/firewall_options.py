# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['FirewallOptionsArgs', 'FirewallOptions']

@pulumi.input_type
class FirewallOptionsArgs:
    def __init__(__self__, *,
                 node_name: pulumi.Input[str],
                 container_id: Optional[pulumi.Input[int]] = None,
                 dhcp: Optional[pulumi.Input[bool]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 input_policy: Optional[pulumi.Input[str]] = None,
                 ipfilter: Optional[pulumi.Input[bool]] = None,
                 log_level_in: Optional[pulumi.Input[str]] = None,
                 log_level_out: Optional[pulumi.Input[str]] = None,
                 macfilter: Optional[pulumi.Input[bool]] = None,
                 ndp: Optional[pulumi.Input[bool]] = None,
                 output_policy: Optional[pulumi.Input[str]] = None,
                 radv: Optional[pulumi.Input[bool]] = None,
                 vm_id: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a FirewallOptions resource.
        :param pulumi.Input[str] node_name: Node name.
        :param pulumi.Input[int] container_id: Container ID. Leave empty for cluster level aliases.
        :param pulumi.Input[bool] dhcp: Enable DHCP.
        :param pulumi.Input[bool] enabled: Enable or disable the firewall.
        :param pulumi.Input[str] input_policy: The default input
               policy (`ACCEPT`, `DROP`, `REJECT`).
        :param pulumi.Input[bool] ipfilter: Enable default IP filters. This is equivalent to
               adding an empty `ipfilter-net<id>` ipset for every interface. Such ipsets
               implicitly contain sane default restrictions such as restricting IPv6 link
               local addresses to the one derived from the interface's MAC address. For
               containers the configured IP addresses will be implicitly added.
        :param pulumi.Input[str] log_level_in: Log level for incoming
               packets (`emerg`, `alert`, `crit`, `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        :param pulumi.Input[str] log_level_out: Log level for outgoing
               packets (`emerg`, `alert`, `crit`, `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        :param pulumi.Input[bool] macfilter: Enable/disable MAC address filter.
        :param pulumi.Input[bool] ndp: Enable NDP (Neighbor Discovery Protocol).
        :param pulumi.Input[str] output_policy: The default output
               policy (`ACCEPT`, `DROP`, `REJECT`).
        :param pulumi.Input[bool] radv: Enable Router Advertisement.
        :param pulumi.Input[int] vm_id: VM ID. Leave empty for cluster level aliases.
        """
        pulumi.set(__self__, "node_name", node_name)
        if container_id is not None:
            pulumi.set(__self__, "container_id", container_id)
        if dhcp is not None:
            pulumi.set(__self__, "dhcp", dhcp)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if input_policy is not None:
            pulumi.set(__self__, "input_policy", input_policy)
        if ipfilter is not None:
            pulumi.set(__self__, "ipfilter", ipfilter)
        if log_level_in is not None:
            pulumi.set(__self__, "log_level_in", log_level_in)
        if log_level_out is not None:
            pulumi.set(__self__, "log_level_out", log_level_out)
        if macfilter is not None:
            pulumi.set(__self__, "macfilter", macfilter)
        if ndp is not None:
            pulumi.set(__self__, "ndp", ndp)
        if output_policy is not None:
            pulumi.set(__self__, "output_policy", output_policy)
        if radv is not None:
            pulumi.set(__self__, "radv", radv)
        if vm_id is not None:
            pulumi.set(__self__, "vm_id", vm_id)

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> pulumi.Input[str]:
        """
        Node name.
        """
        return pulumi.get(self, "node_name")

    @node_name.setter
    def node_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "node_name", value)

    @property
    @pulumi.getter(name="containerId")
    def container_id(self) -> Optional[pulumi.Input[int]]:
        """
        Container ID. Leave empty for cluster level aliases.
        """
        return pulumi.get(self, "container_id")

    @container_id.setter
    def container_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "container_id", value)

    @property
    @pulumi.getter
    def dhcp(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable DHCP.
        """
        return pulumi.get(self, "dhcp")

    @dhcp.setter
    def dhcp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dhcp", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable or disable the firewall.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="inputPolicy")
    def input_policy(self) -> Optional[pulumi.Input[str]]:
        """
        The default input
        policy (`ACCEPT`, `DROP`, `REJECT`).
        """
        return pulumi.get(self, "input_policy")

    @input_policy.setter
    def input_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "input_policy", value)

    @property
    @pulumi.getter
    def ipfilter(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable default IP filters. This is equivalent to
        adding an empty `ipfilter-net<id>` ipset for every interface. Such ipsets
        implicitly contain sane default restrictions such as restricting IPv6 link
        local addresses to the one derived from the interface's MAC address. For
        containers the configured IP addresses will be implicitly added.
        """
        return pulumi.get(self, "ipfilter")

    @ipfilter.setter
    def ipfilter(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ipfilter", value)

    @property
    @pulumi.getter(name="logLevelIn")
    def log_level_in(self) -> Optional[pulumi.Input[str]]:
        """
        Log level for incoming
        packets (`emerg`, `alert`, `crit`, `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        """
        return pulumi.get(self, "log_level_in")

    @log_level_in.setter
    def log_level_in(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "log_level_in", value)

    @property
    @pulumi.getter(name="logLevelOut")
    def log_level_out(self) -> Optional[pulumi.Input[str]]:
        """
        Log level for outgoing
        packets (`emerg`, `alert`, `crit`, `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        """
        return pulumi.get(self, "log_level_out")

    @log_level_out.setter
    def log_level_out(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "log_level_out", value)

    @property
    @pulumi.getter
    def macfilter(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable/disable MAC address filter.
        """
        return pulumi.get(self, "macfilter")

    @macfilter.setter
    def macfilter(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "macfilter", value)

    @property
    @pulumi.getter
    def ndp(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable NDP (Neighbor Discovery Protocol).
        """
        return pulumi.get(self, "ndp")

    @ndp.setter
    def ndp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ndp", value)

    @property
    @pulumi.getter(name="outputPolicy")
    def output_policy(self) -> Optional[pulumi.Input[str]]:
        """
        The default output
        policy (`ACCEPT`, `DROP`, `REJECT`).
        """
        return pulumi.get(self, "output_policy")

    @output_policy.setter
    def output_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "output_policy", value)

    @property
    @pulumi.getter
    def radv(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable Router Advertisement.
        """
        return pulumi.get(self, "radv")

    @radv.setter
    def radv(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "radv", value)

    @property
    @pulumi.getter(name="vmId")
    def vm_id(self) -> Optional[pulumi.Input[int]]:
        """
        VM ID. Leave empty for cluster level aliases.
        """
        return pulumi.get(self, "vm_id")

    @vm_id.setter
    def vm_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vm_id", value)


@pulumi.input_type
class _FirewallOptionsState:
    def __init__(__self__, *,
                 container_id: Optional[pulumi.Input[int]] = None,
                 dhcp: Optional[pulumi.Input[bool]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 input_policy: Optional[pulumi.Input[str]] = None,
                 ipfilter: Optional[pulumi.Input[bool]] = None,
                 log_level_in: Optional[pulumi.Input[str]] = None,
                 log_level_out: Optional[pulumi.Input[str]] = None,
                 macfilter: Optional[pulumi.Input[bool]] = None,
                 ndp: Optional[pulumi.Input[bool]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 output_policy: Optional[pulumi.Input[str]] = None,
                 radv: Optional[pulumi.Input[bool]] = None,
                 vm_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering FirewallOptions resources.
        :param pulumi.Input[int] container_id: Container ID. Leave empty for cluster level aliases.
        :param pulumi.Input[bool] dhcp: Enable DHCP.
        :param pulumi.Input[bool] enabled: Enable or disable the firewall.
        :param pulumi.Input[str] input_policy: The default input
               policy (`ACCEPT`, `DROP`, `REJECT`).
        :param pulumi.Input[bool] ipfilter: Enable default IP filters. This is equivalent to
               adding an empty `ipfilter-net<id>` ipset for every interface. Such ipsets
               implicitly contain sane default restrictions such as restricting IPv6 link
               local addresses to the one derived from the interface's MAC address. For
               containers the configured IP addresses will be implicitly added.
        :param pulumi.Input[str] log_level_in: Log level for incoming
               packets (`emerg`, `alert`, `crit`, `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        :param pulumi.Input[str] log_level_out: Log level for outgoing
               packets (`emerg`, `alert`, `crit`, `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        :param pulumi.Input[bool] macfilter: Enable/disable MAC address filter.
        :param pulumi.Input[bool] ndp: Enable NDP (Neighbor Discovery Protocol).
        :param pulumi.Input[str] node_name: Node name.
        :param pulumi.Input[str] output_policy: The default output
               policy (`ACCEPT`, `DROP`, `REJECT`).
        :param pulumi.Input[bool] radv: Enable Router Advertisement.
        :param pulumi.Input[int] vm_id: VM ID. Leave empty for cluster level aliases.
        """
        if container_id is not None:
            pulumi.set(__self__, "container_id", container_id)
        if dhcp is not None:
            pulumi.set(__self__, "dhcp", dhcp)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if input_policy is not None:
            pulumi.set(__self__, "input_policy", input_policy)
        if ipfilter is not None:
            pulumi.set(__self__, "ipfilter", ipfilter)
        if log_level_in is not None:
            pulumi.set(__self__, "log_level_in", log_level_in)
        if log_level_out is not None:
            pulumi.set(__self__, "log_level_out", log_level_out)
        if macfilter is not None:
            pulumi.set(__self__, "macfilter", macfilter)
        if ndp is not None:
            pulumi.set(__self__, "ndp", ndp)
        if node_name is not None:
            pulumi.set(__self__, "node_name", node_name)
        if output_policy is not None:
            pulumi.set(__self__, "output_policy", output_policy)
        if radv is not None:
            pulumi.set(__self__, "radv", radv)
        if vm_id is not None:
            pulumi.set(__self__, "vm_id", vm_id)

    @property
    @pulumi.getter(name="containerId")
    def container_id(self) -> Optional[pulumi.Input[int]]:
        """
        Container ID. Leave empty for cluster level aliases.
        """
        return pulumi.get(self, "container_id")

    @container_id.setter
    def container_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "container_id", value)

    @property
    @pulumi.getter
    def dhcp(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable DHCP.
        """
        return pulumi.get(self, "dhcp")

    @dhcp.setter
    def dhcp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dhcp", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable or disable the firewall.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="inputPolicy")
    def input_policy(self) -> Optional[pulumi.Input[str]]:
        """
        The default input
        policy (`ACCEPT`, `DROP`, `REJECT`).
        """
        return pulumi.get(self, "input_policy")

    @input_policy.setter
    def input_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "input_policy", value)

    @property
    @pulumi.getter
    def ipfilter(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable default IP filters. This is equivalent to
        adding an empty `ipfilter-net<id>` ipset for every interface. Such ipsets
        implicitly contain sane default restrictions such as restricting IPv6 link
        local addresses to the one derived from the interface's MAC address. For
        containers the configured IP addresses will be implicitly added.
        """
        return pulumi.get(self, "ipfilter")

    @ipfilter.setter
    def ipfilter(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ipfilter", value)

    @property
    @pulumi.getter(name="logLevelIn")
    def log_level_in(self) -> Optional[pulumi.Input[str]]:
        """
        Log level for incoming
        packets (`emerg`, `alert`, `crit`, `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        """
        return pulumi.get(self, "log_level_in")

    @log_level_in.setter
    def log_level_in(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "log_level_in", value)

    @property
    @pulumi.getter(name="logLevelOut")
    def log_level_out(self) -> Optional[pulumi.Input[str]]:
        """
        Log level for outgoing
        packets (`emerg`, `alert`, `crit`, `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        """
        return pulumi.get(self, "log_level_out")

    @log_level_out.setter
    def log_level_out(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "log_level_out", value)

    @property
    @pulumi.getter
    def macfilter(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable/disable MAC address filter.
        """
        return pulumi.get(self, "macfilter")

    @macfilter.setter
    def macfilter(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "macfilter", value)

    @property
    @pulumi.getter
    def ndp(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable NDP (Neighbor Discovery Protocol).
        """
        return pulumi.get(self, "ndp")

    @ndp.setter
    def ndp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ndp", value)

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> Optional[pulumi.Input[str]]:
        """
        Node name.
        """
        return pulumi.get(self, "node_name")

    @node_name.setter
    def node_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "node_name", value)

    @property
    @pulumi.getter(name="outputPolicy")
    def output_policy(self) -> Optional[pulumi.Input[str]]:
        """
        The default output
        policy (`ACCEPT`, `DROP`, `REJECT`).
        """
        return pulumi.get(self, "output_policy")

    @output_policy.setter
    def output_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "output_policy", value)

    @property
    @pulumi.getter
    def radv(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable Router Advertisement.
        """
        return pulumi.get(self, "radv")

    @radv.setter
    def radv(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "radv", value)

    @property
    @pulumi.getter(name="vmId")
    def vm_id(self) -> Optional[pulumi.Input[int]]:
        """
        VM ID. Leave empty for cluster level aliases.
        """
        return pulumi.get(self, "vm_id")

    @vm_id.setter
    def vm_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vm_id", value)


class FirewallOptions(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 container_id: Optional[pulumi.Input[int]] = None,
                 dhcp: Optional[pulumi.Input[bool]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 input_policy: Optional[pulumi.Input[str]] = None,
                 ipfilter: Optional[pulumi.Input[bool]] = None,
                 log_level_in: Optional[pulumi.Input[str]] = None,
                 log_level_out: Optional[pulumi.Input[str]] = None,
                 macfilter: Optional[pulumi.Input[bool]] = None,
                 ndp: Optional[pulumi.Input[bool]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 output_policy: Optional[pulumi.Input[str]] = None,
                 radv: Optional[pulumi.Input[bool]] = None,
                 vm_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Manages firewall options on VM / Container level.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_proxmoxve as proxmoxve

        example = proxmoxve.network.FirewallOptions("example",
            node_name=proxmox_virtual_environment_vm["example"]["node_name"],
            vm_id=proxmox_virtual_environment_vm["example"]["vm_id"],
            dhcp=True,
            enabled=False,
            ipfilter=True,
            log_level_in="info",
            log_level_out="info",
            macfilter=False,
            ndp=True,
            input_policy="ACCEPT",
            output_policy="ACCEPT",
            radv=True,
            opts=pulumi.ResourceOptions(depends_on=[proxmox_virtual_environment_vm["example"]]))
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] container_id: Container ID. Leave empty for cluster level aliases.
        :param pulumi.Input[bool] dhcp: Enable DHCP.
        :param pulumi.Input[bool] enabled: Enable or disable the firewall.
        :param pulumi.Input[str] input_policy: The default input
               policy (`ACCEPT`, `DROP`, `REJECT`).
        :param pulumi.Input[bool] ipfilter: Enable default IP filters. This is equivalent to
               adding an empty `ipfilter-net<id>` ipset for every interface. Such ipsets
               implicitly contain sane default restrictions such as restricting IPv6 link
               local addresses to the one derived from the interface's MAC address. For
               containers the configured IP addresses will be implicitly added.
        :param pulumi.Input[str] log_level_in: Log level for incoming
               packets (`emerg`, `alert`, `crit`, `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        :param pulumi.Input[str] log_level_out: Log level for outgoing
               packets (`emerg`, `alert`, `crit`, `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        :param pulumi.Input[bool] macfilter: Enable/disable MAC address filter.
        :param pulumi.Input[bool] ndp: Enable NDP (Neighbor Discovery Protocol).
        :param pulumi.Input[str] node_name: Node name.
        :param pulumi.Input[str] output_policy: The default output
               policy (`ACCEPT`, `DROP`, `REJECT`).
        :param pulumi.Input[bool] radv: Enable Router Advertisement.
        :param pulumi.Input[int] vm_id: VM ID. Leave empty for cluster level aliases.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FirewallOptionsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages firewall options on VM / Container level.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_proxmoxve as proxmoxve

        example = proxmoxve.network.FirewallOptions("example",
            node_name=proxmox_virtual_environment_vm["example"]["node_name"],
            vm_id=proxmox_virtual_environment_vm["example"]["vm_id"],
            dhcp=True,
            enabled=False,
            ipfilter=True,
            log_level_in="info",
            log_level_out="info",
            macfilter=False,
            ndp=True,
            input_policy="ACCEPT",
            output_policy="ACCEPT",
            radv=True,
            opts=pulumi.ResourceOptions(depends_on=[proxmox_virtual_environment_vm["example"]]))
        ```

        :param str resource_name: The name of the resource.
        :param FirewallOptionsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FirewallOptionsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 container_id: Optional[pulumi.Input[int]] = None,
                 dhcp: Optional[pulumi.Input[bool]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 input_policy: Optional[pulumi.Input[str]] = None,
                 ipfilter: Optional[pulumi.Input[bool]] = None,
                 log_level_in: Optional[pulumi.Input[str]] = None,
                 log_level_out: Optional[pulumi.Input[str]] = None,
                 macfilter: Optional[pulumi.Input[bool]] = None,
                 ndp: Optional[pulumi.Input[bool]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 output_policy: Optional[pulumi.Input[str]] = None,
                 radv: Optional[pulumi.Input[bool]] = None,
                 vm_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FirewallOptionsArgs.__new__(FirewallOptionsArgs)

            __props__.__dict__["container_id"] = container_id
            __props__.__dict__["dhcp"] = dhcp
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["input_policy"] = input_policy
            __props__.__dict__["ipfilter"] = ipfilter
            __props__.__dict__["log_level_in"] = log_level_in
            __props__.__dict__["log_level_out"] = log_level_out
            __props__.__dict__["macfilter"] = macfilter
            __props__.__dict__["ndp"] = ndp
            if node_name is None and not opts.urn:
                raise TypeError("Missing required property 'node_name'")
            __props__.__dict__["node_name"] = node_name
            __props__.__dict__["output_policy"] = output_policy
            __props__.__dict__["radv"] = radv
            __props__.__dict__["vm_id"] = vm_id
        super(FirewallOptions, __self__).__init__(
            'proxmoxve:Network/firewallOptions:FirewallOptions',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            container_id: Optional[pulumi.Input[int]] = None,
            dhcp: Optional[pulumi.Input[bool]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            input_policy: Optional[pulumi.Input[str]] = None,
            ipfilter: Optional[pulumi.Input[bool]] = None,
            log_level_in: Optional[pulumi.Input[str]] = None,
            log_level_out: Optional[pulumi.Input[str]] = None,
            macfilter: Optional[pulumi.Input[bool]] = None,
            ndp: Optional[pulumi.Input[bool]] = None,
            node_name: Optional[pulumi.Input[str]] = None,
            output_policy: Optional[pulumi.Input[str]] = None,
            radv: Optional[pulumi.Input[bool]] = None,
            vm_id: Optional[pulumi.Input[int]] = None) -> 'FirewallOptions':
        """
        Get an existing FirewallOptions resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] container_id: Container ID. Leave empty for cluster level aliases.
        :param pulumi.Input[bool] dhcp: Enable DHCP.
        :param pulumi.Input[bool] enabled: Enable or disable the firewall.
        :param pulumi.Input[str] input_policy: The default input
               policy (`ACCEPT`, `DROP`, `REJECT`).
        :param pulumi.Input[bool] ipfilter: Enable default IP filters. This is equivalent to
               adding an empty `ipfilter-net<id>` ipset for every interface. Such ipsets
               implicitly contain sane default restrictions such as restricting IPv6 link
               local addresses to the one derived from the interface's MAC address. For
               containers the configured IP addresses will be implicitly added.
        :param pulumi.Input[str] log_level_in: Log level for incoming
               packets (`emerg`, `alert`, `crit`, `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        :param pulumi.Input[str] log_level_out: Log level for outgoing
               packets (`emerg`, `alert`, `crit`, `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        :param pulumi.Input[bool] macfilter: Enable/disable MAC address filter.
        :param pulumi.Input[bool] ndp: Enable NDP (Neighbor Discovery Protocol).
        :param pulumi.Input[str] node_name: Node name.
        :param pulumi.Input[str] output_policy: The default output
               policy (`ACCEPT`, `DROP`, `REJECT`).
        :param pulumi.Input[bool] radv: Enable Router Advertisement.
        :param pulumi.Input[int] vm_id: VM ID. Leave empty for cluster level aliases.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FirewallOptionsState.__new__(_FirewallOptionsState)

        __props__.__dict__["container_id"] = container_id
        __props__.__dict__["dhcp"] = dhcp
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["input_policy"] = input_policy
        __props__.__dict__["ipfilter"] = ipfilter
        __props__.__dict__["log_level_in"] = log_level_in
        __props__.__dict__["log_level_out"] = log_level_out
        __props__.__dict__["macfilter"] = macfilter
        __props__.__dict__["ndp"] = ndp
        __props__.__dict__["node_name"] = node_name
        __props__.__dict__["output_policy"] = output_policy
        __props__.__dict__["radv"] = radv
        __props__.__dict__["vm_id"] = vm_id
        return FirewallOptions(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="containerId")
    def container_id(self) -> pulumi.Output[Optional[int]]:
        """
        Container ID. Leave empty for cluster level aliases.
        """
        return pulumi.get(self, "container_id")

    @property
    @pulumi.getter
    def dhcp(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable DHCP.
        """
        return pulumi.get(self, "dhcp")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable or disable the firewall.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="inputPolicy")
    def input_policy(self) -> pulumi.Output[Optional[str]]:
        """
        The default input
        policy (`ACCEPT`, `DROP`, `REJECT`).
        """
        return pulumi.get(self, "input_policy")

    @property
    @pulumi.getter
    def ipfilter(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable default IP filters. This is equivalent to
        adding an empty `ipfilter-net<id>` ipset for every interface. Such ipsets
        implicitly contain sane default restrictions such as restricting IPv6 link
        local addresses to the one derived from the interface's MAC address. For
        containers the configured IP addresses will be implicitly added.
        """
        return pulumi.get(self, "ipfilter")

    @property
    @pulumi.getter(name="logLevelIn")
    def log_level_in(self) -> pulumi.Output[Optional[str]]:
        """
        Log level for incoming
        packets (`emerg`, `alert`, `crit`, `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        """
        return pulumi.get(self, "log_level_in")

    @property
    @pulumi.getter(name="logLevelOut")
    def log_level_out(self) -> pulumi.Output[Optional[str]]:
        """
        Log level for outgoing
        packets (`emerg`, `alert`, `crit`, `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        """
        return pulumi.get(self, "log_level_out")

    @property
    @pulumi.getter
    def macfilter(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable/disable MAC address filter.
        """
        return pulumi.get(self, "macfilter")

    @property
    @pulumi.getter
    def ndp(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable NDP (Neighbor Discovery Protocol).
        """
        return pulumi.get(self, "ndp")

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> pulumi.Output[str]:
        """
        Node name.
        """
        return pulumi.get(self, "node_name")

    @property
    @pulumi.getter(name="outputPolicy")
    def output_policy(self) -> pulumi.Output[Optional[str]]:
        """
        The default output
        policy (`ACCEPT`, `DROP`, `REJECT`).
        """
        return pulumi.get(self, "output_policy")

    @property
    @pulumi.getter
    def radv(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable Router Advertisement.
        """
        return pulumi.get(self, "radv")

    @property
    @pulumi.getter(name="vmId")
    def vm_id(self) -> pulumi.Output[Optional[int]]:
        """
        VM ID. Leave empty for cluster level aliases.
        """
        return pulumi.get(self, "vm_id")

