Function TXZXZ4460F2%(arg0%, arg1%, arg2%, arg3$, arg4%)
    Local local0%
    local0 = TXZ26D40ZFF(arg3, "\n")
    updatemenubutton(arg0, arg1, (Int ((Float arg2) - max((1.0 * menuscale), 1.0))), (Int (30.0 * menuscale)), T26ZD804D6(arg3, "\n", (Int min((Float arg4), (Float (local0 - $01))))), $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $01, $01)
    If (updatemenubutton((Int ((Float (arg0 + arg2)) - max((1.0 * menuscale), 1.0))), arg1, (Int (30.0 * menuscale)), (Int (30.0 * menuscale)), ">", $00, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
        arg4 = (arg4 + $01)
        If (arg4 >= local0) Then
            arg4 = $00
        EndIf
    EndIf
    Return arg4
    Return $00
End Function
