Function B8280DF4D.TF2ZXX8FZ(arg0%, arg1#, arg2%)
    Local local0.TF2ZXX8FZ
    If (arg0 = $00) Then
        Return Null
    EndIf
    local0 = (New TF2ZXX8FZ)
    local0\Field0 = arg0
    local0\Field5 = arg1
    local0\Field3 = (arg2 = $00)
    local0\Field8 = PlaySound(YX2F8DDDFD((Object.X2B8DB2B8X local0\Field0)), -1.0)
    T4ZZZF8Z80(local0, $00, $00)
    ResumeChannel(local0\Field8)
    Return local0
    Return Null
End Function
