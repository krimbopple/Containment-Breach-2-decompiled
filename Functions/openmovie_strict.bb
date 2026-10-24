Function openmovie_strict%(arg0$)
    Local local0%
    If (filetype((lang\Field0 + arg0)) = $01) Then
        arg0 = (lang\Field0 + arg0)
    EndIf
    If (filetype(arg0) <> $01) Then
        runtimeerrorex(format(getlocalstring("runerr", "movie.notfound"), arg0, "%s"))
    EndIf
    local0 = openmovie(arg0)
    If (local0 = $00) Then
        runtimeerrorex(format(getlocalstring("runerr", "movie.failed.load"), arg0, "%s"))
    EndIf
    Return local0
    Return $00
End Function
