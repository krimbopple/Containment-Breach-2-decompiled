Function T20Z2BXFZ6F%(arg0$, arg1%, arg2%, arg3%, arg4%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4$
    Local local5%
    Local local6$
    If (arg2 < $01) Then
        arg2 = $800
    EndIf
    If (arg4 <> 0) Then
        arg0 = XX8XZZFFF(arg0)
    EndIf
    local0 = len(arg0)
    If (local0 = $00) Then
        Return $00
    EndIf
    local1 = $00
    local2 = $00
    local3 = $01
    local4 = ""
    For local5 = $01 To local0 Step $01
        local6 = mid(arg0, local5, $01)
        If (local6 = chr($03)) Then
            local4 = "X"
        Else
            local4 = local6
        EndIf
        local1 = (local1 + stringwidth(local4))
        If (local1 >= arg1) Then
            local2 = (local2 + arg3)
            local1 = $00
            If (local2 >= arg2) Then
                Return local3
            EndIf
            If (local5 < local0) Then
                local3 = (local3 + $01)
            EndIf
        EndIf
    Next
    Return local3
    Return $00
End Function
