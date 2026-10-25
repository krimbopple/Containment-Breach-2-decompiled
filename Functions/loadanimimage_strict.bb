Function loadanimimage_strict%(arg0$, arg1%, arg2%, arg3%, arg4%)
    Local local0%
    If (filetype((lang\Field0 + arg0)) = $01) Then
        arg0 = (lang\Field0 + arg0)
    EndIf
    If (filetype(arg0) <> $01) Then
        runtimeerrorex(format(getlocalstring("runerr", "animimage.notfound"), arg0, "%s"))
    EndIf
    local0 = loadanimimage(arg0, arg1, arg2, arg3, arg4)
    If (local0 = $00) Then
        runtimeerrorex(format(getlocalstring("runerr", "animimage.failed.load"), arg0, "%s"))
    EndIf
    GUESSEDloadstrict_2()
    Return local0
    Return $00
End Function
