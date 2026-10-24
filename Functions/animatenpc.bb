Function animatenpc%(arg0.npcs, arg1#, arg2#, arg3#, arg4%)
    Local local0#
    Local local1#
    If (TXB2BFFFFFX() <> 0) Then
        arg0\Field54 = arg1
        arg0\Field16 = arg2
        arg0\Field52 = arg3
        arg0\Field78 = arg4
    EndIf
    If (0.0 < arg3) Then
        local0 = clamp((arg0\Field103 + (fps\Field3[$00] * arg3)), arg1, arg2)
        If ((arg4 And (arg2 <= local0)) <> 0) Then
            local0 = arg1
        EndIf
    Else
        If (arg2 > arg1) Then
            local1 = arg1
            arg1 = arg2
            arg2 = local1
        EndIf
        If (arg4 <> 0) Then
            local0 = (arg0\Field103 + (fps\Field3[$00] * arg3))
            If (arg2 > local0) Then
                local0 = arg1
            ElseIf (arg1 < local0) Then
                local0 = arg2
            EndIf
        Else
            local0 = clamp((arg0\Field103 + (fps\Field3[$00] * arg3)), arg2, arg1)
        EndIf
    EndIf
    setnpcframe(arg0, local0, $00)
    Return $00
End Function
