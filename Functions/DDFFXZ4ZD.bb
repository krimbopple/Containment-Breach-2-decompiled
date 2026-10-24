Function DDFFXZ4ZD.TF2ZXX8FZ(arg0$, arg1#)
    Local local0%
    Local local1.TF2ZXX8FZ
    Local local2%
    If (local0 = $00) Then
        Return Null
    EndIf
    local1 = (New TF2ZXX8FZ)
    local1\Field0 = local0
    local1\Field5 = arg1
    local1\Field7 = local2
    local1\Field3 = $00
    local1\Field8 = TX4ZXB8XZ26(arg0, $00, -1.0)
    T4ZZZF8Z80(local1, $00, $00)
    ResumeChannel(local1\Field8)
    Return local1
    Return Null
End Function
