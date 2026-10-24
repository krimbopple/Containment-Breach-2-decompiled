Function BZZ00B6FF%(arg0%, arg1$)
    If (filetype(arg1) <> $01) Then
        X08D2FXZ42((("Unable to preload texture with " + (Str arg0)) + " ID."))
        XD46204806[arg0] = "GFX\Other\error.png"
        Return $00
    EndIf
    XD46204806[arg0] = arg1
    Return $00
End Function
