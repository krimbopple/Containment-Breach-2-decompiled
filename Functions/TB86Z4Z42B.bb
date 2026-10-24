Function TB86Z4Z42B%(arg0%, arg1$)
    If (filetype(arg1) <> $01) Then
        X08D2FXZ42((("Unable to preload object with " + (Str arg0)) + " ID."))
        C0XBX4F22[arg0] = "GFX\Items\error.b3d"
        Return $00
    EndIf
    C0XBX4F22[arg0] = arg1
    Return $00
End Function
