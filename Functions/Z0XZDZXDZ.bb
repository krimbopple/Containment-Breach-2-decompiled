Function Z0XZDZXDZ%(arg0.TF2ZXX8FZ, arg1%)
    If (arg0 = Null) Then
        Return $00
    EndIf
    If (arg0\Field1 <> $00) Then
        Z48DX28B8(X84X0XD2BF, arg0\Field1)
    EndIf
    If (arg1 = $00) Then
        Return $00
    EndIf
    TX8F6BXF642(X84X0XD2BF, arg1, arg0)
    arg0\Field1 = arg1
    Return $00
End Function
