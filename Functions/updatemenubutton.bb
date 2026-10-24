Function updatemenubutton%(arg0%, arg1%, arg2%, arg3%, arg4$, arg5%, arg6%, arg7%, arg8%, arg9%, arg10%, arg11%, arg12#, arg13%, arg14%)
    Local local0.menubutton
    Local local1.menubutton
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    local2 = $00
    local3 = $00
    local4 = mouseon(arg0, arg1, arg2, arg3)
    For local0 = Each menubutton
        If (((((local0\Field12 = arg0) And (local0\Field0 = arg1)) And (local0\Field7 = arg2)) And (local0\Field1 = arg3)) <> 0) Then
            local3 = $01
            Exit
        EndIf
    Next
    If (local3 = $00) Then
        local0 = (New menubutton)
        local0\Field12 = arg0
        local0\Field0 = arg1
        local0\Field7 = arg2
        local0\Field1 = arg3
        local0\Field13 = arg4
        local0\Field14 = arg5
        local0\Field5 = arg7
        local0\Field2 = arg8
        local0\Field8 = arg10
        local0\Field9 = arg9
        local0\Field11 = arg12
        local0\Field10 = arg13
        local0\Field3 = arg14
        If (local4 <> 0) Then
            local0\Field4 = 1.0
        EndIf
    Else
        local1 = local0
        local1\Field13 = arg4
        local1\Field14 = arg5
        local1\Field5 = arg7
        local1\Field11 = arg12
        local1\Field10 = arg13
        local1\Field3 = arg14
    EndIf
    local5 = (local0\Field5 And local0\Field10)
    If (arg14 = $00) Then
        If (local4 <> 0) Then
            If (((TDD0Z6BXB6\Field7 And (arg6 = $00)) Lor ((TDD0Z6BXB6\Field3 And arg6) And (TXZ20040BXX = (((arg0 + arg1) + arg2) + arg3)))) <> 0) Then
                If (arg7 <> 0) Then
                    If (arg11 <> 0) Then
                        playsound_strict(buttonsfx[$01], $00, $00)
                    EndIf
                Else
                    local2 = $01
                    If (arg11 <> 0) Then
                        playsound_strict(buttonsfx[$00], $00, $00)
                    EndIf
                EndIf
                If (arg6 <> 0) Then
                    TXZ20040BXX = $00
                EndIf
            EndIf
            If ((TDD0Z6BXB6\Field7 And arg6) <> 0) Then
                TXZ20040BXX = (((arg0 + arg1) + arg2) + arg3)
            EndIf
        EndIf
    EndIf
    If (local5 <> 0) Then
        local0\Field4 = 1.0
    ElseIf ((local4 And (local0\Field10 = $00)) <> 0) Then
        local0\Field4 = blitz_C4X60DZD20(1.0, local0\Field4, 3.0, $01)
    Else
        local0\Field4 = blitz_C4X60DZD20(0.0, local0\Field4, 3.0, $01)
    EndIf
    Return local2
    Return $00
End Function
