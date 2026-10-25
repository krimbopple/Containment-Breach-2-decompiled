Function GUESSEDfreedeque%(arg0.TDZZ808BFD)
    If (arg0\Field13 <> Null) Then
        arg0\Field13\Field17 = $00
    EndIf
    freebank(arg0\Field29)
    _FreeDeque(arg0\Field30)
    Delete arg0
    Return $00
End Function
