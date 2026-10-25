Function GUESSEDdrawscaledrect%(arg0%, arg1%, arg2%, arg3%, arg4%, arg5#, arg6%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    local0 = colorred()
    local1 = colorgreen()
    local2 = colorblue()
    local3 = coloralpha()
    color((Int ((Float local0) * arg5)), (Int ((Float local1) * arg5)), (Int ((Float local2) * arg5)), local3)
    rect((arg0 + $01), (arg1 - $01), (arg2 - $02), $01, $01)
    If (((arg3 > arg2) Lor (arg6 = $00)) <> 0) Then
        rect((arg0 - $01), (arg1 + $01), $01, (arg3 - $02), $01)
    EndIf
    rect((arg0 + arg2), (arg1 + $01), $01, (arg3 - $02), $01)
    If (((arg2 > arg3) Lor (arg6 = $00)) <> 0) Then
        rect((arg0 + $01), (arg1 + arg3), (arg2 - $02), $01, $01)
    EndIf
    color(local0, local1, local2, local3)
    rect(arg0, arg1, arg2, arg3, arg4)
    Return $00
End Function
