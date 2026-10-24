Function TX4022X8Z0Z%(arg0%, arg1%, arg2%, arg3%)
    If (TX22286ZD4(arg0, arg1, arg2) <> $00) Then
        blitz_TXBFB002B8X0($FFFFFFFF)
        blitz_TXBFB002B8X0(arg2)
        If (arg3 >= $00) Then
            blitz_TXXF80Z0FD00(arg3)
        EndIf
        Y2DX0XD0D(arg0, arg1, arg2, Null)
        Return $01
    EndIf
    Return $00
    Return $00
End Function
