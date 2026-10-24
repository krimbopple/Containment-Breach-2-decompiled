Function updatelauncherbuttonwithimage%(arg0%, arg1%, arg2%, arg3%, arg4$, arg5%, arg6%, arg7%, arg8%)
    Local local0%
    arg4 = (string(" ", (imagewidth(arg6) Sar $02)) + arg4)
    local0 = updatelauncherbutton(arg0, arg1, arg2, arg3, arg4, arg5, $00, arg8, $FF, $FF, $FF)
    imageheight(arg6)
    drawimage(arg6, ((((arg2 Sar $01) + arg0) - (stringwidth(arg4) Sar $01)) - $03), arg7, $00)
    Return local0
    Return $00
End Function
