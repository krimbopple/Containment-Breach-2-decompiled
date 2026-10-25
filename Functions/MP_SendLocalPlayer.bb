Function MP_SendLocalPlayer%(arg0%, arg1%)
    Local local0%
    Local local1%
    GUESSEDsetupdatemainmenu($00)
    Steam_GetAuthSessionTicket()
    X40BZ0ZDD8\Field2 = arg0
    X40BZ0ZDD8\Field1 = arg1
    _Steam_GetUInt64(_Steam_GetPlayerID(), local0, local1)
    blitz_TXXF80Z0FD00($01)
    blitz_ZXBBD60DX0(left(opt\Field75, $1F))
    blitz_TXBFB002B8X0($20105)
    blitz_ZXBBD60DX0(randomseed)
    blitz_ZXBBD60DX0(opt\Field42)
    blitz_TXBFB002B8X0(local0)
    blitz_TXBFB002B8X0(local1)
    blitz_ZXBBD60DX0(getuserlanguage())
    blitz_TXBFB002B8X0(opt\Field21)
    blitz_TXBFB002B8X0(opt\Field46)
    blitz_ZXBBD60DX0(GUESSEDgetglobal_5())
    blitz_TXBFB002B8X0(GUESSEDcountsurfaces())
    blitz_ZXBBD60DX0(GUESSEDjointabstrings())
    GUESSEDcopybank(GUESSEDgetglobal_18(), GUESSEDgetglobal_17(), $00)
    MP_Connect(X40BZ0ZDD8\Field2, X40BZ0ZDD8\Field1)
    Return $00
End Function
