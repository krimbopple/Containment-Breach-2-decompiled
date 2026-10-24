Function loadimage_strict%(arg0$)
    Local local0%
    If (filetype((lang\Field0 + arg0)) = $01) Then
        arg0 = (lang\Field0 + arg0)
    EndIf
    If (filetype(arg0) <> $01) Then
        runtimeerrorex(format(getlocalstring("runerr", "image.notfound"), arg0, "%s"))
    EndIf
    local0 = loadimage(arg0, $00)
    If (local0 = $00) Then
        runtimeerrorex(format(getlocalstring("runerr", "image.failed.load"), arg0, "%s"))
    EndIf
    XB04X8D680()
    Return local0
    Return $00
End Function
