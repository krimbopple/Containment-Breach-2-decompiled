Function TXZ864XD40Z%(arg0$, arg1%, arg2%, arg3%, arg4%, arg5%, arg6%, arg7#, arg8#)
    Local local0%
    Local local1%
    Local local2$
    Local local3%
    Local local4$
    Local local5$
    Local local6%
    batching($01)
    local0 = $00
    local1 = $00
    If (arg4 < $01) Then
        arg4 = $800
    EndIf
    If (arg6 <> 0) Then
        arg0 = XX8XZZFFF(arg0)
    EndIf
    local3 = len(arg0)
    local4 = ""
    local5 = ""
    For local6 = $01 To local3 Step $01
        local2 = mid(arg0, local6, $01)
        If (local2 = chr($03)) Then
            local5 = "X"
        Else
            local5 = local2
        EndIf
        local0 = (local0 + stringwidth(local5))
        local4 = (local4 + local2)
        If (local0 >= arg3) Then
            Z4X448BD2(arg1, arg2, local4, arg6, arg7, arg8)
            local4 = ""
            arg2 = (arg2 + arg5)
            local1 = (local1 + arg5)
            local0 = $00
            If (local1 >= arg4) Then
                Exit
            EndIf
        EndIf
    Next
    If (local4 <> "") Then
        Z4X448BD2(arg1, arg2, local4, arg6, arg7, arg8)
    EndIf
    batching($00)
    Return $00
End Function
