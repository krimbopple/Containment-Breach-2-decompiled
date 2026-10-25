Function GUESSEDcreateupdatemainmenu%(arg0%, arg1%, arg2%, arg3%, arg4$, arg5%, arg6#, arg7%)
    Local local0.TX6BX06BD28
    Local local1.TX6BX06BD28
    Local local2%
    local2 = $00
    For local0 = Each TX6BX06BD28
        If (((((local0\Field3 = arg0) And (local0\Field0 = arg1)) And (local0\Field7 = arg2)) And (local0\Field1 = arg3)) <> 0) Then
            local2 = $01
            Exit
        EndIf
    Next
    If (local2 = $00) Then
        local0 = (New TX6BX06BD28)
        local0\Field3 = arg0
        local0\Field0 = arg1
        local0\Field7 = arg2
        local0\Field1 = arg3
        local0\Field6 = arg4
        local0\Field5 = arg6
        local0\Field4 = arg5
        local0\Field2 = arg7
    Else
        local1 = local0
        local1\Field6 = arg4
        local1\Field5 = arg6
        local1\Field4 = arg5
        local1\Field2 = arg7
    EndIf
    Return $00
End Function
