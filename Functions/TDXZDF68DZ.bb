Function TDXZDF68DZ%(arg0.TX2BF6X0FF4, arg1%)
    Local local0%
    Local local1%
    local0 = XZZF4F4DZ0(D460D4FZZ[arg1])
    If (local0 = $00) Then
        Return $00
    EndIf
    If (T2FFB8B2F0() >= arg0\Field16[arg1]) Then
        arg0\Field15[arg1] = $00
        arg0\Field16[arg1] = (T2FFB8B2F0() + local0)
        Return $00
    EndIf
    local1 = TFDFXFF244(D460D4FZZ[arg1])
    arg0\Field15[arg1] = (arg0\Field15[arg1] + $01)
    Return (arg0\Field15[arg1] >= local1)
    Return $00
End Function
