Function renderbar%(arg0%, arg1%, arg2%, arg3%, arg4%, arg5#, arg6#, arg7%, arg8%, arg9%, arg10%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4#
    Local local5%
    Local local6%
    Local local7#
    Local local8%
    Local local9#
    Local local10%
    local0 = colorred()
    local1 = colorgreen()
    local2 = colorblue()
    local3 = (Int max(1.0, (Float (Int ((1.0 * menuscale) + 0.5)))))
    local4 = clamp((arg5 / arg6), 0.0, 1.0)
    local5 = (arg3 - (local3 Shl $01))
    local6 = (arg4 - (local3 Shl $01))
    color($48, $48, $48, $FF)
    rect(arg1, arg2, arg3, arg4, $01)
    color($20, $20, $20, $FF)
    rect((arg1 + local3), (arg2 + local3), local5, local6, $01)
    If (0.0 < local4) Then
        local7 = ((Float local5) * local4)
        local8 = (Int local7)
        local9 = (local7 - (Float local8))
        If (local8 > $00) Then
            color(arg7, arg8, arg9, $FF)
            rect((arg1 + local3), (arg2 + local3), local8, local6, $01)
        EndIf
        If (((0.0 < local9) And (local8 < local5)) <> 0) Then
            local10 = (Int (local9 * 255.0))
            color(arg7, arg8, arg9, local10)
            rect(((arg1 + local3) + local8), (arg2 + local3), $01, local6, $01)
        EndIf
    EndIf
    color(local0, local1, local2, $FF)
    Return $00
End Function
