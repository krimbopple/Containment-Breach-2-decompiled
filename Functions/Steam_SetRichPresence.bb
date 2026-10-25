Function Steam_SetRichPresence%(arg0$, arg1$)
    If (XD82FXFXF4 = $00) Then
        Return $00
    EndIf
    _Steam_SetRichPresence(arg0, arg1)
    Return $00
End Function
