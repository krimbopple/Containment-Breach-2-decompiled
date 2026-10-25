Function GUESSEDsetmap_6%(arg0.TF2ZXX8FZ, arg1%)
    If (arg0 = Null) Then
        Return $00
    EndIf
    If (arg0\Field1 <> $00) Then
        _I2IMapErase(X84X0XD2BF, arg0\Field1)
    EndIf
    If (arg1 = $00) Then
        Return $00
    EndIf
    _I2IMapSet(X84X0XD2BF, arg1, arg0)
    arg0\Field1 = arg1
    Return $00
End Function
