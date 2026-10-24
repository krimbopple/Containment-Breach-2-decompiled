Function X602XX6ZF6%(arg0%, arg1%, arg2%, arg3%, arg4%)
    Local local0%
    local0 = graphicsbuffer()
    setbuffer(arg0, $00, $00)
    clscolor(arg1, arg2, arg3, arg4)
    cls()
    setbuffer(local0, $00, $00)
    Return $00
End Function
