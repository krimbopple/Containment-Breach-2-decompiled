Function TXFX4ZX668%(arg0.TXB0X08F8BX, arg1%)
    If (arg0\Field2 <> $00) Then
        closefile(arg0\Field2)
    EndIf
    If (arg1 = $C8) Then
        arg0\Field5 = $04
    Else
        arg0\Field5 = $08
        deletefile(arg0\Field7)
    EndIf
    If (arg0\Field1 <> $00) Then
        XZ84DBF60Z(arg0\Field1, arg0)
    EndIf
    If (arg0 <> Null) Then
        If (arg0\Field6 <> $00) Then
            arg0\Field6 = $FFFFFFFF
            Return $00
        EndIf
        If (arg0\Field11 <> $00) Then
            freebank(arg0\Field11)
        EndIf
        If (arg0\Field12 <> $00) Then
            F20BZFB0F(arg0\Field12)
        EndIf
        Delete arg0
    EndIf
    Return $00
End Function
