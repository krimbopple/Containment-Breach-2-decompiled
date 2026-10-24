Function loadfont_strict%(arg0$, arg1%, arg2%)
    Local local0%
    If (filetype((lang\Field0 + arg0)) = $01) Then
        arg0 = (lang\Field0 + arg0)
    EndIf
    If (filetype(arg0) <> $01) Then
        runtimeerrorex(format(getlocalstring("runerr", "font.notfound"), arg0, "%s"))
    EndIf
    local0 = loadfont(arg0, (((Int (((Float opt\Field46) / 1024.0) * (Float arg1))) * (arg2 = $00)) + (arg2 * arg1)), $00, $00, $00, $01)
    If (local0 = $00) Then
        runtimeerrorex(format(getlocalstring("runerr", "font.failed.load"), arg0, "%s"))
    EndIf
    Return local0
    Return $00
End Function
