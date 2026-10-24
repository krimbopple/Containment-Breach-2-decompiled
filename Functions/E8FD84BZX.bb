Function E8FD84BZX%(arg0$)
    Local local0.X2B8DB2B8X
    Local local1%
    XF2FX4F0X2(TXZ8ZB88X62, arg0)
    local0 = eax_0005
    If (local0 <> Null) Then
        Return (Handle local0)
    EndIf
    local1 = LoadSound(arg0)
    If (local1 = $00) Then
        Return $00
    EndIf
    local0 = (New X2B8DB2B8X)
    local0\Field0 = arg0
    local0\Field1 = local1
    YFZ8BD2F6(TXZ8ZB88X62, arg0, local0)
    Return (Handle local0)
    Return $00
End Function
