Function GUESSEDcreateentity%(arg0.TX2BF6X0FF4)
    If (arg0\Field31 <> $00) Then
        Return $00
    EndIf
    arg0\Field31 = createpivot($00)
    nameentity(arg0\Field31, ("P:" + (Str (Handle arg0))))
    entitypickmode(arg0\Field31, $01, $00)
    entitytype(arg0\Field31, $09, $00)
    Return $00
End Function
