Function GUESSEDloadfiletype%(arg0%, arg1$)
    If (filetype(arg1) <> $01) Then
        GUESSEDsetred((("Unable to preload texture with " + (Str arg0)) + " ID."))
        XD46204806[arg0] = "GFX\Other\error.png"
        Return $00
    EndIf
    XD46204806[arg0] = arg1
    Return $00
End Function
