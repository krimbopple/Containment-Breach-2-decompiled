Function limittextwithimage%(arg0$, arg1%, arg2%, arg3%, arg4%, arg5%)
    Local local0%
    If (arg4 <> $00) Then
        stringheight(arg0)
        imageheight(arg4)
        drawblock(arg4, arg1, arg5, $00)
        local0 = imagewidth(arg4)
    EndIf
    limittext(arg0, ((arg1 + $03) + local0), arg2, ((arg3 - local0) - $03))
    Return $00
End Function
