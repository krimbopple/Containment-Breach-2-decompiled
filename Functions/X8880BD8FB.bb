Function X8880BD8FB%(arg0.T6068XB4Z2, arg1%)
    If ((((X4BX024DX0() <> $00) And (TXB2BFFFFFX() = $00)) And (arg1 = $00)) <> 0) Then
        Return $00
    EndIf
    If (arg0\Field30 <> $00) Then
        Z48DX28B8(T2X0XXBX084\Field1[$05], arg0\Field30)
    EndIf
    If (arg1 = $00) Then
        arg1 = (Handle arg0)
    EndIf
    arg0\Field30 = arg1
    TX8F6BXF642(T2X0XXBX084\Field1[$05], arg1, arg0)
    If (TXB2BFFFFFX() <> 0) Then
        TZ2XXFDD24(T2X0XXBX084\Field0[$05], arg0)
    EndIf
    Return $00
End Function
