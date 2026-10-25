Function GUESSEDrenderrenderhud%(arg0#, arg1#)
    If (XZB6BXFF02\Field10 <> 0) Then
        Return $00
    EndIf
    If ((opt\Field36 And ((opt\Field4 <> $00) Lor (opt\Field78 <> $00))) <> 0) Then
        XZB6BXFF02\Field11 = (Int ((Float opt\Field4) * menuscale))
        XZB6BXFF02\Field9 = (Int ((Float opt\Field78) * menuscale))
        XZB6BXFF02\Field10 = $01
        GUESSEDsetglobal_4()
        Return $00
    EndIf
    If (((XZB6BXFF02\Field11 <> (Int arg0)) Lor (XZB6BXFF02\Field9 <> (Int arg1))) <> 0) Then
        XZB6BXFF02\Field11 = (Int arg0)
        XZB6BXFF02\Field9 = (Int arg1)
        GUESSEDsetglobal_4()
    EndIf
    Return $00
End Function
