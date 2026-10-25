Function GUESSEDsetmap%(arg0.T20BFZFZ62X, arg1%)
    If ((((GUESSEDupdatexdb() <> $00) And (GUESSEDupdateanimatenpc() = $00)) And (arg1 = $00)) <> 0) Then
        Return $00
    EndIf
    If (arg0\Field2 <> $00) Then
        _I2IMapErase(T2X0XXBX084\Field1[$03], arg0\Field2)
    EndIf
    If (arg1 = $00) Then
        arg1 = (Handle arg0)
    EndIf
    arg0\Field2 = arg1
    _I2IMapSet(T2X0XXBX084\Field1[$03], arg0\Field2, arg0)
    If (GUESSEDupdateanimatenpc() <> 0) Then
        _IntVectorPushBack(T2X0XXBX084\Field0[$03], arg0)
    EndIf
    Return $00
End Function
