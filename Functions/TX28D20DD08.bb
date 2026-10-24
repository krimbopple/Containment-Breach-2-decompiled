Function TX28D20DD08%(arg0.T484FFBZX)
    If ((arg0\Field0 + $01) > arg0\Field2) Then
        Return $00
    EndIf
    arg0\Field0 = (arg0\Field0 + $01)
    Return peekbyte(arg0\Field3, (arg0\Field0 - $01))
    Return $00
End Function
