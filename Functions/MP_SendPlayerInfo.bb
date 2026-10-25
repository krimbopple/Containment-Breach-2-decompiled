Function MP_SendPlayerInfo%(arg0%, arg1%)
    Local local0%
    Local local1%
    _Steam_GetUInt64(_Steam_GetPlayerID(), local0, local1)
    blitz_TXXF80Z0FD00($02)
    blitz_TXBFB002B8X0(local0)
    blitz_TXBFB002B8X0(local1)
    blitz_ZXBBD60DX0(randomseed)
    blitz_TXBFB002B8X0(GUESSEDcountsurfaces())
    MP_Send(arg0, arg1, $00, $01, $00)
    Return $00
End Function
