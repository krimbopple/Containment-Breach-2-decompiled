Function XZ820X6024%(arg0%, arg1%)
    Local local0.TXX0ZX4BDF2
    local0 = XDDF2F228D(arg0)
    If ((((local0 = Null) Lor (arg1 < $00)) Lor (arg1 >= $40)) <> 0) Then
        Return $00
    EndIf
    Return (local0\Field3[arg1] <> Null)
    Return $00
End Function
