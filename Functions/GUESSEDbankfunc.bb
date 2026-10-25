Function GUESSEDbankfunc%(arg0%, arg1%, arg2%, arg3%, arg4%, arg5%)
    blitz_TXXF80Z0FD00($0A)
    blitz_TXXF80Z0FD00(arg2)
    If (GUESSEDupdateanimatenpc() <> 0) Then
        blitz_TXBFB002B8X0(arg4)
        blitz_TXXF80Z0FD00($00)
        blitz_TXXF80Z0FD00(arg5)
    Else
        blitz_TXXF80Z0FD00(arg4)
    EndIf
    GUESSEDcopybank(arg3, banksize(arg3), $00)
    MP_Send(arg0, arg1, $00, $01, $00)
    Return $00
End Function
