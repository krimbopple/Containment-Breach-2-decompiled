Function TXX0228B6D0%(arg0%, arg1%, arg2%, arg3%, arg4%, arg5%)
    blitz_TXXF80Z0FD00($0A)
    blitz_TXXF80Z0FD00(arg2)
    If (TXB2BFFFFFX() <> 0) Then
        blitz_TXBFB002B8X0(arg4)
        blitz_TXXF80Z0FD00($00)
        blitz_TXXF80Z0FD00(arg5)
    Else
        blitz_TXXF80Z0FD00(arg4)
    EndIf
    T8D4B88X0F(arg3, banksize(arg3), $00)
    XFD24F6402(arg0, arg1, $00, $01, $00)
    Return $00
End Function
