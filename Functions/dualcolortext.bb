Function dualcolortext%(arg0%, arg1%, arg2$, arg3$, arg4%, arg5%, arg6%, arg7%, arg8%, arg9%)
    Local local0%
    Local local1%
    Local local2%
    local0 = colorred()
    local1 = colorgreen()
    local2 = colorblue()
    color(arg4, arg5, arg6, $FF)
    textex(arg0, arg1, arg2, $00, $00)
    color(arg7, arg8, arg9, $FF)
    textex((stringwidth(arg2) + arg0), arg1, arg3, $00, $00)
    color(local0, local1, local2, $FF)
    Return $00
End Function
