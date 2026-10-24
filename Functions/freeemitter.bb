Function freeemitter%(arg0.emitter, arg1%)
    If (arg1 <> 0) Then
        freeentity(arg0\Field2)
    Else
        arg0\Field9 = $01
    EndIf
    Return $00
End Function
