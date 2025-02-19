# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'HostsEntryArgs',
    'ProviderSshArgs',
    'ProviderSshNodeArgs',
]

@pulumi.input_type
class HostsEntryArgs:
    def __init__(__self__, *,
                 address: pulumi.Input[str],
                 hostnames: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        :param pulumi.Input[str] address: The IP address.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: The hostnames.
        """
        pulumi.set(__self__, "address", address)
        pulumi.set(__self__, "hostnames", hostnames)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Input[str]:
        """
        The IP address.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: pulumi.Input[str]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter
    def hostnames(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The hostnames.
        """
        return pulumi.get(self, "hostnames")

    @hostnames.setter
    def hostnames(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "hostnames", value)


@pulumi.input_type
class ProviderSshArgs:
    def __init__(__self__, *,
                 agent: Optional[pulumi.Input[bool]] = None,
                 agent_socket: Optional[pulumi.Input[str]] = None,
                 nodes: Optional[pulumi.Input[Sequence[pulumi.Input['ProviderSshNodeArgs']]]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 socks5_password: Optional[pulumi.Input[str]] = None,
                 socks5_server: Optional[pulumi.Input[str]] = None,
                 socks5_username: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[bool] agent: Whether to use the SSH agent for authentication. Defaults to `false`.
        :param pulumi.Input[str] agent_socket: The path to the SSH agent socket. Defaults to the value of the `SSH_AUTH_SOCK` environment variable.
        :param pulumi.Input[Sequence[pulumi.Input['ProviderSshNodeArgs']]] nodes: Overrides for SSH connection configuration for a Proxmox VE node.
        :param pulumi.Input[str] password: The password used for the SSH connection. Defaults to the value of the `password` field of the `provider` block.
        :param pulumi.Input[str] socks5_password: The password for the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_PASSWORD` environment variable.
        :param pulumi.Input[str] socks5_server: The address:port of the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_SERVER` environment variable.
        :param pulumi.Input[str] socks5_username: The username for the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_USERNAME` environment variable.
        :param pulumi.Input[str] username: The username used for the SSH connection. Defaults to the value of the `username` field of the `provider` block.
        """
        if agent is not None:
            pulumi.set(__self__, "agent", agent)
        if agent_socket is not None:
            pulumi.set(__self__, "agent_socket", agent_socket)
        if nodes is not None:
            pulumi.set(__self__, "nodes", nodes)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if socks5_password is not None:
            pulumi.set(__self__, "socks5_password", socks5_password)
        if socks5_server is not None:
            pulumi.set(__self__, "socks5_server", socks5_server)
        if socks5_username is not None:
            pulumi.set(__self__, "socks5_username", socks5_username)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def agent(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to use the SSH agent for authentication. Defaults to `false`.
        """
        return pulumi.get(self, "agent")

    @agent.setter
    def agent(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "agent", value)

    @property
    @pulumi.getter(name="agentSocket")
    def agent_socket(self) -> Optional[pulumi.Input[str]]:
        """
        The path to the SSH agent socket. Defaults to the value of the `SSH_AUTH_SOCK` environment variable.
        """
        return pulumi.get(self, "agent_socket")

    @agent_socket.setter
    def agent_socket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "agent_socket", value)

    @property
    @pulumi.getter
    def nodes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ProviderSshNodeArgs']]]]:
        """
        Overrides for SSH connection configuration for a Proxmox VE node.
        """
        return pulumi.get(self, "nodes")

    @nodes.setter
    def nodes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ProviderSshNodeArgs']]]]):
        pulumi.set(self, "nodes", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        The password used for the SSH connection. Defaults to the value of the `password` field of the `provider` block.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="socks5Password")
    def socks5_password(self) -> Optional[pulumi.Input[str]]:
        """
        The password for the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_PASSWORD` environment variable.
        """
        return pulumi.get(self, "socks5_password")

    @socks5_password.setter
    def socks5_password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "socks5_password", value)

    @property
    @pulumi.getter(name="socks5Server")
    def socks5_server(self) -> Optional[pulumi.Input[str]]:
        """
        The address:port of the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_SERVER` environment variable.
        """
        return pulumi.get(self, "socks5_server")

    @socks5_server.setter
    def socks5_server(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "socks5_server", value)

    @property
    @pulumi.getter(name="socks5Username")
    def socks5_username(self) -> Optional[pulumi.Input[str]]:
        """
        The username for the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_USERNAME` environment variable.
        """
        return pulumi.get(self, "socks5_username")

    @socks5_username.setter
    def socks5_username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "socks5_username", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        The username used for the SSH connection. Defaults to the value of the `username` field of the `provider` block.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


@pulumi.input_type
class ProviderSshNodeArgs:
    def __init__(__self__, *,
                 address: pulumi.Input[str],
                 name: pulumi.Input[str],
                 port: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[str] address: The address of the Proxmox VE node.
        :param pulumi.Input[str] name: The name of the Proxmox VE node.
        :param pulumi.Input[int] port: The port of the Proxmox VE node.
        """
        pulumi.set(__self__, "address", address)
        pulumi.set(__self__, "name", name)
        if port is not None:
            pulumi.set(__self__, "port", port)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Input[str]:
        """
        The address of the Proxmox VE node.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: pulumi.Input[str]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the Proxmox VE node.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        """
        The port of the Proxmox VE node.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)


