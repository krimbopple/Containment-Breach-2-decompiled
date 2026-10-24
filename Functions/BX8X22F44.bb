Function BX8X22F44%(arg0%, arg1%, arg2%, arg3%)
    Local local0.TB86B8F2BX
    Local local1.TB86B8F2BX
    If (arg3 = $FFFFFFFF) Then
        arg3 = arg1
    EndIf
    local0 = X644BX6FZ0(arg0, arg1)
    local1 = X644BX6FZ0(arg2, arg3)
    If (((local0 = Null) Lor (local1 = Null)) <> 0) Then
        Return $00
    EndIf
    local1\Field5 = local0\Field5
    local1\Field8 = local0\Field8
    local1\Field4 = local0\Field4
    local1\Field3 = local0\Field3
    local1\Field0 = local0\Field0
    local1\Field2 = local0\Field2
    local1\Field1 = local0\Field1
    local1\Field7 = local0\Field7
    Return $00
End Function
