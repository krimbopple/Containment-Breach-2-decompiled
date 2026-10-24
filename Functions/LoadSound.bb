Function LoadSound%(arg0$)
    Local local0%
    local0 = TZBD40DX0F($00, arg0, $00, $00, $00, $08, $00)
    If (local0 <> $00) Then
        TX848600ZFD(local0, T2X868F684())
        pokefloat(T2X868F684(), $04, 0.0)
        XDD60DBZX6(local0, T2X868F684())
    EndIf
    Return local0
    Return $00
End Function
