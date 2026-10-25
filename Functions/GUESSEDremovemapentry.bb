Function GUESSEDremovemapentry%(arg0%, arg1%, arg2%, arg3%)
    If (GUESSEDgetmap_2(arg0, arg1, arg2) <> $00) Then
        blitz_TXBFB002B8X0($FFFFFFFF)
        blitz_TXBFB002B8X0(arg2)
        If (arg3 >= $00) Then
            blitz_TXXF80Z0FD00(arg3)
        EndIf
        GUESSEDsetmap_5(arg0, arg1, arg2, Null)
        Return $01
    EndIf
    Return $00
    Return $00
End Function
