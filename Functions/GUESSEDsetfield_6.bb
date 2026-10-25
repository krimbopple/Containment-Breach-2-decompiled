Function GUESSEDsetfield_6%(arg0.T402X2Z846, arg1%)
    If (arg0\Field12 <> Null) Then
        GUESSEDsetfield_16(arg0\Field12)
    EndIf
    If (arg1 <> 0) Then
        arg0\Field1 = ""
    EndIf
    arg0\Field4 = ""
    arg0\Field24 = $00
    arg0\Field0 = $00
    arg0\Field12 = Null
    Return $00
End Function
