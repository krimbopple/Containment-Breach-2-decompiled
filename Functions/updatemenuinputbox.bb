Function updatemenuinputbox$(arg0%, arg1%, arg2%, arg3%, arg4$, arg5%, arg6%, arg7%, arg8#, arg9%, arg10%, arg11%)
    Local local0.menuinputbox
    Local local1.menuinputbox
    Local local2%
    Local local3%
    Local local4$
    Local local5%
    local2 = $00
    For local0 = Each menuinputbox
        If (((((local0\Field3 = arg0) And (local0\Field0 = arg1)) And (local0\Field7 = arg2)) And (local0\Field1 = arg3)) <> 0) Then
            local2 = $01
            Exit
        EndIf
    Next
    If (local2 = $00) Then
        local0 = (New menuinputbox)
        local0\Field3 = arg0
        local0\Field0 = arg1
        local0\Field7 = arg2
        local0\Field1 = arg3
        local0\Field6 = arg4
        local0\Field4 = arg5
        local0\Field5 = arg6
        local0\Field10 = arg8
        local0\Field2 = arg9
        local0\Field9 = arg10
        local0\Field8 = arg11
    Else
        local1 = local0
        local1\Field6 = arg4
        local1\Field4 = arg5
        local1\Field10 = arg8
        local1\Field2 = arg9
        local1\Field9 = arg10
        local1\Field8 = arg11
    EndIf
    local3 = mouseon(arg0, arg1, arg2, arg3)
    If (local0\Field2 = $00) Then
        setfontex(XD00026ZX2\Field0[arg5])
        local4 = arg4
        If (((1.0 <> arg8) And (stringwidth(local4) > (arg2 - (stringwidth("A") Shl $01)))) <> 0) Then
            local4 = right(local4, (Int max((Float ((arg2 - (stringwidth("A") Shl $01)) / stringwidth("A"))), 0.0)))
        EndIf
        local5 = (Int ((((Float (arg2 Sar $01)) * arg8) + (Float arg0)) - (Float ((stringwidth(local4) Sar $01) * (1.0 = arg8)))))
        If (local3 <> 0) Then
            If (TDD0Z6BXB6\Field7 <> 0) Then
                selectedinputbox = arg6
                flushkeys()
                cursorpos = XXF4D24BF(local4, local5)
                TZFXXZB824 = cursorpos
            EndIf
        EndIf
        If ((((local3 = $00) And TDD0Z6BXB6\Field7) And (selectedinputbox = arg6)) <> 0) Then
            selectedinputbox = $00
            cursorpos = $FFFFFFFE
            TZFXXZB824 = $FFFFFFFF
        EndIf
        If (selectedinputbox = arg6) Then
            If (TDD0Z6BXB6\Field1 <> 0) Then
                cursorpos = XXF4D24BF(local4, local5)
            EndIf
            If (local0\Field8 = $00) Then
                arg4 = updateinput(arg4, arg7)
            EndIf
            ZFF8X2F22 = $01
        EndIf
    EndIf
    Return arg4
    Return ""
End Function
