Function T60BB22DB0%(arg0$, arg1$, arg2%, arg3%)
    Local local0.Z6ZDXXD84
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    local0 = (New Z6ZDXXD84)
    local0\Field2 = arg1
    local0\Field1 = arg2
    local0\Field4 = arg3
    F0Z646402(arg0, local1, local2)
    local0\Field3 = local2
    local0\Field0 = local1
    F0Z646402(TXB68F6DF06(), local3, local4)
    If (((local2 = local4) And (local3 = local1)) <> 0) Then
        TZX4482FFF = local0
    EndIf
    Return $00
End Function
