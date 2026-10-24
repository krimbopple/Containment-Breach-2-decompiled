Function TX4XB20D0X4%(arg0%, arg1#, arg2#, arg3#, arg4#)
    Local local0%
    Local local1%
    local0 = createbank($10)
    pokefloat(local0, $00, arg1)
    pokefloat(local0, $04, arg2)
    pokefloat(local0, $08, arg3)
    pokefloat(local0, $0C, arg4)
    local1 = X28DZX06F8(arg0, local0)
    freebank(local0)
    local0 = $00
    Return local1
    Return $00
End Function
