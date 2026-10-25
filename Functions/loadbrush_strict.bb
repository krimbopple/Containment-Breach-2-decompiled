Function loadbrush_strict%(arg0$, arg1%, arg2#, arg3#)
    Local local0%
    If (filetype((lang\Field0 + arg0)) = $01) Then
        arg0 = (lang\Field0 + arg0)
    EndIf
    If (filetype(arg0) <> $01) Then
        runtimeerrorex(format(getlocalstring("runerr", "brush.notfound"), arg0, "%s"))
    EndIf
    local0 = loadbrush(arg0, arg1, arg2, arg3)
    GUESSEDloadstrict_2()
    Return local0
    Return $00
End Function
