<img width="388" height="473" alt="image" src="https://github.com/user-attachments/assets/71dacb8e-9ec1-46ed-bd95-692358d95876" />

The decompiler as of now lacks function pointer support, the generated `.bb` source is not yet compilable.
1:1 Blitz identifiers were recovered where possible, the rest are best-effort guesses.

The game is based on the works of the SCP Foundation community (http://www.scp-wiki.net/).

This game and the source code are licensed under Creative Commons Attribution-ShareAlike 3.0 License.

http://creativecommons.org/licenses/by-sa/3.0/

## Core
| Function | File | Role |
|---|---|---|
| `MP_Update` | [Functions/MP_Update.bb](Functions/MP_Update.bb) | Self explanatory |
| `MP_UpdateEvents` | [Functions/MP_UpdateEvents.bb](Functions/MP_UpdateEvents.bb) | Event sync |
| `MP_UpdateNPCs` | [Functions/MP_UpdateNPCs.bb](Functions/MP_UpdateNPCs.bb) | NPC sync |
| `MP_FillRoom` | [Functions/MP_FillRoom.bb](Functions/MP_FillRoom.bb) | MP room population |
| `MP_Reset` | [Functions/MP_Reset.bb](Functions/MP_Reset.bb) | Closes stream/connection, resets MP state |
| `MP_UpdatePing` | [Functions/MP_UpdatePing.bb](Functions/MP_UpdatePing.bb) | Refreshes connection ping |
| `MP_ProcessMessages` | [Functions/MP_ProcessMessages.bb](Functions/MP_ProcessMessages.bb) | Drains incoming messages |
| `MP_UpdateJoinQueue` | [Functions/MP_UpdateJoinQueue.bb](Functions/MP_UpdateJoinQueue.bb) | Join queue / loading text |
| `MP_IsConnected` | [Functions/MP_IsConnected.bb](Functions/MP_IsConnected.bb) | Connection state getter |
| `MP_GetLoadingProgress` | [Functions/MP_GetLoadingProgress.bb](Functions/MP_GetLoadingProgress.bb) | Loading progress getter |

## Transport
| Function | File | Role |
|---|---|---|
| `MP_Connect` | [Functions/MP_Connect.bb](Functions/MP_Connect.bb) | `_BN_Connect` |
| `MP_Disconnect` | [Functions/MP_Disconnect.bb](Functions/MP_Disconnect.bb) | `_BN_CloseConnection` |
| `MP_SendMessage` | [Functions/MP_SendMessage.bb](Functions/MP_SendMessage.bb) | `_BN_SendMsg` / `_Steam_SendP2PPacket` |
| `MP_MessageAvailable` | [Functions/MP_MessageAvailable.bb](Functions/MP_MessageAvailable.bb) | `_Steam_IsP2PPacketAvailable` / `_BN_Msg*` |
| `MP_ReceiveMessage` | [Functions/MP_ReceiveMessage.bb](Functions/MP_ReceiveMessage.bb) | `_BN_RecvMsg` |
| `MP_ReadP2PPacket` | [Functions/MP_ReadP2PPacket.bb](Functions/MP_ReadP2PPacket.bb) | `_Steam_ReadP2PPacket` |
| `MP_CreateStream` | [Functions/MP_CreateStream.bb](Functions/MP_CreateStream.bb) | `_BN_CreateStream` |
| `MP_GetPing` | [Functions/MP_GetPing.bb](Functions/MP_GetPing.bb) | `_BN_GetConnectionPing` |
| `MP_Send` | [Functions/MP_Send.bb](Functions/MP_Send.bb) | Wrapper over `MP_SendMessage` |
| `MP_ResetConnection` | [Functions/MP_ResetConnection.bb](Functions/MP_ResetConnection.bb) | Zeroes connection fields |

## Server / session / menu / chat
| Function | File | Role |
|---|---|---|
| `MP_LoadMasterServer` | [Functions/MP_LoadMasterServer.bb](Functions/MP_LoadMasterServer.bb) | Reads `Data/masterserver` |
| `MP_LoadServerList` | [Functions/MP_LoadServerList.bb](Functions/MP_LoadServerList.bb) | Parses `servers` JSON |
| `MP_SaveServerList` | [Functions/MP_SaveServerList.bb](Functions/MP_SaveServerList.bb) | Writes `servers` JSON |
| `MP_ParseServerAddress` | [Functions/MP_ParseServerAddress.bb](Functions/MP_ParseServerAddress.bb) | `ip:port/#` parser |
| `MP_CreateSession` | [Functions/MP_CreateSession.bb](Functions/MP_CreateSession.bb) | Sets `SCP CB 2 COOP Session` |
| `MP_SetSession` | [Functions/MP_SetSession.bb](Functions/MP_SetSession.bb) | Sets `SCP CB 2 COOP Session` |
| `MP_JoinServer` | [Functions/MP_JoinServer.bb](Functions/MP_JoinServer.bb) | Join flow |
| `MP_ConnectMenu` | [Functions/MP_ConnectMenu.bb](Functions/MP_ConnectMenu.bb) | `mpmenu` connect flow |
| `MP_ServerInfoMenu` | [Functions/MP_ServerInfoMenu.bb](Functions/MP_ServerInfoMenu.bb) | `mpmenu` server information |
| `MP_ChatCommand` | [Functions/MP_ChatCommand.bb](Functions/MP_ChatCommand.bb) | `/op`, `/deop`, `/bot` |
| `MP_Broadcast` | [Functions/MP_Broadcast.bb](Functions/MP_Broadcast.bb) | Broadcast chat |
| `MP_BroadcastTo` | [Functions/MP_BroadcastTo.bb](Functions/MP_BroadcastTo.bb) | Directed broadcast |

## Player sync
| Function | File | Role |
|---|---|---|
| `MP_SendLocalPlayer` | [Functions/MP_SendLocalPlayer.bb](Functions/MP_SendLocalPlayer.bb) | Steam ID + local player info |
| `MP_SendPlayerInfo` | [Functions/MP_SendPlayerInfo.bb](Functions/MP_SendPlayerInfo.bb) | Steam ID + player packet type 2 |
| `MP_UpdateUserRow` | [Functions/MP_UpdateUserRow.bb](Functions/MP_UpdateUserRow.bb) | Player row / Steam overlay |
