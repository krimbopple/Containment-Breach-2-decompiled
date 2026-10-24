Function LoopSound%(arg0%, arg1%)
    Local local0%
    TX848600ZFD(arg0, T2X868F684())
    local0 = peekint(T2X868F684(), $0C)
    If (arg1 <> 0) Then
        local0 = (local0 Or $04)
    Else
        local0 = (local0 And (local0 Xor $04))
    EndIf
    XDD60DBZX6(arg0, T2X868F684())
    Return $00
End Function
