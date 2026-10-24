Function stripabsolutepath$(arg0$, arg1$)
    Local local0%
    local0 = instr(lower(arg0), arg1, $01)
    If (local0 > $00) Then
        arg0 = mid(arg0, local0, $FFFFFFFF)
    EndIf
    Return arg0
    Return ""
End Function
