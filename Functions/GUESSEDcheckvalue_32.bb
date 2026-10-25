Function GUESSEDcheckvalue_32.TB86B8F2BX(arg0%, arg1%)
    Local local0.TXX0ZX4BDF2
    local0 = GUESSEDcheckvalue_36(arg0)
    If ((((local0 = Null) Lor (arg1 < $00)) Lor (arg1 >= $40)) <> 0) Then
        Return Null
    EndIf
    If (local0\Field3[arg1] = Null) Then
        local0\Field3[arg1] = (New TB86B8F2BX)
    EndIf
    Return local0\Field3[arg1]
    Return Null
End Function
