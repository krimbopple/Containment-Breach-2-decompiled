Function GUESSEDgetlower$(arg0$)
    Local local0%
    local0 = instr(arg0, "#", $01)
    If (local0 > $00) Then
        Return lower(trim(mid(arg0, (local0 + $01), $FFFFFFFF)))
    EndIf
    Return ""
    Return ""
End Function
