Function MP_ParseServerAddress%(arg0$)
    Local local0%
    Local local1$
    Local local2%
    Local local3$
    Local local4%
    local0 = instr(arg0, "#", $01)
    If (local0 > $00) Then
        arg0 = left(arg0, (local0 - $01))
    EndIf
    local1 = trim(_SplitString(arg0, ":", $00))
    If (local1 = "") Then
        Return $00
    EndIf
    local2 = $01
    Repeat
        local3 = _SplitString(arg0, ":", local2)
        If (local3 = "") Then
            Exit
        EndIf
        local4 = (Int trim(local3))
        GUESSEDcreatedotted(local1, local4, $00)
        local2 = (local2 + $01)
    Forever
    Return $00
End Function
