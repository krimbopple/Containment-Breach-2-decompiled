Function X02FXD2BF6%(arg0.items, arg1%)
    If ((((X4BX024DX0() <> $00) And (TXB2BFFFFFX() = $00)) And (arg1 = $00)) <> 0) Then
        Return $00
    EndIf
    If (arg0\Field27 <> $00) Then
        Z48DX28B8(T2X0XXBX084\Field1[$00], arg0\Field27)
    EndIf
    If (arg1 = $00) Then
        arg1 = (Handle arg0)
    EndIf
    arg0\Field27 = arg1
    TX8F6BXF642(T2X0XXBX084\Field1[$00], arg0\Field27, arg0)
    If (TXB2BFFFFFX() <> 0) Then
        TZ2XXFDD24(T2X0XXBX084\Field0[$00], arg0)
    EndIf
    Return $00
End Function
