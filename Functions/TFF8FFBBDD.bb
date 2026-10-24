Function TFF8FFBBDD%(arg0#, arg1#)
    If (XZB6BXFF02\Field10 <> 0) Then
        Return $00
    EndIf
    If ((opt\Field36 And ((opt\Field4 <> $00) Lor (opt\Field78 <> $00))) <> 0) Then
        XZB6BXFF02\Field11 = (Int ((Float opt\Field4) * menuscale))
        XZB6BXFF02\Field9 = (Int ((Float opt\Field78) * menuscale))
        XZB6BXFF02\Field10 = $01
        BD4D4Z0DZ()
        Return $00
    EndIf
    If (((XZB6BXFF02\Field11 <> (Int arg0)) Lor (XZB6BXFF02\Field9 <> (Int arg1))) <> 0) Then
        XZB6BXFF02\Field11 = (Int arg0)
        XZB6BXFF02\Field9 = (Int arg1)
        BD4D4Z0DZ()
    EndIf
    Return $00
End Function
