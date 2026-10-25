Function GUESSEDcallentityeffect%(arg0%)
    If (XZ40D084Z4 = arg0) Then
        Return $00
    EndIf
    entityeffect(TX02ZXFF4BF, arg0)
    XZ40D084Z4 = arg0
    Return $00
End Function
